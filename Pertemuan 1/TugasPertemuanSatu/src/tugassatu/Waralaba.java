/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassatu;
import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class Waralaba {
    static void menuUtama() {
        System.out.println("     -------------     ");
        System.out.println("     |WARUNG ENAK|     ");
        System.out.println("     -------------     ");
        System.out.println("1. Chicken A     12000 ");
        System.out.println("2. Chicken B     15000 ");
        System.out.println("3. Chicken C     20000 ");
        System.out.println("-----------------------");
        System.out.println("4. Oke A         10000 ");
        System.out.println("5. Oke B         12000 ");
        System.out.println("6. Oke C         15000 ");
        System.out.println("-----------------------");
    }
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menuUtama();
        int harga = 0, bayar, total, jumlah;
        String pilihan; 
        System.out.print("Paket yang dipilih : ");
        pilihan = sc.nextLine();
        System.out.print("Jumlah paket yang dipesan : ");
        jumlah = sc.nextInt();

        switch (pilihan){
            case "1":
                harga = 12000;
                break;

            case "2":
                harga = 15000;
                break;

            case "3":
                harga = 20000;
                break;

            case "4":
                harga = 10000;
                break;

            case "5":
                harga = 12000;
                break;

            case "6":
                harga = 15000;
                break;

            default:
                System.out.println("Maaf, menu yang anda input tidak tersedia!");
        }   
            total = harga * jumlah;
            {       
        System.out.println("=======================");
        System.out.println("Total Pembayaran : Rp. " + total);
        }
    }  
}
