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
public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[3];
        sgArray[0] = new Segitiga(30, 12);
        sgArray[1] = new Segitiga(40, 15);
        sgArray[2] = new Segitiga(50, 25);
        
        for(int i=0;i<3;i++){
            System.out.println("Luas Segitiga ke-" + i + ", " + sgArray[i].hitungLuas());
        }
        for(int i=0;i<3;i++){
            System.out.println("Keliling Segitiga ke-" + i + ", " + sgArray[i].hitungKeliling());
        }
    }
}
