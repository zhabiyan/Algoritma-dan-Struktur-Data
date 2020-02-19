/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor1;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class LingkaranMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lingkaran l1 = new Lingkaran();

        System.out.print("Input jari-jari : ");
        l1.r = sc.nextDouble();
        System.out.println("Luas lingkaran = " + l1.hitungLuas());
        System.out.println("Keliling lingkaran = " + l1.hitungKeliling());
    }
}
