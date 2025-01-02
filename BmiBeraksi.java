/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BmiBeraksi {
    public static void main(String [] args){
        Scanner inputansaya = new Scanner(System.in);
        System.out.print("\n masukan tinggi badan anda :");
        double tinggi = inputansaya.nextDouble();
        System.out.print("masukan berat badan anda:");
        double berat = inputansaya.nextDouble();
        Bmi bmi = new Bmi(tinggi, berat);
        bmi.status();
    }
    
}
