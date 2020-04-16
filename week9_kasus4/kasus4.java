/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_kasus4;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class kasus4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
    String nama;
    int absen, tugas, uts, uas, totalkhs;
    char grade;
        System.out.println("KWIK KIAN GIE INSTITUE");
        System.out.println("NILAI AKHIR SEMESTER");
        System.out.println("======================");
        System.out.println("Jurusan : Teknik Informatika");
        System.out.println("Nama Mahasiswa");
        nama = input.nextLine();
        System.out.println("Nilai Absesnsi");
        absen = input.nextInt();
        System.out.println("Nilai Tugas");
        tugas = input.nextInt();
        System.out.println("Nilai UTS");
        uts = input.nextInt();
        System.out.println("Nilai UAS");
        uas = input.nextInt();
        System.out.println("-----------------------------");
        totalkhs = absen*20/100 + tugas*25/100 + uts*25/100 + uas*30/100;
        System.out.println("Nilai KHS = " + totalkhs);
        if(totalkhs >= 80){
        grade = 'A';
        }
        else if(totalkhs >= 66){
        grade = 'B';
        }
        else if(totalkhs >= 56){
        grade = 'C';
        }
        else if(totalkhs >= 46){
        grade = 'D';
        }
        else{
            grade = 'E';
        }
        System.out.println("Grade" + grade);
    }
}
