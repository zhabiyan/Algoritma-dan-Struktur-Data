/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class MainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();

        Sum sm = new Sum(elm);
        System.out.println("=====================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke - " + (i + 1) + " = ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("=====================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perubahan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("=====================================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total keuntungan perubahan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
    }
}
