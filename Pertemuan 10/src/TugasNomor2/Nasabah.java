/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNomor2;

/**
 *
 * @author Zhabiyan
 */
public class Nasabah {

    String noRekening, nama;

    Nasabah(String noRek, String nm) {
        noRekening = noRek;
        nama = nm;
    }

    Nasabah() {

    }

    void print() {
        System.out.println("Nama Nasabah : " + nama);
        System.out.println("Rekening : " + noRekening);
        System.out.println("------------------------");
    }
}
