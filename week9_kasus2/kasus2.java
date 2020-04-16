/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_kasus2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class kasus2 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int pendapatan, jasa = 0, komisi = 0,total;
        System.out.println("Masukan uang pendapatan Sales Rp. ");
        pendapatan = input.nextInt();
        if(pendapatan == 200000){
            jasa = 10000;
            komisi = pendapatan*10/100;
        }
        else if(pendapatan >= 200000){
            jasa = 20000;
            komisi = pendapatan*15/100;
        }
        else if(pendapatan >= 500000){
            jasa = 30000;
            komisi = pendapatan*20/100;
        }
        System.out.println("==================================");
        System.out.println("Uang Jasa RP. " + jasa);
        System.out.println("Uang Komisi Rp. " + komisi);
        System.out.println("==================================");
        total = jasa + komisi;
        System.out.println("Uang Total Rp. " + total);
    }
}
