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
public class Main {
    public static <T> Line createLine(Vector<T> p1, Vector<T> p2) {
        return new Line(
                (double) p1.x, (double) p2.x, 
                (double) p1.y, (double) p2.y
        );
    }
    
    public static <T> String toString(Vector<T> p) {
        return "{" + p.x + ", " + p.y + "}";
    }
    
    public static void main(String[] args) {
        Vector<Double> myLocation = new Vector<>(0.0, 0.0);
        Vector<Double> shintasLocation = new Vector<>(12.0, 6.0);
        Vector<Double> anthonysLocation = new Vector<>(12.0, -6.0);
        Vector<Double> budisLocation = new Vector<>(2.0, 0.0);
        
        Line toShintasLocation = createLine(myLocation, shintasLocation);
        Line toAnthonysLocation = createLine(myLocation, anthonysLocation);
        Line toBudisLocation = createLine(myLocation, budisLocation);
        
        System.out.println(
                "My location = " + toString(myLocation) + '\n'
                + "Shinta's location = " + toString(shintasLocation) + '\n'
                + "Anthony's location = " + toString(anthonysLocation) + '\n'
                + "Budi's location = " + toString(budisLocation) + '\n'
        );
        
        System.out.println(
                "My location to Shinta's location = "
                + toShintasLocation.getLength() + '\n'
                + "=== ||| === to Anthony's location = "
                + toAnthonysLocation.getLength() + '\n'
                + "=== ||| === to Budi's location = "
                + toBudisLocation.getLength() + '\n'
        );
        
        System.out.println(
                "Distance to Shinta == Distance to Anthony : "
                + toShintasLocation.isEqual(toShintasLocation, toAnthonysLocation) + '\n'
                + "Distance to Shinta > Distance to Budi : "
                + toShintasLocation.isGreater(toShintasLocation, toBudisLocation) + '\n'
                + "Distance to Budi < Distance to Anthony : "
                + toBudisLocation.isLess(toBudisLocation, toAnthonysLocation) + '\n'
                + "Distance to Shinta < Distance to Budi : "
                + toShintasLocation.isLess(toShintasLocation, toBudisLocation) + '\n'
        );
    }
}
