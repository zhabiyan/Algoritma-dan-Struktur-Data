/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor6;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class LuasMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Luas[] Luas = new Luas[10];
        Luas Luas2 = new Luas();
        System.out.print("Jumlah Tanah: ");
        Luas2.jumlah = sc.nextInt();
        for (int i = 0; i < Luas2.jumlah; i++) {
            Luas[i] = new Luas();
            System.out.println("Tanah " + (i + 1));
            System.out.println();
            System.out.print("Panjang: ");
            Luas[i].panjang = sc.nextInt();
            System.out.print("Lebar: ");
            Luas[i].lebar = sc.nextInt();
            System.out.println();
        }
        for (int i = 0; i < Luas2.jumlah; i++) {
            System.out.println("Luas Tanah " + (i + 1) + ": " + Luas[i].hitungLuas());

        }
    }
}
