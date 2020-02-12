/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pemilihan;
import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class nomorSatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totaltugas, totaluts, uts, uas, tugas, nilaitotal, totaluas;
        
        System.out.print("Masukkan nilai tugas Anda     : ");
        tugas = sc.nextDouble();
        
        if(tugas<0||tugas>100){
            System.out.println("Maaf, nilai yang Anda masukkan tidak valid!");
            tugas=0;
        }
        
        System.out.print("Masukkan nilai UTS Anda       : ");
        uts = sc.nextDouble();
        
        if(uts<0||uts>100){
            System.out.println("Maaf, nilai yang Anda masukkan tidak valid!");
            uts=0;
        }
        
        System.out.print("Masukkan nilai UAS Anda       : ");
        uas = sc.nextDouble();
        
        if(uas<0||uas>100){
            System.out.println("Maaf, nilai yang Anda masukkan tidak valid!");
            uas=0;
        }
        
        totaltugas=tugas*20/100;
        totaluts=uts*35/100;
        totaluas=uas*45/100;
        nilaitotal=totaltugas+totaluas+totaluts;
        
        System.out.println("20% dari nilai tugas  =     " + totaltugas);
        System.out.println("35% dari nilai uts    =     " + totaluts);
        System.out.println("45% dari nilai uas    =     " + totaluas);
        System.out.println("Nilai akhir anda      =     " + nilaitotal);
    }
}
