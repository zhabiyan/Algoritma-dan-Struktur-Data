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
public class TabelKlasemen {

    Liga listLiga[] = new Liga[20];
    int indeks;

    void tambah(Liga L) {
        if (indeks < listLiga.length) {
            listLiga[indeks] = L;
            indeks++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Liga L : listLiga) {
            L.tampil();
        }
    }

    void insertionSortA() {
        int i, j;
        for (i = 1; i < listLiga.length; i++) {
            Liga temp = listLiga[i];
            j = i;
            while ((j > 0) && (listLiga[j - 1].poin > temp.poin)) {
                listLiga[j] = listLiga[j - 1];
                j--;
            }
            listLiga[j] = temp;
        }
    }

    void insertionSortD() {
        int i, j;
        for (i = 1; i < listLiga.length; i++) {
            Liga temp = listLiga[i];
            j = i;
            while ((j > 0) && (listLiga[j - 1].poin < temp.poin)) {
                listLiga[j] = listLiga[j - 1];
                j--;
            }
            listLiga[j] = temp;
        }
    }
}
