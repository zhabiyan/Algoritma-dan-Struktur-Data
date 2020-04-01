/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasNomor2;

/**
 *
 * @author Zhabiyan
 */
public class kalimatBalik {

    public int size;
    public int top;
    public String kalimat = "";
    public String kata[] = new String[10];

    public kalimatBalik(String kalimat) {
        this.kalimat = kalimat;
        size = kalimat.length();
        top = -1;
    }

    public void push(String temp) {
        top++;
        kata[top] = temp;
    }

    public String pop(int top) {
        String temp = kata[top];
        top--;
        return temp;
    }

    public void exchange() {
        String temp = "";
        for (int i = 0; i < size; i++) {
            temp += String.valueOf(kalimat.charAt(i));
            if (kalimat.charAt(i) == ' ') {
                push(temp);
                temp = "";
            }
        }
        push(temp);
    }

    public void show() {
        String temp = "";

        for (int i = top; i >= 0; i--) {
            temp += pop(i) + " ";
        }
        System.out.println("Kalimat dibalik : " + temp);
    }
}
