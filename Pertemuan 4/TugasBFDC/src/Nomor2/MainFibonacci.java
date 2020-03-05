/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

import static Nomor2.Fibonacci.fibo;
import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class MainFibonacci {

    public static void main(String[] args) {
        // Brute Force
        Scanner sc = new Scanner(System.in); //0(1)
        int angka, hitung, hitung1 = 0, hitung2 = 1; //0(1)
        System.out.print("Masukan Angka : "); //0(1)
        angka = sc.nextInt(); //0(1)
        System.out.println("Hasil bilangan fibonacci: "); //0(1)
        for (int i = 0; i < angka; i++) { //0(n)
            if (i == 0 || i == 1) { //0(1)
                continue; //0(1)
            }
            hitung = hitung1 + hitung2; //0(1)
            System.out.println(hitung1 + " + " + hitung2 + " = " + hitung); //0(1)
            hitung1 = hitung2; //0(1)
            hitung2 = hitung; //0(1)
        }
        System.out.println("Hasil bilangan fibonacci: "); //0(1)
        for (int i = 0; i < angka; i++) { //0(n)
            int hasil = fibo(i); //0(1)
            System.out.print(hasil + " "); //0(1)
        }

        // Divide Conquer
        Scanner input = new Scanner(System.in); //0(1)
        int i; //0(1)
        int j = 0; //0(1)
        System.out.print("Masukkan bilangan Fibonacci :"); //0(1)
        int n = input.nextInt(); //0(1)

        System.out.print("Hasil bilangan Fibonacci : "); //0(1)

        System.out.println(""); //0(1)
        for (i = 1; i <= n; i++) { //0(n)
            System.out.println("Fibonacci ke-" + i + ":" + fibo(j)); //0(1)
            j++; //0(1)
        }
        System.out.println(); //0(1)
    }
}
