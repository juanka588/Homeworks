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
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author JuanCamilo
 */
public class MyNeo4JVisitor<T> extends Neo4JBaseVisitor<T> {

    private static final Pattern NUMBER_PATTERN = Pattern.compile("[0-9]+([.][0-9]*)?");

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
        List<SQLSentence> rightTable = (List<SQLSentence>) visit(ctx.node_def(0));
        String label = (String) visit(ctx.relation_type());

        SortedSet<PropertyNeo4J> originProps, destinantionProps;
        Map<String, TableDefinition> tds = new HashMap<>();
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
        props.add(new PropertyNeo4J("origin", origin, "LONG", true));
        props.add(new PropertyNeo4J("destinantion", destinantion, "LONG", true));
        props.add(new PropertyNeo4J("label", destinantion, "LONG", true));
        result.add(new TableDefinition(joinTableName, props));
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
        return (T) ctx.LABEL().getText();
    }

    @Override
    public T visitDefinition(Neo4JParser.DefinitionContext ctx) {
        String tableName = ctx.LABEL().getText();
        SortedSet<PropertyNeo4J> properties = (TreeSet<PropertyNeo4J>) visit(ctx.props_list(0));
        List<SQLSentence> sentences = new ArrayList<>(2);
        sentences.add(new TableDefinition(tableName, properties));
        sentences.add(new InsertSentence(tableName, properties));
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
        prop = new PropertyNeo4J(name, value, type);
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
        throw new IllegalStateException("type can not be infered");

    }

}
