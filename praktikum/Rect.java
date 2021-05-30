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
public class Rect {
    public int x1, y1, x2, y2;
    
    public Rect(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public Rect(int width, int height) {
        this(0, 0, width, height);
    }
    
    public Rect() {
        this(0, 0, 0, 0);
    }
    
    public void move(int deltaX, int deltaY) {
        x1 += deltaX; x2 += deltaX;
        y1 += deltaY; y2 += deltaY;
    }
    
    public boolean isInside(int x, int y) {
        return ((x >= x1) && (x <= x2) && (y >= y1) && (y <= y2));
    }
    
    public Rect union(Rect r) {
        return new Rect(
                (this.x1 < r.x1) ? this.x1 : r.x1,
                (this.y1 < r.y1) ? this.y1 : r.y1,
                (this.x2 > r.x2) ? this.x2 : r.x2,
                (this.y2 > r.y2) ? this.y2 : r.y2
        );
    }
    
    public Rect intersection(Rect r) {
        Rect result = new Rect(
                (this.x1 > r.x1) ? this.x1 : r.x1,
                (this.y1 > r.y1) ? this.y1 : r.y1,
                (this.x2 < r.x2) ? this.x2 : r.x2,
                (this.y2 < r.y2) ? this.y2 : r.y2
        );
        
        if (result.x1 > result.x2) {
            result.x1 = result.x2 = 0;
        }
        
        if (result.y1 > result.y2) {
            result.y1 = result.y2 = 0;
        }
        
        return result;
    }
}
