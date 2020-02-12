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
public class nomorDua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo;
        
        System.out.print("Masukkan jumlah saldo : ");
        saldo = sc.nextInt();
        
        for(int x = 0; x < 12; x++){
            System.out.println("Saldo bulan ke-" + (x + 1) + " = " + saldo);
            saldo = saldo + (saldo * 2 / 100);
        }
    }
}
