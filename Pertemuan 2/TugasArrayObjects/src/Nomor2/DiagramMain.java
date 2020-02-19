/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class DiagramMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Diagram peminjaman = new Diagram();
        do {
            System.out.println("=======MENU PEMINJAMAN GAME=======");
            System.out.println("1. APEX LEGENDS");
            System.out.println("2. PES 2020");
            System.out.println("3. DOTA 2");
            System.out.println("4. FIFA 2020");
            System.out.println("5.EXIT");
            System.out.print("Pilih game yang akan dipinjam : ");
            peminjaman.game = sc.nextInt();
            if (peminjaman.game == 1) {
                System.out.println("Pilihan game yang dipinjam adalah Apex Legends");
                System.out.print("Input ID member Anda: ");
                peminjaman.id = sc.nextInt();
                System.out.print("Input Nama Anda: ");
                peminjaman.nama = sc.next();
                System.out.print("Input Waktu Meminjam: ");
                peminjaman.lamapinjam = sc.nextInt();
                System.out.println();
                System.out.println("========================");
                System.out.println("Nama Anda    : " + peminjaman.nama);
                System.out.println("ID Anda      : " + peminjaman.id);
                System.out.println("pilihan Game : Apex Legends");
                System.out.println("Waktu Pinjam : " + peminjaman.lamapinjam);
                System.out.println("Harga        : " + peminjaman.harga1);
                System.out.println("Total bayar  : " + peminjaman.hargaPinjam1());
            } else if (peminjaman.game == 2) {
                System.out.println("Pilihan game yang dipinjam adalah PES 2020");
                System.out.print("Input ID member Anda: ");
                peminjaman.id = sc.nextInt();
                System.out.print("Input Nama Anda: ");
                peminjaman.nama = sc.next();
                System.out.print("Input Waktu Meminjam: ");
                peminjaman.lamapinjam = sc.nextInt();
                System.out.println("========================");
                System.out.println("Nama Anda    : " + peminjaman.nama);
                System.out.println("ID Anda      : " + peminjaman.id);
                System.out.println("pilihan Game : PES 2020");
                System.out.println("Waktu Pinjam : " + peminjaman.lamapinjam);
                System.out.println("Harga        : " + peminjaman.harga2);
                System.out.println("Total bayar  : " + peminjaman.hargaPinjam2());
            } else if (peminjaman.game == 3) {
                System.out.println("Pilihan game yang dipinjam adalah Dota 2");
                System.out.print("Input ID member Anda: ");
                peminjaman.id = sc.nextInt();
                System.out.print("Input Nama Anda: ");
                peminjaman.nama = sc.next();
                System.out.print("Input Waktu Meminjam: ");
                peminjaman.lamapinjam = sc.nextInt();
                System.out.println("========================");
                System.out.println("Nama Anda    : " + peminjaman.nama);
                System.out.println("ID Anda      : " + peminjaman.id);
                System.out.println("pilihan Game : Dota 2");
                System.out.println("Waktu Pinjam : " + peminjaman.lamapinjam);
                System.out.println("Harga        : " + peminjaman.harga3);
                System.out.println("Total bayar  : " + peminjaman.hargaPinjam3());
            } else if (peminjaman.game == 4) {
                System.out.println("Pilihan game yang dipinjam adalah FIFA 2020");
                System.out.print("Input ID member Anda: ");
                peminjaman.id = sc.nextInt();
                System.out.print("Input Nama Anda: ");
                peminjaman.nama = sc.next();
                System.out.print("Input Waktu Meminjam: ");
                peminjaman.lamapinjam = sc.nextInt();
                System.out.println("========================");
                System.out.println("Nama Anda    : " + peminjaman.nama);
                System.out.println("ID Anda      : " + peminjaman.id);
                System.out.println("pilihan Game : FIFA 2020");
                System.out.println("Waktu Pinjam : " + peminjaman.lamapinjam);
                System.out.println("Harga        : " + peminjaman.harga4);
                System.out.println("Total bayar  : " + peminjaman.hargaPinjam4());
            } else {
                System.out.println("--TERIMA KASIH SELAMAT DATANG KEMBALI--");
            }
        } while (peminjaman.game > 0 && peminjaman.game < 4);
    }
}
