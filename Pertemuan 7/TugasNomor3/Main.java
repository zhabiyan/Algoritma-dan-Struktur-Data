/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNomor3;

/**
 *
 * @author Zhabiyan
 */
public class Main {

    public static void main(String[] args) {
        int[] data = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        Searching pencarian = new Searching(data, 10);
        MergeSort ms = new MergeSort();

        System.out.println("Pencarian Nilai Array Terbesar Menggunakan Binary Search");
        System.out.println("===========================================================");
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        System.out.println("===========================================================");

        System.out.println("Sorting dengan merge sort : ");
        ms.mergeSort(data);
        ms.printArray(data);
        System.out.println("===========================================================");

        System.out.println("Nilai Array Terbesar : " + pencarian.maksimal(data));
        int cari = pencarian.maksimal(data);
        System.out.println("Jumlah nilai terbesar : " + pencarian.nilaiTerbesar(cari, data));
        int posisi[] = new int[pencarian.terbesar];
        for (int i = 0; i < pencarian.terbesar; i++) {
            posisi[i] = pencarian.FindBinarySearch(cari, data, 0, data.length - 1);
            if (i > 0) {
                pencarian.TampilPosisi(cari, posisi[i] + 1);
            } else {
                pencarian.TampilPosisi(cari, posisi[i]);
            }
        }
    }
}
