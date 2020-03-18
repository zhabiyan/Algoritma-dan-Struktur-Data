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
public class MainLiga {

    public static void main(String[] args) {
        TabelKlasemen data = new TabelKlasemen();
        Liga[] L = new Liga[20];

        L[0] = new Liga("Manchester United", 28, 12, 42);
        L[1] = new Liga("Tottenham Hotspur", 29, 7, 41);
        L[2] = new Liga("Arsenal", 28, 4, 40);
        L[3] = new Liga("Burnley", 29, -6, 39);
        L[4] = new Liga("Crystal Palace", 29, -6, 39);
        L[5] = new Liga("Everton", 29, -6, 37);
        L[6] = new Liga("Liverpool", 29, 45, 82);
        L[7] = new Liga("Manchester City", 27, 39, 57);
        L[8] = new Liga("Leicester", 28, 26, 50);
        L[9] = new Liga("Newcastle United", 29, -16, 35);
        L[10] = new Liga("Southampton", 29, -17, 34);
        L[11] = new Liga("Brighton & Hove Albion", 29, -8, 29);
        L[12] = new Liga("Chelsea", 29, 9, 48);
        L[13] = new Liga("Wolverhampton Wanderers", 29, 7, 43);
        L[14] = new Liga("Sheffield United", 28, 5, 43);
        L[15] = new Liga("West Ham United", 29, -15, 27);
        L[16] = new Liga("Watford", 29, -17, 27);
        L[17] = new Liga("AFC Bournemouth", 29, -18, 27);
        L[18] = new Liga("Aston Villa", 27, -18, 25);
        L[19] = new Liga("Norwich City", 29, -27, 21);

        for (int i = 0; i < 20; i++) {
            data.tambah(L[i]);
        }

        System.out.println("Daftar Liga Inggris Sebelum Sorting : ");
        data.tampil();
        System.out.println();
        System.out.println("============================================");
        System.out.println("Daftar Liga Inggris Setelah Insertion Sort secara Asc : ");
        data.insertionSortA();
        data.tampil();
        System.out.println();
        System.out.println("============================================");
        System.out.println("Daftar Liga Inggris Setelah Insertion Sort secara Desc : ");
        data.insertionSortD();
        data.tampil();
    }
}
