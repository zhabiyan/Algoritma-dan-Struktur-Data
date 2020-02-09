/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaslima;
import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class luasbangun {
    static Scanner sc = new Scanner(System.in);
    
    static void menuUtama(){
        int pilihan;
        System.out.println("1. Menghitung Luas Segitiga");
        System.out.println("2. Menghitung Luas Segiempat");
        System.out.println("3. Menghitung Luas Lingkaran");
        System.out.print("Masukkan Pilihan Anda: ");
        pilihan = sc.nextInt();
        
        switch(pilihan){
            case 1: 
                segitiga();
                break;
            case 2:
                segiempat();
                break;
            case 3 :
                lingkaran();
                break;
        }
    }
    
    static void segitiga(){
        int luas,alas,tinggi;
        System.out.print("Masukkan alas : ");
        alas = sc.nextInt();
        System.out.print("Masukkan tinggi : ");
        tinggi = sc.nextInt();
        System.out.print("Luas Segitiga : ");
        luas=(alas*tinggi)/2;
        System.out.println(luas);
    }
    
    static void segiempat(){
        int sisi,luas;
        System.out.print("Masukkan sisi : ");
        sisi = sc.nextInt();
        System.out.print("Luas Segiempat : ");
        luas = sisi*sisi;
        System.out.println(luas);
    }
    
    static void lingkaran(){
        int jari,luas;
        double p1=3.14;
        System.out.print("Masukkan jari jari : ");
        jari = sc.nextInt();
        System.out.print("Luas Lingkaran : ");
        luas = (int)(p1*(jari*jari));
        System.out.println(luas);
    }
    
    public static void main(String[] args) {
        menuUtama();
    }
}
