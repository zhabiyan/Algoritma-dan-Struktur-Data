/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;
import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class nomorDua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][5];
        int totalakhir = 0;
        
        
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[1].length; y++) 
            {
                
                System.out.print("Masukkan bilangan indeks ke-[" + x + "][" + y + "] = ");
                arr[x][y] = sc.nextInt();
            
            }
        }
        for (int x[] : arr) {
            for (int y : x) {
                
                totalakhir += y;
            }
        }
        System.out.println("Total isi array : " + totalakhir);
    }
}
