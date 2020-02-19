/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor5;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class JajarGenjangMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        JajarGenjang[] Cara = new JajarGenjang[5];

        for (int i = 0; i < Cara.length; i++) {
            Cara[i] = new JajarGenjang();
            System.out.print("Input Panjang Ke " + (i + 1) + " : ");
            Cara[i].panjang = sc.nextInt();
            System.out.print("Input Tinggi: " + (i + 1) + " : ");
            Cara[i].tinggi = sc.nextInt();
            System.out.print("Input Sisi Miring: " + (i + 1) + " : ");
            Cara[i].sisi = sc.nextInt();
            System.out.println();

        }
        for (int i = 0; i < Cara.length; i++) {
            System.out.println("==========================================");
            System.out.println("Luas Jajar Genjang Ke " + (i + 1) + " Adalah : " + Cara[i].hitungLuas());
            System.out.println();
            System.out.println("Keliling Jajar Genjang Ke " + (i + 1) + " Adalah : " + Cara[i].hitungKeliling());
            System.out.println("==========================================");
            System.out.println();
        }

    }
}
