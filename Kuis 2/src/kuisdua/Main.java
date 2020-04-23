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
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu = 0;
        LinkedLists que = new LinkedLists();
        while (menu != 4) {
            System.out.println("---Pilih Menu---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. View");
            System.out.println("4. Exit");
            System.out.print("Pilih nomor : ");
            menu = in.nextInt();
            if (menu == 1) {
                que.enque();
            } else if (menu == 2) {
                que.deque();
            } else if (menu == 3) {
                que.view();
            } else if (menu == 4) {
                System.out.println("- Keluar -");
            } else {
                System.out.println("- Masukkan nomor menu dengan benar -");
            }
            System.out.println("");
        }
    }
}
