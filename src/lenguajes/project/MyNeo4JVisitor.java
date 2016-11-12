/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanCamilo
 */
public class MyNeo4JVisitor<T> extends Neo4JBaseVisitor<T> {

    @Override
    public T visitInit(Neo4JParser.InitContext ctx) {
        T visitInit = super.visitInit(ctx); //To change body of generated methods, choose Tools | Templates.
        return visitInit;
    }

    @Override
    public T visitCreate(Neo4JParser.CreateContext ctx) {
        T visitInit = visit(ctx.opt_create());
        return visitInit;

    }

    @Override
    public T visitCreate_multiple(Neo4JParser.Create_multipleContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (Neo4JParser.Node_defContext node_def : ctx.node_def()) {
            sb.append(visit(node_def));
        }
        return (T) sb.toString();
    }

    @Override
    public T visitNode_def(Neo4JParser.Node_defContext ctx) {
        return visit(ctx.definition());
    }

    @Override
    public T visitDefinition(Neo4JParser.DefinitionContext ctx) {
        StringBuilder result = new StringBuilder();
        StringBuilder insert = new StringBuilder();
        result.append("CREATE TABLE ");
        String tableName = ctx.LABEL().getText();
        result.append(tableName);
        result.append(" (");
        List<PropertyNeo4J> properties = (List<PropertyNeo4J>) visit(ctx.props_list(0));
        PropertyNeo4J property;
        for (int i = 0; i < properties.size() - 1; i++) {
            property = properties.get(i);
            result.append(property.getName());
            result.append(" ");
            result.append(property.getType());
            result.append(",");
            insert.append(property.getValue());
            insert.append(",");
        }
        property = properties.get(properties.size() - 1);
        result.append(property.getName());
        result.append(" ");
        result.append(property.getType());
        result.append(");");
        insert.append(property.getValue());
        result.append("INSERT INTO ");
        result.append(tableName);
        result.append(" VALUES (");
        result.append(insert);
        result.append(");");
        return (T) result.toString();
    }

    @Override
    public T visitProps_list(Neo4JParser.Props_listContext ctx) {
        List<PropertyNeo4J> props = new ArrayList<>();
        for (Neo4JParser.PropContext prop : ctx.prop()) {
            props.add((PropertyNeo4J) visit(prop));
        }
        return (T) props;
    }

    @Override
    public T visitProp(Neo4JParser.PropContext ctx) {
        PropertyNeo4J prop;
        String name = ctx.ID().getText();
        String value = (String) visit(ctx.exp());
        String type = "varchar";
        prop = new PropertyNeo4J(name, value, type);
        return (T) prop;
    }

    @Override
    public T visitOr_operation(Neo4JParser.Or_operationContext ctx) {
        return (T) "hola";
    }

}
