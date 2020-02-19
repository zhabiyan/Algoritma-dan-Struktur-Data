/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor3;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class BarangMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Barang br = new Barang();

        System.out.print("Masukkan nama barang : ");
        br.nama = sc.nextLine();
        System.out.print("Harga barang : Rp. ");
        br.hargaSatuan = sc.nextInt();
        System.out.print("Jumlah barang : ");
        br.jumlah = sc.nextInt();

        System.out.println("Nama barang\t\t = " + br.nama);
        System.out.println("Harga Satuan Barang\t = " + br.hargaSatuan);
        System.out.println("Harga Total \t\t = " + br.hitungHargaBayar());
    }
}
