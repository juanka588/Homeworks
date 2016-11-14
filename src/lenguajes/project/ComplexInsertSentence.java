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
class ComplexInsertSentence extends SQLSentence {
    /*
     SET @label :=(select label.label_id from label where label.label_name="IS_EMPLOYEE" limit 1);
     SET @origin :=(select client.client_id from client where client.NIT="1020" limit 1);
     SET @destination :=(select employee.employee_id from employee where employee.document_id="1013642638" limit 1);
     SELECT @origin,@destination;
     insert into temp (temp.origin,temp.destinantion) 
     VALUES(@origin,@destination);
     select * from temp;
     */
//(n:Person{name:"juan"})-[KNOW]-(x:Person{name:"pedro"})

    public ComplexInsertSentence(String joinTableName, String origin, String destinantion,
            SortedSet<PropertyNeo4J> originProps, SortedSet<PropertyNeo4J> destinantionProps,
            String label) {
        StringBuilder sb = new StringBuilder();
        sb.append("SET @label := (select label.label_id from label where label.label_name=\"");
        sb.append(label);
        sb.append("\" limit 1);");
        sb.append("SET @origin :=(select ");
        sb.append(origin);
        sb.append(".");
        sb.append(origin);
        sb.append("_id from ");
        sb.append(origin);
        sb.append(" where ");
        sb.append(getConditions(origin, originProps));
        sb.append(" limit 1) ;");

        sb.append("SET @destination :=(select ");
        sb.append(destinantion);
        sb.append(".");
        sb.append(destinantion);
        sb.append("_id from ");
        sb.append(destinantion);
        sb.append(" where ");
        sb.append(getConditions(destinantion, destinantionProps));
        sb.append(" limit 1) ;");
        sb.append("INSERT INTO ");
        sb.append(joinTableName);

        sb.append(" (");
        sb.append(joinTableName);
        sb.append(".origin,");
        sb.append(joinTableName);
        sb.append(".destination");
        sb.append(" ) VALUES (@");
        sb.append(" );");
        translation = sb.toString();
    }

}
