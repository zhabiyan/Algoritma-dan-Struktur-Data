/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNomor2;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class kalimatBalikMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kalimatAwal;
        System.out.println("Program Kalimat Terbalik Menggunakan Konsep Stack");
        System.out.println();
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = sc.nextLine();

        kalimatBalik pembalik = new kalimatBalik(kalimatAwal);

        pembalik.exchange();
        pembalik.show();
    }
}
