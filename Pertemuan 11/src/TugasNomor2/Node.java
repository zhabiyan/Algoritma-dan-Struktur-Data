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
public class Node {

    public int data;
    public Node next;
    public Node prev;

    public Node(int id) {
        data = id;
    }

    public void displayLink() {
        System.out.print("{" + data + "} ");
    }

}
