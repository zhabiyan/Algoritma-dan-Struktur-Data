/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor4;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class MainTugas4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("  Pemilihan Suara untuk Memilih Ketua BEM thn 2020  ");
        System.out.println("====================================================");
        Tugas4 dg = new Tugas4();
        Tugas4[] dia = new Tugas4[dg.jumlahKandidat];

        for (int i = 0; i < dg.jumlahKandidat; i++) {
            dia[i] = new Tugas4();
            System.out.print("Nama Kandidat ke-" + (i + 1) + " : ");
            dia[i].kandidat = sc.nextLine();
        }
        System.out.println("====================================================");
        for (int i = 0; i < dg.jumlahKandidat; i++) {
            System.out.print("Jumlah Suara kandidat ke -" + (i + 1) + " : ");
            dia[i].suara = sc.nextInt();
            dg.jumlahSuara += dia[i].suara;
        }
        System.out.println("====================================================");
        int hasil = dg.hitung(dg.jumlahSuara, dia[0].suara, dia[1].suara, dia[2].suara, dia[3].suara);
        if (hasil == 0) {
            System.out.println("Masing-masing kandidat memiliki mayoritas yang hampir sama");
        } else {
            System.out.println("Ketua BEM yang terpilih adalah " + dia[hasil - 1].kandidat);
        }
    }
}
