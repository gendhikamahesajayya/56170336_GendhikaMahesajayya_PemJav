/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_kasus8;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class kasus8 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int panjang, lebar, x, luas, keliling;
    
        System.out.println("Menghitung luas dan keliling persegi");
        System.out.println("Masukkan panjang = ");
        panjang = input.nextInt();
        System.out.println("Masukkan Lebar = ");
        lebar = input.nextInt();
        System.out.println("1. Luas");
        luas = panjang * lebar;
        System.out.println("2. Keliling");
        keliling = 2 * (panjang * lebar);
        System.out.println("Masukan pilihan");
        x = input.nextInt();
        switch(x){
            case 1:System.out.println("Luas Persegi panjang" + luas);
            break;
            case 2:System.out.println("Keliling persegi panjang" + keliling);
            break;
        }
    }
}
