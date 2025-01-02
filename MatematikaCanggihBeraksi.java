
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai a : ");
        int nilaia = input.nextInt();
        System.out.print("Masukkan Nilai b : ");
        int nilaib = input.nextInt();
        
        System.out.println("\nHasil Pertambahan " + nilaia + " + " + nilaib + " = " + mtk.pertambahan(nilaia, nilaib));
        System.out.println("Hasil Perkalian " + nilaia + " * " + nilaib + " = " + mtk.perkalian(nilaia, nilaib));
        System.out.println("Hasil modulus " + nilaia + " * " + nilaib + " = " + mtk.modulus(nilaia, nilaib));
    }
}
