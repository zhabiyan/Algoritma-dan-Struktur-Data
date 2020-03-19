/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSearching;

/**
 *
 * @author Zhabiyan
 */
public class SearchingMain {

    public static void main(String[] args) {
        int data[] = {10, 30, 40, 50, 60, 70, 80, 90};
        Searching pencarian = new Searching(data, 8);
        
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        
        int cari = 30;

        System.out.println("menggunakan sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);

        if (posisi != -1) {
            System.out.println("data : " + cari + " ditemukan pada indeks " + posisi);
        } else {
            System.out.println("data " + cari + " tidak ditemukan");
        }

        pencarian.TampilPosisi(cari, posisi);
        System.out.println("=======================");
        System.out.println("menggunakan binary Search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length - 1);
        pencarian.TampilPosisi(cari, posisi);
    }
}
