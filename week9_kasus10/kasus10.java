/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_kasus10;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class kasus10 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int tahun, bulan;
        System.out.println("Masukkan tahun");
        tahun = input.nextInt();
        System.out.println("Masukkan bulan");
        bulan = input.nextInt();
        switch (bulan){
        case 1: //Januari
            case 3: //Maret
                case 5: //Mei
                    case 7: //Juli
                        case 8: //Agustus
                            case 10: //Oktober
                                case 12: //Desember
                                   System.out.print("JUMLAH HARI PADA TAHUN "+ tahun +""
                                   + " DAN BULAN "+ bulan + " ADALAH 31 HARI");
        break;
       
        case 4: //April
            case 6: //Juni
                case 9: //September
                    case 11: //November
                        System.out.print("JUMLAH HARI PADA TAHUN "+ tahun +""
                        + " DAN BULAN "+ bulan + " ADALAH 30 HARI");
        break;

case 2: //Januari
  
if ((tahun % 400 == 0) | (tahun % 400 != 0 & tahun % 100 != 0 & tahun % 4 ==0)) 
        System.out.print("JUMLAH HARI PADA TAHUN "+ tahun +""
        + " DAN BULAN "+ bulan + " ADALAH 29 HARI"); 
else
        System.out.print("JUMLAH HARI PADA TAHUN "+ tahun +""
        + " DAN BULAN "+ bulan + " ADALAH 28 HARI");
break;
default:
    System.out.println("BULAN YANG ANDA MASUKAN SALAH"); 
break;
}
   }
}
