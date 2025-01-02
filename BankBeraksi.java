/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author LENOVO
 */
public class BankBeraksi {
    public static void main(String [] args){
        Bank Banksilpi = new Bank (100000);
        System.out.println("Selamat Datang di Bank ABC");
        Banksilpi.simpanUang(500000);
        Banksilpi.ambilUang(150000);
    }
}
