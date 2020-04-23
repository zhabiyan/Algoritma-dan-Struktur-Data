/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisdua;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class Node {

    int tahun1, tahun2, tahun3, bulan;
    Node next;
    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    public void input() {
        System.out.print("Masukkan bulan : ");
        bulan = in.nextInt();
        System.out.print("Masukkan data tahun 2018 : ");
        tahun1 = in.nextInt();
        System.out.print("Masukkan data tahun 2019 : ");
        tahun2 = str.nextInt();
        System.out.print("Masukkan data tahun 2020 : ");
        tahun3 = str.nextInt();
        next = null;
    }

    public void read() {
        System.out.println("|| " + bulan + " \t|| " + tahun1 + " \t|| " + tahun2 + " \t|| " + tahun3 + " \t||");
    }
}
