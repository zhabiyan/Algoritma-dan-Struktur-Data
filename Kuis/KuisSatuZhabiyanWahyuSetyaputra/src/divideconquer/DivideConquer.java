/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divideconquer;

/**
 *
 * @author Zhabiyan
 */
public class DivideConquer {

    static void towerOfHanoi(int numDisc, char source, char destination, char spare) {
        if (numDisc == 1) {
            System.out.println("Pindah 1 gelang dari tower " + source + " ke tower " + destination);
            return;
        }
        towerOfHanoi(numDisc - 1, source, spare, destination);
        System.out.println("Pindah gelang " + numDisc + " dari tower " + source + " ke tower " + destination);
        towerOfHanoi(numDisc - 1, spare, destination, source);
    }

    public static void main(String[] args) {
        int n = 4; //jumlah gelang
        towerOfHanoi(n, 'A', 'C', 'B'); //A,B,dan C adalah nama tower
    }
}
