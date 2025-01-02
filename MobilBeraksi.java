/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author LENOVO
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilsilvi = new Mobil();
        
        mobilsilvi.warna = "pink";
        mobilsilvi.tahunProduksi = 1960;
        
        System.out.println("Warna: " + mobilsilvi.warna);
        System.out.println("Tahun Produksi: " + mobilsilvi.tahunProduksi);
    }
    
}
