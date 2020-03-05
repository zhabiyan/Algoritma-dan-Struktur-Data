/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor3;

/**
 *
 * @author Zhabiyan
 */
public class FaktorialBFDC {

    //Algoritma Brute Force
    public int faktorialBF(int n) {
        int faktor = 1; //0(1)
        int i = 1; //0(1)

        while (i <= n) { //0(n)
            faktor = faktor * i; //0(1)
            i++; //0(1)
        }
        return faktor; //0(1)
    }

    //Algoritma Divide Conquer
    public int faktorialDC(int n) {
        if (n == 1) { //0(1)
            return 1; //0(1)
        } else {
            int faktor = n * faktorialDC(n - 1); //0(1)
            return faktor; //0(1)
        }
    }
}
