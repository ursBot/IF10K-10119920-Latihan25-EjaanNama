/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119920.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 */

public class EjaanNama {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nama;
        int i, banyak;
                
        System.out.print("Masukan nama depan anda untuk di eja : ");
        nama = input.next();
        banyak = nama.length();
        String[] kata = nama.split("");
        System.out.println();
        
        System.out.println("Ejaan untuk \"" + nama + "\" adalah :");
        
        for(i = 0;i < banyak;i++){            
        System.out.println("Huruf ke-" + (i+1) + " : " + kata[i]);        
        }
    }
}