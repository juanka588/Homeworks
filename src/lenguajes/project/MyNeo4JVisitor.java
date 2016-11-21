/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Pattern;

/**
 *
 * @author JuanCamilo
 */
public class MyNeo4JVisitor<T> extends Neo4JBaseVisitor<T> {

    private static final Pattern NUMBER_PATTERN = Pattern.compile("[0-9]+([.][0-9]*)?");

    @Override
    public T visitInit(Neo4JParser.InitContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (Neo4JParser.CreateContext create : ctx.create()) {
            sb.append(visit(create));
        }
        for (Neo4JParser.Select_sentenceContext select : ctx.select_sentence()) {
            sb.append(visit(select));
        }
        return (T) sb.toString();
    }

    //MATCH basic_query opt_where RETURN exp (TOKEN_COMA exp)* (TOKEN_FIN_LINEA|);
    @Override
    public T visitSelect_sentence(Neo4JParser.Select_sentenceContext ctx) {
        List<SQLSentence> fourElements = null;
        for (Neo4JParser.Basic_queryContext basic_query : ctx.basic_query()) {
            fourElements = (ArrayList<SQLSentence>) visit(basic_query);
        }
        SQLSentence where = (SQLSentence) visit(ctx.opt_where());
        StringBuilder projection = new StringBuilder("");
        int i = 0;
        String text;
        for (Neo4JParser.ExpContext exp : ctx.exp()) {
            text = exp.getText();
            //TODO: fix problem with functions
            if (!text.contains(".") && !text.contains("(")) {
                text = text + ".*";
            }
            projection.append(text);
            if (i != ctx.exp().size() - 1) {
                projection.append(",");
            }
            i++;
        }
        SQLSentence tableCreation1 = fourElements.get(0);
        String result;
        if (fourElements.size() == 2) {
            result = singleSelect(tableCreation1, ctx, projection.toString(), where.getTranslation());
        } else {
            result = doubleSelect(tableCreation1, fourElements.get(2),
                    projection.toString(), where.getTranslation(),
                    fourElements.get(4).getTranslation());
        }

        return (T) result;
    }

    @Override
    public T visitOpt_where(Neo4JParser.Opt_whereContext ctx) {
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        for (Neo4JParser.ExpContext exp : ctx.exp()) {
            sb.append(exp.getText());
            if (i != ctx.exp().size() - 1) {
                sb.append(" AND ");
            }
            i++;
        }
        SQLSentence sqlSentence = new SQLSentence();
        sqlSentence.setTranslation(sb.toString());
        return (T) sqlSentence;
    }

    @Override
    public T visitBasic_query(Neo4JParser.Basic_queryContext ctx) {
        List<SQLSentence> leftTable = (List<SQLSentence>) visit(ctx.node_def(0));
        if (ctx.node_def(1) == null) {
            return (T) leftTable;
        }
        List<SQLSentence> rightTable = (List<SQLSentence>) visit(ctx.node_def(1));
        leftTable.addAll(rightTable);
        String label = (String) visit(ctx.relation_type());
        SQLSentence sql = new SQLSentence();
        sql.setTranslation(label);
        leftTable.add(sql);
        return (T) new ArrayList<>(leftTable);
    }

    @Override
    public T visitCreate(Neo4JParser.CreateContext ctx) {
        T visitInit = visit(ctx.opt_create());
        return visitInit;
    }

    @Override
    public T visitCreate_multiple(Neo4JParser.Create_multipleContext ctx) {
        StringBuilder sb = new StringBuilder(), tableDef = new StringBuilder();
        List<SQLSentence> sentences;
        Map<String, TableDefinition> tds = new HashMap<>();
        String tableName;
        for (Neo4JParser.Node_defContext node_def : ctx.node_def()) {
            sentences = (List<SQLSentence>) visit(node_def);
            tableName = sentences.get(0).getTableName();
            if (tds.containsKey(tableName)) {
                tds.put(tableName, TableDefinition.fussion(tds.get(tableName), (TableDefinition) sentences.get(0)));
            } else {
                tds.put(tableName, (TableDefinition) sentences.get(0));
            }
            sb.append(sentences.get(1).getTranslation());
        }
        tds.forEach((k, v) -> tableDef.append(v.getTranslation()));
        return (T) tableDef.append(sb).toString();
    }

    @Override
    public T visitNode_def(Neo4JParser.Node_defContext ctx) {
        return visit(ctx.definition());
    }

