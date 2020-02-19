/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertanyaan;

/**
 *
 * @author Zhabiyan
 */
public class Segitiga {
    public int alas;
    public int tinggi;
    
    public Segitiga(int a, int t){
        alas=a;
        tinggi=t;
    }
    public double hitungLuas(){
        return 0.5*alas*tinggi;
    }
    public double hitungKeliling(){
        double hasil=Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return hasil + alas + tinggi;
    }
}
