/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

/**
 *
 * @author Zhabiyan
 */
public class Diagram {

    public int id, lamapinjam, harga1 = 10000, harga2 = 20000, harga3 = 30000, harga4 = 40000, game;
    public String nama;

    int hargaPinjam1() {
        return lamapinjam * harga1;
    }

    int hargaPinjam2() {
        return lamapinjam * harga2;
    }

    int hargaPinjam3() {
        return lamapinjam * harga3;
    }

    int hargaPinjam4() {
        return lamapinjam * harga4;
    }
}
