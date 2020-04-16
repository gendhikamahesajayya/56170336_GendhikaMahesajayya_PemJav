/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_kasus1;

/**
 *
 * @author Gendhika Mahesajayya 
 * 56170336
 */
import java.util.Scanner;
public class ifelseifelse {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    char grade;
    int skorujian;
    
    System.out.println("Masukan nilai skor ujian");
    skorujian = input.nextInt();
    if(skorujian >= 90){
        grade = 'A';
    }
    else if(skorujian >= 80){
        grade = 'B';
    }
    else if(skorujian >= 70){
        grade = 'C';
    }
    else{
        grade = 'D';
    }
        System.out.println("Nilai = " + grade);
    }
   }

