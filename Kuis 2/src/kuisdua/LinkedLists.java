/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisdua;

/**
 *
 * @author Zhabiyan
 */
public class LinkedLists {

    Node head, tail;

    public LinkedLists() {
        head = null;
        tail = null;
    }

    public void enque() {
        Node baru = new Node();
        baru.input();
        if (head == null) {
            head = baru;
        } else {
            tail.next = baru;
        }
        tail = baru;
    }

    public void deque() {
        if (head == null) {
            System.out.println("- Kosong -");
        } else {
            System.out.println("Data Keluar dengan Id : ");
            head = head.next;
        }
    }

    public void view() {
        if (head == null) {
            System.out.println("- Kosong -");
        } else {
            System.out.println("Bulan ke-\t|| 2018 \t|| 2019 \t|| 2020 \t||");
            for (Node a = head; a != null; a = a.next) {
                a.read();
            }
        }
    }
}
