/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

import java.util.Objects;

/**
 *
 * @author JuanCamilo
 */
public class Term {

    public static final int TERMINAL = 0;
    public static final int NO_TERMINAL = 1;
    private int type;
    private String identifier;

    public Term(int type, String identifier) {
        this.type = type;
        this.identifier = identifier;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        if (type == TERMINAL) {
            return "Terminal node " + identifier;
        } else {
            return "NO Terminal node " + identifier;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.type;
        hash = 79 * hash + Objects.hashCode(this.identifier);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Term other = (Term) obj;
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.identifier, other.identifier)) {
            return false;
        }
        return true;
    }

    
    

}
