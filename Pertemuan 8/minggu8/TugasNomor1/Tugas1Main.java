/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNomor1;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class Tugas1Main {

    public static void main(String[] args) {
        Tugas1 tumpukan = new Tugas1(4);

        System.out.println("Modifikasi Praktikum 1 mengganti data angka menjadi teks (kalimat)");
        System.out.println();
        tumpukan.push("Pensil");
        tumpukan.push("Bolpoin");
        tumpukan.push("Penghapus");
        tumpukan.push("Spidol");

        tumpukan.print();
        System.out.println();

        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
}
