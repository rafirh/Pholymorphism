/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author rafir
 */
public class Line implements Relation {
    private double x1, x2, y1, y2;
    
    public Line(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public double getLength() {
        return Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
    }
    
    @Override
    public boolean isGreater(Object a, Object b) {
        double lengthA = ((Line) a).getLength();
        double lengthB = ((Line) b).getLength();
        return lengthA > lengthB;
    }

    @Override
    public boolean isLess(Object a, Object b) {
        double lengthA = ((Line) a).getLength();
        double lengthB = ((Line) b).getLength();
        return lengthA < lengthB;
    }
    
    @Override
    public boolean isEqual(Object a, Object b) {
        double lengthA = ((Line) a).getLength();
        double lengthB = ((Line) b).getLength();
        return lengthA == lengthB;
    }
}
