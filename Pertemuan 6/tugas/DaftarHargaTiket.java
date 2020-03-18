/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Zhabiyan
 */
public class DaftarHargaTiket {

    Tiket listTiket[] = new Tiket[5];
    int idx;

    void tambah(Tiket t) {
        if (idx < listTiket.length) {
            listTiket[idx] = t;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!!");
        }
    }

    void tampil() {
        for (Tiket t : listTiket) {
            t.tampil();
            System.out.println("------------------------------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listTiket.length - 1; i++) {
            for (int j = 1; j < listTiket.length - i; j++) {
                if (listTiket[j].harga < listTiket[j - 1].harga) {
                    Tiket tmp = listTiket[j];
                    listTiket[j] = listTiket[j - 1];
                    listTiket[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listTiket.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listTiket.length; j++) {
                if (listTiket[j].harga < listTiket[idxMin].harga) {
                    idxMin = j;
                }
            }
            Tiket tmp = listTiket[idxMin];
            listTiket[idxMin] = listTiket[i];
            listTiket[i] = tmp;
        }
    }
}
