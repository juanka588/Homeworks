/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.project;

/**
 *
 * @author JuanCamilo
 */
public class PropertyNeo4J implements Comparable<PropertyNeo4J> {
    
    private String name;
    private String value;
    private String type;
    private boolean foreing;
    
    public PropertyNeo4J(String name, String value, String type) {
        this(name, value, type, false);
    }

    public PropertyNeo4J(String name, String value, String type, boolean foreing) {
        this.name = name;
        this.value = value;
        this.type = type;
        this.foreing = foreing;
    }

    public boolean isForeing() {
        return foreing;
    }

    public void setForeing(boolean foreing) {
        this.foreing = foreing;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "name " + name + " value " + value + " type " + type;
    }
    
    @Override
    public int compareTo(PropertyNeo4J o) {
        return name.compareTo(o.name);
    }
    
}
