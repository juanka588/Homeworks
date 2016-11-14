/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.project;

import java.util.Iterator;
import java.util.SortedSet;

/**
 *
 * @author JuanCamilo
 */
public class InsertSentence extends SQLSentence {

    public InsertSentence(String tableName, SortedSet<PropertyNeo4J> properties) {
        this.tableName = tableName;
        this.properties = properties;
        StringBuilder insert = new StringBuilder(), values = new StringBuilder();
        insert.append("INSERT INTO ");
        insert.append(tableName);
        insert.append(" (");
        values.append(" VALUES (");
        PropertyNeo4J property;
        Iterator<PropertyNeo4J> iterator = properties.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            property = iterator.next();
            insert.append(property.getName());
            values.append(property.getValue());
            if (i != properties.size() - 1) {
                insert.append(",");
                values.append(",");
            }
            i++;
        }
        insert.append(")");
        values.append(")");
        insert.append(values);
        insert.append(";");
        this.translation = insert.toString();
    }

}