    @Override
    public T visitCreate_relation(Neo4JParser.Create_relationContext ctx) {
        StringBuilder sb = new StringBuilder(), tableDef = new StringBuilder();
        List<SQLSentence> sentences;
        Map<String, TableDefinition> tds = new HashMap<>();
        String tableName;
        for (Neo4JParser.Relation_defContext node_def : ctx.relation_def()) {
            sentences = (List<SQLSentence>) visit(node_def);
            tableName = sentences.get(0).getTableName();
            if (tds.containsKey(tableName)) {
                tds.put(tableName, TableDefinition.fussion(tds.get(tableName), (TableDefinition) sentences.get(0)));
            } else {
                tds.put(tableName, (TableDefinition) sentences.get(0));
            }
            sb.append(sentences.get(1).getTranslation());
        }
        tds.forEach((k, v) -> tableDef.append(v.getTranslation()));
        return (T) tableDef.append(sb).toString();
    }

    @Override
    public T visitRelation_def(Neo4JParser.Relation_defContext ctx) {
        List<SQLSentence> result = new ArrayList<>(2);
        List<SQLSentence> leftTable = (List<SQLSentence>) visit(ctx.node_def(0));
        List<SQLSentence> rightTable = (List<SQLSentence>) visit(ctx.node_def(1));
        String label = (String) visit(ctx.relation_type());

        SortedSet<PropertyNeo4J> originProps, destinantionProps;
        String tname1 = leftTable.get(0).getTableName(), tname2 = rightTable.get(0).getTableName();
        String joinTableName, origin = tname1, destinantion = tname2;
        originProps = leftTable.get(0).getProperties();
        destinantionProps = rightTable.get(0).getProperties();
        if (tname1.compareToIgnoreCase(tname2) > 0) {
            origin = tname2;
            destinantion = tname1;
            originProps = rightTable.get(0).getProperties();
            destinantionProps = leftTable.get(0).getProperties();
        }
        joinTableName = origin + "_" + destinantion;

        SortedSet<PropertyNeo4J> props = new TreeSet<>();
        props.add(new PropertyNeo4J("origin", origin, "INT(11) NOT NULL", "=", true));
        props.add(new PropertyNeo4J("destination", destinantion, "INT(11) NOT NULL", "=", true));
        props.add(new PropertyNeo4J("label", "Label", "INT(11) NOT NULL", "=", true));
        result.add(new TableDefinition("", joinTableName, props));
        result.add(new ComplexInsertSentence(joinTableName, origin, destinantion,
                originProps, destinantionProps, label));
        return (T) result;
    }

    @Override
    public T visitSimple_relation(Neo4JParser.Simple_relationContext ctx) {
        return (T) "";
    }

    @Override
    public T visitDirected_relation(Neo4JParser.Directed_relationContext ctx) {
        return (T) "";
    }

    @Override
    public T visitComplex_relation(Neo4JParser.Complex_relationContext ctx) {
        if (ctx.LABEL() == null) {
            return (T) "";
        }
        return (T) ctx.LABEL().getText();
    }

    @Override
    public T visitDefinition(Neo4JParser.DefinitionContext ctx) {
        String tableName = ctx.LABEL().getText();
        String alias = ctx.ID().getText();
        SortedSet<PropertyNeo4J> properties = new TreeSet<>();
        if (ctx.props_list() != null) {
            properties = (TreeSet<PropertyNeo4J>) visit(ctx.props_list());
        }
        List<SQLSentence> sentences = new ArrayList<>(2);
        sentences.add(new TableDefinition(alias, tableName, properties));
        sentences.add(new InsertSentence(alias, tableName, properties));
        return (T) sentences;
    }

    @Override
    public T visitProps_list(Neo4JParser.Props_listContext ctx) {
        SortedSet<PropertyNeo4J> props = new TreeSet<>();
        for (Neo4JParser.PropContext prop : ctx.prop()) {
            props.add((PropertyNeo4J) visit(prop));
        }
        return (T) props;
    }

    @Override
    public T visitProperty(Neo4JParser.PropertyContext ctx) {
        PropertyNeo4J prop;
        String name = ctx.ID().getText();
        String value = ctx.exp().getText();
        String type = getType(value);
        prop = new PropertyNeo4J(name, value, type, "=");
        return (T) prop;
    }

    @Override
    public T visitQuery_cond(Neo4JParser.Query_condContext ctx) {
        PropertyNeo4J prop;
        String name = ctx.ID().getText();
        String value = ctx.exp().getText();
        String type = "";
        String relop = ctx.rel_opt().getText();
        prop = new PropertyNeo4J(name, value, type, relop);
        return (T) prop;
    }

