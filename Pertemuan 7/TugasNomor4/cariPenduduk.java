/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNomor4;

/**
 *
 * @author Zhabiyan
 */
public class cariPenduduk {

    public int jumData;
    public penduduk listPenduduk[];
    public int indeks;

    public cariPenduduk(int jumlah) {
        this.jumData = jumlah;
        listPenduduk = new penduduk[jumlah];
    }

    public void tambah(penduduk P) {
        if (indeks < listPenduduk.length) {
            listPenduduk[indeks] = P;
            indeks++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < jumData; i++) {
            if (listPenduduk[i].nik == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIK : " + x + " ditemukan pada indeks " + pos);
            System.out.println("Data Penduduk ke-" + (pos + 1));
            System.out.println("NIK Penduduk\t: " + listPenduduk[pos].nik);
            System.out.println("Nama Penduduk\t: " + listPenduduk[pos].nama);
            System.out.println("Alamat Penduduk\t: " + listPenduduk[pos].alamat);
            System.out.println("Jenis Kelamin\t: " + listPenduduk[pos].jenisKelamin);
            System.out.println("===========================================================");
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}
