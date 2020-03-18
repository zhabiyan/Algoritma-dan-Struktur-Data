/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Zhabiyan
 */
public class Liga {

    String namaKlub;
    int bermain;
    int jumlahGol;
    int poin;

    Liga(String nama, int p, int gd, int pts) {
        namaKlub = nama;
        bermain = p;
        jumlahGol = gd;
        poin = pts;
    }

    void tampil() {
        System.out.println("============================================");
        System.out.println("Nama Klub : " + namaKlub);
        System.out.println("Jumlah Bermainan : " + bermain);
        System.out.println("Jumlah Gol : " + jumlahGol);
        System.out.println("Poin  : " + poin);
    }
}
