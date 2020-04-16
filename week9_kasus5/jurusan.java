/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_kasus5;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class jurusan {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int nim, absen, tugas, uts, uas, kode = 0, totalkhs;
    String nama, jurusan, cetak = "";
        System.out.println("Universitas Indonesia");
        System.out.println("Fakultas Teknik");
        System.out.println("=====================");
        System.out.println("Nim = ");
        nim = input.nextInt();
        System.out.println("Nama Mahasiswa = ");
        nama = input.nextLine();
        System.out.println("Kode Jurusan = ");
        kode = input.nextInt();
        if(kode == 1){
        jurusan = "Teknik Mesin";
        }
        else if(kode == 2){
        jurusan = "Teknik Sipil";
        }
        else if(kode == 3){
        jurusan = "Teknik Elektro";
        }
        else if(kode == 4){
        jurusan = "Teknik Industri";
        }
        else{
            jurusan = "kode salah";
        }
        System.out.println("Nama jurusan = " + jurusan);
        System.out.println("Nilai Absensi");
        absen = input.nextInt();
        System.out.println("Nilai Tugas");
        tugas = input.nextInt();
        System.out.println("Nilai UTS");
        uts = input.nextInt();
        System.out.println("Nilai UAS");
        uas = input.nextInt();
        System.out.println("-------------------------");
        totalkhs = absen*20/100 + tugas*25/100 + uts*25/100 + uas*30/100;
        System.out.println("Nilai KHS" + totalkhs);
        if(totalkhs >= 60){
            cetak = "lulus";
        }
        else if(totalkhs <= 60){
            cetak = "Tidak lulus";
        }
        System.out.println("Keterangan" + cetak);
    }
}
