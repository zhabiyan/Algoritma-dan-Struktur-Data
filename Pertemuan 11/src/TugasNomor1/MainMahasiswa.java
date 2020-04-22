/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNomor1;

import java.util.Scanner;

/**
 *
 * @author Zhabiyan
 */
public class MainMahasiswa {

    static void menu() {
        System.out.println("=====================================");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Print");
        System.out.println("5. Keluar");
        System.out.println("+ +");
        System.out.print("Pilih menu sesuai keinginan Anda : ");
    }

    static void menuTambah() {
        System.out.println("=====================================");
        System.out.println("1. Add First");
        System.out.println("2. Add Index");
        System.out.println("3. Add Key");
        System.out.println("4. Add Last");
        System.out.println("+ +");
        System.out.print("Pilih menu sesuai keinginan Anda : ");
    }

    static void menuHapus() {
        System.out.println("=====================================");
        System.out.println("1. Hapus Index");
        System.out.println("2. Hapus Key");
        System.out.println("3. Hapus First");
        System.out.println("4. Clear");
        System.out.println("+ +");
        System.out.print("Pilih menu sesuai keinginan Anda : ");
    }

    static void menuCari() {
        System.out.println("=====================================");
        System.out.println("1. Cari Index");
        System.out.println("2. Cari Key");
        System.out.println("3. Get First");
        System.out.println("4. Get Last");
        System.out.println("+ +");
        System.out.print("Pilih menu sesuai keinginan Anda : ");
    }

    public static void main(String[] args) {
        LinkedListsMahasiswa data = new LinkedListsMahasiswa();
        Scanner scan = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        int pil1 = 0;
        int pil2 = 0;
        String nama = " ";
        String nim = " ";
        int nilaiIndex = 0;
        try {
            do {
                menu();
                pil1 = scan.nextInt();
                switch (pil1) {
                    case 1:
                        menuTambah();
                        pil2 = scan.nextInt();
                        switch (pil2) {
                            case 1:
                                System.out.print("Masukkan NIM Anda :");
                                nim = scanStr.nextLine();
                                System.out.print("Masukkan nama Anda : ");
                                nama = scanStr.nextLine();
                                data.addFirst(nim, nama);
                                break;
                            case 2:
                                System.out.print("Masukkan NIM Anda: ");
                                nim = scanStr.nextLine();
                                System.out.print("Masukkan nama Anda: ");
                                nama = scanStr.nextLine();
                                System.out.print("Masukkan index : ");
                                nilaiIndex = scan.nextInt();
                                data.add(nim, nama, nilaiIndex);
                                break;
                            case 3:
                                System.out.print("Cari dan Masukkan nim Anda : ");
                                nim = scanStr.nextLine();
                                data.addKey(nim);
                                break;
                            case 4:
                                System.out.print("Masukkan NIM Anda: ");
                                nim = scanStr.nextLine();
                                System.out.print("Masukkan nama Anda: ");
                                nama = scanStr.nextLine();
                                data.addLast(nim, nama);
                                break;
                            default:
                                System.out.println("Pilihan Anda tidak tersedia ");
                        }
                        break;
                    case 2:
                        menuHapus();
                        pil2 = scan.nextInt();
                        switch (pil2) {
                            case 1:
                                System.out.print("Masukkan index : ");
                                nilaiIndex = scan.nextInt();
                                data.remove(nilaiIndex);
                                break;
                            case 2:
                                System.out.print("Cari dan Dihapus NIM : ");
                                nim = scanStr.nextLine();
                                data.removeKey(nim);
                                break;
                            case 3:
                                data.removeFirst();
                                break;
                            case 4:
                                data.clear();
                                break;
                            default:
                                System.out.println("Pilihan tidak tersedia ");
                        }
                        break;
                    case 3:
                        menuCari();
                        pil2 = scan.nextInt();
                        switch (pil2) {
                            case 1:
                                System.out.print("Masukkan index : ");
                                nilaiIndex = scan.nextInt();
                                data.get(nilaiIndex);
                                System.out.println("Data : ");
                                System.out.println("NIM : " + data.get(nilaiIndex).nim);
                                System.out.println("Nama : " + data.get(nilaiIndex).nama);
                                break;
                            case 2:
                                System.out.print("Cari NIM : ");
                                nim = scanStr.nextLine();
                                int hasil = data.getKey(nim);
                                if (hasil != -1) {
                                    System.out.println("Data ditemukan di index ke-" + hasil);
                                } else {
                                    System.out.println("Tidak ditemukan ");
                                }
                                break;
                            case 3:
                                System.out.println("Data : ");
                                System.out.println("NIM : " + data.getFirst().nim);
                                System.out.println("Nama : " + data.getFirst().nama);
                                break;
                            case 4:
                                System.out.println("Data : ");
                                System.out.println("NIM : " + data.getFirst().nim);
                                System.out.println("Nama : " + data.getFirst().nama);
                                break;
                            default:
                                System.out.println("Pilihan tidak tersedia ");
                        }
                        break;
                    case 4:
                        data.print();
                        break;
                }
            } while (pil1 != 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
