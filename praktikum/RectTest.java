/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author rafir
 */
public class RectTest extends Rect {
    
    private static String toString(Rect rect) {
        return "["
                + rect.x1 + "," 
                + rect.y1 + "; "
                + rect.x2 + ","
                + rect.y2
                + "]";
    }
    
    public static void main(String[] args) {
        Rect rect1 = new Rect(1, 1, 4, 4);
        
        if (rect1.isInside(2, 3)) {
            System.out.println("(2, 3) is inside the union");
        }
        
        Rect rect2 = new Rect(2, 3, 5, 6);
        
        System.out.println(
                toString(rect1) + " union " + toString(rect2)
                + " = " + toString(rect1.union(rect2))
        );
        
        System.out.println(
                toString(rect1) + " intersect " + toString(rect2)
                + " = " + toString(rect1.intersection(rect2))
        );
    }

}
