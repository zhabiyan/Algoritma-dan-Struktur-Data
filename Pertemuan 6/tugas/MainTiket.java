/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class MainTiket {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarHargaTiket data = new DaftarHargaTiket();
        int jumTiket = 5;

        for (int i = 0; i < jumTiket; i++) {
            System.out.print("Nama maskapai : ");
            String nama = s1.nextLine();
            System.out.print("Harga tiket : Rp. ");
            float harga = s.nextFloat();
            System.out.print("Jumlah transit : ");
            int transitCount = s.nextInt();
            System.out.print("Jam keberangkatan : ");
            int flightTime = s.nextInt();
            System.out.println("================================================");
            System.out.println();

            Tiket t = new Tiket(nama, harga, transitCount, flightTime);
            data.tambah(t);
        }
        
        System.out.println("Daftar harga tiket sebelum sorting");
        data.tampil();

        System.out.println();
        System.out.println("Daftar harga tiket secara bubble sort");
        System.out.println();
        data.bubbleSort();
        data.tampil();

        System.out.println();
        System.out.println("Daftar harga tiket secara selection sort");
        System.out.println();
        data.selectionSort();
        data.tampil();
    }
}
