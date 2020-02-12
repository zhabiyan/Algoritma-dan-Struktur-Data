/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fungsi;
import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class nomorSatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil, hitungA = 0, hitungB = 1, hitung;
        
        
        System.out.print("Masukkan bilangan : ");
        bil = sc.nextInt();
        
        System.out.println("Hasil bilangan fibonacci: ");
        
        for (int i = 0; i < bil; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            hitung = hitungA + hitungB;
            
            System.out.println(hitungA + " + " + hitungB + " = " + hitung);
            
            hitungA = hitungB;
            hitungB = hitung;
        }
        System.out.println("Hasil bilangan fibonacci: ");
        for (int i = 0; i < bil; i++) {
            int tot = fibonacci(i);
            System.out.print(tot + " ");
        }
    }

    static int fibonacci(int bil) {
        if (bil == 0 || bil == 1) {
            return bil;
        } else {
            return (fibonacci(bil - 1) + fibonacci(bil - 2));
        }
    }
}
