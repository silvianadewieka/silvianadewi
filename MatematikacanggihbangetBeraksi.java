/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherit;

/**
 *
 * @author LENOVO
 */
public class MatematikacanggihbangetBeraksi {
    public static void main(String [] args){
        Matematikacanggihbanget math = new Matematikacanggihbanget();
        
        int hasilPertambahan = math.pertambahan(5, 10);
        int hasilPerkalian = math.perkalian(5, 10);
        int hasilModulus = math.modulus(10, 3);
        int hasilPertambahanTiga = math.pertambahanTiga(5, 10, 15);
        
        System.out.println("Hasil Pertambahan: " + hasilPertambahan);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        System.out.println("Hasil Modulus: " + hasilModulus);
        System.out.println("Hasil Pertambahan Tiga:" + hasilPertambahanTiga);
    
    }
}    
