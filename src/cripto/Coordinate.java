/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cripto;

/**
 *
 * @author JuanCamilo
 */
public class Coordinate implements Comparable<Coordinate> {

    private int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int compareTo(Coordinate o) {
        int result = Integer.compare(x, o.x);
        if (result == 0) {
            return Integer.compare(y, o.y);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Coordinate x: " + x + " y: " + y;
    }

}
