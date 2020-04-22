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
public class Main {

    public static void main(String[] args) {
        QueueLinkList theQueue = new QueueLinkList();
        System.out.println("Memasukkan item antrian...");
        theQueue.enqueue(22);
        theQueue.display();
        theQueue.enqueue(44);
        theQueue.display();
        theQueue.enqueue(66);
        theQueue.display();
        theQueue.enqueue(88);
        theQueue.display();
        System.out.println();
        System.out.println("Tampilkan Antrian :");
        theQueue.display();
        System.out.println();
        System.out.println("Hapus Antrian dari Depan...");
        while (!theQueue.isEmpty()) {
            Node aLink = theQueue.dequeue();
            System.out.print("Dihapus ");
            aLink.displayLink();
            System.out.println("");
            theQueue.display();
            System.out.println("");
        }

    }
}
