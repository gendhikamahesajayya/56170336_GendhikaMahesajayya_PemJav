/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_kasus3;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class toko {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
    String nama;
    int harga, jumlah, bayar, total, totalbelanja, potongan = 0, subtotal, kembali;
        System.out.println("TOKO SERBA ADA");
        System.out.println("JL. BANTAR GEBANG NO.23 BEKASI JAWA BARAT");
        System.out.println("=========================================");
        System.out.println("Nama Barang = ");
        nama = input.nextLine();
        System.out.println("Harga Barang = ");
        harga = input.nextInt();
        System.out.println("Jumlah beli = ");
        jumlah = input.nextInt();
        System.out.println("-----------------------------------------");
        totalbelanja = harga * jumlah;
        System.out.println("Total belanja = " + totalbelanja);
        if(totalbelanja >= 100000){
            potongan = totalbelanja*1/100;
        }
        else if(totalbelanja >= 150000){
            potongan = totalbelanja*3/100;
        }
        else if(totalbelanja >= 300000){
            potongan = totalbelanja*6/100;
        }
        else if(totalbelanja >= 500000){
            potongan = totalbelanja*10/100;
        }
        System.out.println("Potongan harga = " + potongan);
        subtotal = totalbelanja - potongan; 
        System.out.println("-----------------------------------------");
        System.out.println("Total harga = " + subtotal);
        System.out.println("Uang Bayar = ");
        bayar = input.nextInt();
        System.out.println("-----------------------------------------");
        kembali = bayar - subtotal;
        System.out.println("Uang Kembali = " + kembali);
    }   
}
