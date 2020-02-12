/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;
import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class nomorSatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukkan angka : ");
        angka = sc.nextInt();
        
        for (int i = 0; i < 5; i++) 
        {
            angka -= 3;
        }
        
        System.out.println("Hasil akhir = " + angka);
        
        if (angka % 2 == 0) {
            
            System.out.println("Hasil akhir berupa bilangan genap");
            
        } else 
        {
            
            System.out.println("Hasil akhir berupa bilangan ganjil");
           
        }
    }
}
