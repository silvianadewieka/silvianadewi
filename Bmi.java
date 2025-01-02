/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

/**
 *
 * @author LENOVO
 */
public class Bmi {
    double tinggi;
    double berat;
    
    public Bmi(double tinggi, double berat){
        this.tinggi = tinggi / 100;
        this.berat = berat;
    }
    
    public void status(){
        double Bmi = berat / (tinggi * tinggi);
        if (Bmi < 18.5){
            System.out.println("status : kurus");
        } else if (Bmi < 25){
            System.out.println("status : normal");
        }  else if (Bmi < 30){
            System.out.println("status : gemuk");
        } else {
            System.out.println("status : obesitas");
        }
        System.out.printf("Bmi anda : %.1f%n",Bmi);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
