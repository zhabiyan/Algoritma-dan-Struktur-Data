/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor1;

/**
 *
 * @author Zhabiyan
 */
public class Lingkaran {

    public double PHI = 3.14, r;

    double hitungLuas() {
        return PHI * r * r;
    }

    double hitungKeliling() {
        return 2 * PHI * r * r;
    }
}
