/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.project;

import java.util.SortedSet;

/**
 *
 * @author JuanCamilo
 */
public class SQLSentence {

    protected String tableName;
    protected String alias;
    protected SortedSet<PropertyNeo4J> properties;
    protected String translation;


    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public SortedSet<PropertyNeo4J> getProperties() {
        return properties;
    }

    public void setProperties(SortedSet<PropertyNeo4J> properties) {
        this.properties = properties;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public static String getConditions(String tableName, SortedSet<PropertyNeo4J> props) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (PropertyNeo4J prop : props) {
            sb.append(tableName);
            sb.append(".");
            sb.append(prop.getName());
            sb.append("=");
            sb.append(prop.getValue());
            if (i != props.size() - 1) {
                sb.append(" AND ");
            }
            i++;
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return translation;
    }
}
