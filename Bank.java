/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

/**
 *
 * @author LENOVO
 */
public class Bank {
    int saldo,simpanUang,ambilUang;
    private int total;
    public Bank (int saldo){
        this.saldo=saldo;
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini : Rp" +saldo);
    } 
    void simpanUang (int simpanUang){
        System.out.println("Simpan Uang : Rp" +simpanUang);
        int hasil = saldo+ simpanUang;
        System.out.println("Saldo saat ini : Rp" + hasil);
    }
    void ambilUang (int ambilUang){
        this.total = 600000;
        System.out.println("Ambil Uang : Rp" +ambilUang);
        int hasil = total - ambilUang;
        System.out.println("Saldo saat ini : Rp" + hasil);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String [] args){
        //Todo code application logic here
    }
    }
   