    private String getType(String value) {
        if (value.contains("&") || value.contains("|") || value.contains("<")
                || value.contains("=") || value.contains(">") || value.toLowerCase().contains("true")
                || value.toLowerCase().contains("false")) {
            return "TINYINT(1)";
        }
        if (value.contains("\"") || value.contains("\'")) {
            return "VARCHAR(255)";
        }
        if (value.contains("\"") || value.contains("\'")) {
            return "VARCHAR(255)";
        }
        if (NUMBER_PATTERN.matcher(value).matches()) {
            return "FLOAT(64)";
        }
        System.out.println("value " + value);
        throw new IllegalStateException("type can not be infered");

    }

    private String singleSelect(SQLSentence tableCreation1,
            Neo4JParser.Select_sentenceContext ctx, String projection, String where) {

        StringBuilder result = new StringBuilder();
        if (ctx.RETURN() != null) {
            result.append("SELECT ");
            result.append(projection);
            result.append(" FROM ");
            result.append(tableCreation1.getTableName());
            result.append(" AS ");
            result.append(tableCreation1.getAlias());
        }
        if (ctx.DELETE() != null) {
            result.append("DELETE FROM ");
            result.append(tableCreation1.getTableName());
            result.append(" AS ");
            result.append(tableCreation1.getAlias());
        }
        String conditions1 = SQLSentence.getConditions(tableCreation1.alias,
                tableCreation1.getProperties());
        String total = "";
        if (!conditions1.isEmpty()) {
            total += conditions1;
            if (!where.isEmpty()) {
                total += " AND ";
            }
        }
        if (ctx.SET() != null) {
            result.append("UPDATE ");
            result.append(tableCreation1.getTableName());
            result.append(" AS ");
            result.append(tableCreation1.getAlias());
            result.append(" SET ");
            result.append(projection);
        }
        String where2 = total + where;
        if (!where2.isEmpty()) {
            result.append(" WHERE ");
            result.append(where2);
        }
        return result.toString();

    }

    private String doubleSelect(SQLSentence tableCreation1, SQLSentence tableCreation2,
            String projection, String where, String label) {
        String joinTableName = tableCreation1.tableName + "_" + tableCreation2.tableName;
        if (tableCreation1.tableName.compareTo(tableCreation2.tableName) > 0) {
            joinTableName = tableCreation2.tableName + "_" + tableCreation1.tableName;
        }
        StringBuilder result = new StringBuilder();
        String labelCond = joinTableName + ".label=";
        if (!label.isEmpty()) {
            result.append("SET @label := (select Label.label_id from Label where Label.label_name=\"");
            result.append(label);
            result.append("\" limit 1);");
            labelCond += "@label";
        } else {
            labelCond = "";
        }
        result.append("SELECT ");
        result.append(projection);
        result.append(" FROM ");
        result.append(tableCreation1.getTableName());
        result.append(" AS ");
        result.append(tableCreation1.getAlias());
        result.append(" INNER JOIN ");
        result.append(joinTableName);
        result.append(" ON ");
        result.append(tableCreation1.getAlias());
        result.append(".");
        result.append(tableCreation1.getTableName().toLowerCase());
        result.append("_id = ");
        result.append(joinTableName);
        result.append(".origin ");

        result.append(" INNER JOIN ");
        result.append(tableCreation2.getTableName());
        result.append(" AS ");
        result.append(tableCreation2.getAlias());
        result.append(" ON ");
        result.append(tableCreation2.getAlias());
        result.append(".");
        result.append(tableCreation2.getTableName().toLowerCase());
        result.append("_id = ");
        result.append(joinTableName);
        result.append(".destination");

        String conditions1 = SQLSentence.getConditions(tableCreation1.alias, tableCreation1.getProperties());
        String conditions2 = SQLSentence.getConditions(tableCreation2.alias, tableCreation2.getProperties());
        String total = "";
        if (!conditions1.isEmpty()) {
            total += conditions1;
            if (!conditions2.isEmpty()) {
                total += " AND " + conditions2;
            } else {
                total += " AND ";
            }
        }
        String where2 = total + where;
        if (where2.isEmpty()) {
            where2 = labelCond;
        } else {
            where2 += " AND " + labelCond;
        }
        if (!where2.isEmpty()) {
            result.append(" WHERE ");
            result.append(where2);
        }
        return result.toString();
    }

}
