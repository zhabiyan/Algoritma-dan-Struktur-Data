/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNomor2;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class array2dMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] data = {{45, 78, 7, 200, 80}, {90, 1, 17, 100, 50}, {21, 2, 40, 18, 65}};
        array2d pencarian = new array2d(data, 3, 5);

        System.out.println("Pencarian Data Array 2D Menggunakan Sequential Search");
        System.out.println("=======================================================");
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        System.out.println("=======================================================");

        System.out.print("Masukkan data yang dicari : ");
        int cari = sc.nextInt();

        int[] posisi = pencarian.FindSeqSearch(cari);
        pencarian.Tampilposisi(cari, posisi);
    }
}
