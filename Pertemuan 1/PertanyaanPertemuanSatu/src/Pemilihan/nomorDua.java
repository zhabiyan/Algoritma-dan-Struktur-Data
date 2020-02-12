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
public class nomorDua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputan;
        
        System.out.print("Masukkan bilangan : ");
        inputan = sc.nextInt();
        
        if (inputan %2 == 0 && inputan %6 == 0 && inputan %15 == 0) {
            
            System.out.println("Bilangan kelipatan 2,6,15");
            
        } else if (inputan %2 == 0 && inputan % 6 == 0) {
            
            System.out.println("Bilangan kelipatan 2,6");
            
        } else if (inputan %6 == 0 && inputan % 15 == 0) {
            
            System.out.println("Bilangan kelipatan 6,15");
            
        } else if (inputan %15 == 0 && inputan % 2 == 0) {
            
            System.out.println("Bilangan kelipatan 2,15");
            
        } else if (inputan %2 == 0) {
            
            System.out.println("Bilangan kelipatan 2");
            
        } else if (inputan %6 == 0) {
            
            System.out.println("Bilangan kelipatan 6");
            
        } else if (inputan %15 == 0) {
            
            System.out.println("Bilangan kelipatan 15");
            
        } else {
            
            System.out.println("Bilangan Bukan kelipatan 2,6,ataupun 15");
        }
    } 
}
 