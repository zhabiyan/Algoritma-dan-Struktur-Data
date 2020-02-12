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
public class nomorSatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil[] = new int[15];
        int ganjil[] = new int[15];
        int genap[] = new int[15];
        int indexGenap = 0, indexGanjil = 0; 
        
        
        for (int i = 0; i < bil.length; i++) {
            System.out.print("Masukkan bilangan : ");
            bil[i] = sc.nextInt();    
        }
            
        for (int i : bil) {
            if (i % 2 == 0) {
                genap[indexGenap] = i;
                indexGenap += 1;               
            } else {               
                ganjil[indexGanjil] = i;
                indexGanjil += 1;               
            }
        }
        
        System.out.print("Bilangan genap : ");
        for (int x : genap) {
            if (x==0){
                continue;
            }
            System.out.print(x + " ");
        }
        
        System.out.println("");
        System.out.print("Bilangan ganjil : ");
        
        
        for (int x : ganjil) {
            if (x==0){
                continue;
                
            }
            
            System.out.print(x + " ");
        }
    }
}
