/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.project;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author JuanCamilo
 */
public class TableDefinition extends SQLSentence implements Comparable<TableDefinition> {

    public TableDefinition(String alias, String tableName, SortedSet<PropertyNeo4J> properties) {
        this.tableName = tableName;
        this.properties = properties;
        this.alias = alias;
        StringBuilder result = new StringBuilder();
        result.append("CREATE TABLE IF NOT EXISTS ");
        result.append(tableName);
        result.append(" (");
        //add id
        String id = tableName.toLowerCase() + "_id";
        result.append(id);
        result.append(" INT(11) AUTO_INCREMENT,");
        for (PropertyNeo4J property : properties) {
            result.append(property.getName());
            result.append(" ");
            result.append(property.getType());

            if (property.isForeing()) {
                result.append(" REFERENCES ");
                //trick
                result.append(property.getValue());
                result.append("(");
                result.append(property.getValue().toLowerCase());
                result.append("_id)");
            }
            result.append(",");
        }
        result.append(" PRIMARY KEY (");
        result.append(id);
        result.append(")); ");
        this.translation = result.toString();
    }

    public static TableDefinition fussion(TableDefinition td1, TableDefinition td2) {
        SortedSet<PropertyNeo4J> properties = new TreeSet<>();
        if (td1.getTableName().equals(td2.getTableName())) {
            properties.addAll(td1.getProperties());
            properties.addAll(td2.getProperties());
            return new TableDefinition(td1.alias, td1.getTableName(), properties);
        } else {
            System.out.println("impossible to fussion");
            return null;
        }
    }

    @Override
    public int compareTo(TableDefinition o) {
        if (tableName.equals(o.getTableName())) {
            return 0;
        } else {
            return Integer.compare(properties.size(), o.properties.size());
        }
    }

}
