/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor7;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class NilaiMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Nilai nl = new Nilai();

        System.out.print("\nMasukkan jumlah mahasiswa : ");
        nl.jumlah = sc.nextInt();

        Nilai[] nilai = new Nilai[nl.jumlah];

        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = new Nilai();

            System.out.println("\nMahasiswa ke-" + (i + 1) + " : ");
            System.out.print("Masukkan Nilai ke 1 : ");
            nilai[i].nilai1 = sc.nextInt();
            System.out.print("Masukkan Nilai ke 2 : ");
            nilai[i].nilai2 = sc.nextInt();
        }

        System.out.println();

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Terbaik Mahasiswa ke-" + (i + 1) + " : " + nl.max(nilai[i].nilai1, nilai[i].nilai2));
        }

    }
}
