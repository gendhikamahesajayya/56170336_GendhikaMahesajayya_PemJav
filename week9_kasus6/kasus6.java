/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_kasus6;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class kasus6 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String nama;
    int golongan, tahun, gapok = 0, bonus = 0, masakerja, total;
        System.out.println("PT ANGIN RIBUT");
        System.out.println("JL. Sulawesi No.29 Jakarta Utara");
        System.out.println("--------------------------------");
        System.out.println("Masukkan Nama Karyawan");
        nama = input.nextLine();
        System.out.println("Masukkan golongan karyawan [1,2,3,4]");
        golongan = input.nextInt();
        if(golongan == 1){
            gapok = 1500000;
        }
        if(golongan == 2){
            gapok = 1200000;
        }
        if(golongan == 3){
            gapok = 1000000;
        }
        if(golongan == 4){
            gapok = 700000;
        }
        System.out.println("Tahun Kerja Karyawan");
        tahun = input.nextInt();
        if(tahun >= 5){
            bonus = 800000;
        }
        else if (tahun <= 5){
            bonus = 0;
        }
        System.out.println("Percabangan");
        System.out.println("Laporan Gaji Karyawan");
        System.out.println("Golongan karyawan = " + golongan);
        System.out.println("Gaji Pokok Karyawan = " + gapok);
        System.out.println("Tahun masuk Kerja = " + tahun);
        masakerja = tahun - 2017;
        System.out.println("Masa Kerja Karyawan = " + masakerja);
        System.out.println("Bonus Karyawan = " + bonus);
        total = gapok + bonus;
        System.out.println("Gaji Karyawan = " + total);
    }
}
