/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNomor3;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class konversiInfixMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;

        System.out.println("Konversi Infix menjadi Prefix");
        System.out.println();
        System.out.println("Masukkan ekspresi matematika : ");
        Q = sc.nextLine();
        int length = Q.length();

        String balikEkspresi = "";
        for (int i = length - 1; i >= 0; i--) {
            balikEkspresi = balikEkspresi + Q.charAt(i);
        }

        balikEkspresi = balikEkspresi.trim();
        balikEkspresi = balikEkspresi + "(";

        int total = balikEkspresi.length();

        konversiInfix pre = new konversiInfix(total);
        P = pre.konversi(balikEkspresi);
        System.out.println("Prefix : " + new StringBuffer(P).reverse());
    }
}
