/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloadingmatematika;

/**
 *
 * @author LENOVO
 */
public class Overloadingmatematika {
    // Metode pertambahan
    void pertambahan(double a, double b, double c){
        double hasil = a + b + c;
        System.out.println("Hasil pertambahan : " + hasil );
    }
    
    void pertambahan(int a, int b, int c){
        int hasil = a + b + c;
        System.out.println("Hasil pertambahan : " + hasil);
    }
    
    void pertambahan(int a, int b){
        int hasil = a + b;
        System.out.println("Hasil pertambahan : " + hasil);
    }
    
    void pertambahan(double a, double b){
        double hasil = a + b;
        System.out.println("Hasil pertambahan : " + hasil);
    }
    
    // Metode pengurangan
    void pengurangan(double a, double b, double c){
        double hasil = a - b - c;
        System.out.println("Hasil pengurangan : " + hasil);
    }
    
    void pengurangan(int a,int b, int c){
        int hasil = a - b - c;
        System.out.println("Hasil pengurangan : " + hasil);
    }
    
    void pengurangan(int a, int b){
        int hasil =  a - b;
        System.out.println("Hasil pengurangan : " + hasil);
    }
    
    void pengurangan(double a, double b){
        double hasil = a - b;
        System.out.println("Hasil pengurangan : " + hasil);
    }
    
    // Metode perkalian
    void perkalian(double a, double b, double c){
        double hasil = a * b * c;
        System.out.println("Hasil perkalian : " + hasil);
    }
    
    void perkalian(int a, int b, int c){
        int hasil = a * b * c;
        System.out.println("Hasil perkalian : " + hasil);
    }
    
    void perkalian(int a, int b){
        int hasil = a * b;
        System.out.println("Hasil perkalian : " + hasil);
    }
    
    void perkalian(double a, double b){
        double hasil = a * b;
        System.out.println("Hasil perkalian : " + hasil);
    }
    
    // Metode pembagian
    void pembagian(double a, double b, double c){
        double hasil = a / b / c;
        System.out.println("Hasil pembagian : " + hasil);
    }
    
    void pembagian(int a , int b, int c){
        int hasil =  a / b / c;
        System.out.println("Hasil pembagian : " + hasil);
    }
    
    void pembagian(int a, int b){
        int hasil = a / b;
        System.out.println("Hasil pembagian : " + hasil);
    }
    
    void pembagian(double a, double b){
        double hasil = a / b;
        System.out.println(" Hasil pembagian : " + hasil);
    }
    
    // Metode modulus
    void modulus(double a, double b, double c){
        double hasil = a % b % c;
        System.out.println("Hasil modulus : " + hasil);
    }
    
    void modulus(int a, int b, int c){
        int hasil = a % b % c;
        System.out.println("Hasil modulus : " + hasil);
    }
    
    void modulus(int a, int b){
        int hasil = a % b;
        System.out.println("Hasil modulus : " + hasil);
    }
    
    void modulus(double a, double b){
        double hasil = a % b;
        System.out.println("Hasil modulus : " + hasil);
    }
    
    public double operasiPecahan(double a, double b, double c) {
        double hasil = a + b + c;
        System.out.println("Hasil operasi pecahan : " + hasil);
        return hasil;
    }
    
}
