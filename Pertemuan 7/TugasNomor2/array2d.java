/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNomor2;

/**
 *
 * @author Zhabiyan
 */
public class array2d {

    public int[][] data;
    public int jumBaris, jumKolom;

    public array2d(int[][] Data, int baris, int kolom) {
        this.jumBaris = baris;
        this.jumKolom = kolom;
        data = new int[baris][kolom];
        for (int i = 0; i < jumBaris; i++) {
            for (int j = 0; j < jumKolom; j++) {
                data[i][j] = Data[i][j];
            }
        }
    }

    public int[] FindSeqSearch(int cari) {
        int[] posisi = new int[2];
        posisi[0] = -1;
        posisi[1] = -1;
        for (int i = 0; i < jumBaris; i++) {
            for (int j = 0; j < jumKolom; j++) {
                if (data[i][j] == cari) {
                    posisi[0] = i;
                    posisi[1] = j;
                    break;
                }
            }
        }
        return posisi;
    }

    public void TampilData() {
        for (int i = 0; i < jumBaris; i++) {
            for (int j = 0; j < jumKolom; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void Tampilposisi(int x, int[] pos) {
        if (pos[0] != -1 && pos[1] != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks (" + pos[0] + "," + pos[1] + ")");
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
}
