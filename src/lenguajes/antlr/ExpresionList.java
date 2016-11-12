/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.antlr;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanCamilo
 */
public class ExpresionList<T> {

    public static int TYPE_ARRAY = 1000;
    public static int TYPE_ARG = 2000;

    private List<List> expMatrix;
    private int currentPos;
    private int type;
    private boolean filled = false;

    public ExpresionList(List expresions, int type) {
        this.expMatrix = new ArrayList<>();
        expMatrix.add(expresions);
        this.currentPos = 0;
        this.type = type;
    }

    public void add(ExpresionList expresionList) {
        filled = true;
        List copy = (List) expresionList.expMatrix.get(0);
        copy.stream().forEach((copy1) -> {
            addValue((T) copy1);
        });
        currentPos++;
    }

    public void addValue(T value) {
        filled = true;
        expMatrix.get(currentPos).add(value);
    }

    public List<List> getExpMatrix() {
        return expMatrix;
    }

    public void setExpMatrix(List<List> expMatrix) {
        this.expMatrix = expMatrix;
    }

    public int getCurrentPos() {
        return currentPos;
    }

    public void setCurrentPos(int currentPos) {
        this.currentPos = currentPos;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List temp = expMatrix.get(0);
        if (type == TYPE_ARRAY) {
            sb.append("[");
            sb.append(temp.get(0));
            for (int i = 1; i < temp.size(); i++) {
                Object temp1 = temp.get(i);
                sb.append(",");
                sb.append(temp1);
            }
            sb.append("]");
            return sb.toString();
        }
        return null;
    }

    public T get(int i) {
        return (T) expMatrix.get(currentPos).get(i);
    }

}
