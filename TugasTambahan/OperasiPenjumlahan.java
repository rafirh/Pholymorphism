/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTambahan;

/**
 *
 * @author rafir
 */
public class OperasiPenjumlahan extends OperasiBilanganAbs{
    
    @Override
    protected void set_A(double a){
        this.a = a;
    }
    
    @Override
    protected void set_B(double b){
        this.b = b;
    }
    
    @Override
    protected void set_C(){
        this.c = this.a + this.b;
    }

    @Override
    protected double get_A() {
        return this.a;
    }

    @Override
    protected double get_B() {
        return this.b;
    }

    @Override
    protected double get_C() {
        return this.c;
    }
    
    @Override
    protected void tampil(){
        set_C();
        System.out.println("==== Penjumlahan ====");
        System.out.printf("A : %f \n", get_A());
        System.out.printf("B : %f \n", get_B());
        System.out.printf("A + B = %f + %f = %f", get_A(), get_B(), get_C());
        System.out.println("\n==== =========== ====");
    }
    
        
}
