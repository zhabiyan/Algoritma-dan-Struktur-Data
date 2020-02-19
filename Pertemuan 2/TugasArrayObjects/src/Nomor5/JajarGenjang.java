/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor5;

/**
 *
 * @author Zhabiyan
 */
public class JajarGenjang {

    public int tinggi, sisi, panjang;

    int hitungLuas() {
        return panjang * tinggi;
    }

    int hitungKeliling() {
        return (2 * panjang) + (2 * sisi);
    }
}
