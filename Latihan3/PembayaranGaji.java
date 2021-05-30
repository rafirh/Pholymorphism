/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author rafir
 */
public class PembayaranGaji {
    public int hitungGaji(Pegawai pegawai) {
        int uang = pegawai.gaji();
        
        if (pegawai instanceof Direktur)
            uang += ((Direktur) pegawai).tunjangan();
        else if (pegawai instanceof Staf)
            uang += ((Staf) pegawai).bonus();
        
        return uang;
    }
    
    public static void main(String[] args) {
        PembayaranGaji pembayaranGaji = new PembayaranGaji();
        Staf ali = new Staf();
        Direktur tony = new Direktur();
        
        System.out.println(
                "Gaji yang dibayarkan untuk staf = "
                + pembayaranGaji.hitungGaji(ali)
        );
        
        System.out.println(
                "Gaji yang dibayarkan kepada direktur = "
                + pembayaranGaji.hitungGaji(tony)
        );
    }
}
