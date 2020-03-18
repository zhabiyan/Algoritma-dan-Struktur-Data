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
public class Tiket {

    String maskapai;
    float harga;
    int transitCount, flightTime;

    Tiket(String m, float h, int t, int f) {
        maskapai = m;
        harga = h;
        transitCount = t;
        flightTime = f;
    }

    void tampil() {
        System.out.println("Nama maskapai : " + maskapai);
        System.out.println("Harga tiket : " + harga);
        System.out.println("Jumlah transit : " + transitCount);
        System.out.println("Jam keberangkatan : " + flightTime);
    }
}
