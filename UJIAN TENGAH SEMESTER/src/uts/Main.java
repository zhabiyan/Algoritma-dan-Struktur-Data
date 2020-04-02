/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchandMergeSort uts = new BinarySearchandMergeSort();
        int arr[] = {35, 30, 8};
        
        System.out.println("=======================================");
        System.out.println("Budi sebagai Ayah berumur 35 tahun");
        System.out.println("Diana sebagai Ibu berumur 30 tahun");
        System.out.println("Mila sebagai Anak berumur 8 tahun");
        
        uts.sort(arr);
        System.out.println();
        
        System.out.println("Data Setelah Diurutkan");
        uts.printArray(arr);
        System.out.println("=======================================");

        int n = arr.length;
        System.out.print("Masukkan Umur : ");
        int z = sc.nextInt();
        int result = uts.FindBinarySearch(arr, 0, n - 1, z);
        if (result == -1) {
            System.out.println("Tidak ada anggota keluarga yang berumur " + z + " tahun");
        } else {
            System.out.println("Ada anggota keluarga yang berumur " + z + " tahun");
        }
        System.out.println("=======================================");
    }
}
