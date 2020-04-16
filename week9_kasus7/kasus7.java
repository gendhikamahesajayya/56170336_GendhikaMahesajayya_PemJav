/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_kasus7;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class kasus7 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String name, nim;
    int x;
    
        System.out.println("Masukan Nim");
        nim = input.nextLine();
        System.out.println("Masukan Nama");
        name = input.nextLine();
        System.out.println("Pilihan = ");
        System.out.println("1. Sistem informasi");
        System.out.println("2. Teknik Industri");
        System.out.println("3. Teknik Informatika");
        System.out.println("Masukkan Pilihan = ");
        x = input.nextInt();
        switch(x){
            case 1:System.out.println("1. Sistem Informasi");
            break;
            case 2:System.out.println("2. Teknik Industri");
            break;
            case 3:System.out.println("3. Teknik Informatika");
            break;
        }
        System.out.println(name + " dengan nim " + nim + " memilih jurusan " + x);
    }
}
