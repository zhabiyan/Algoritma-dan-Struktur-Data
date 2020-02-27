/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

/**
 *
 * @author Zhabiyan
 */
public class Tugas2 {

    public String namaMhs;
    public int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

    double hitungTotalNilai() {
        int total = (nilaiTugas * 30 / 100) + (nilaiKuis * 20 / 100)
                + (nilaiUTS * 20 / 100) + (nilaiUAS * 30 / 100);
        return total;
    }
}
