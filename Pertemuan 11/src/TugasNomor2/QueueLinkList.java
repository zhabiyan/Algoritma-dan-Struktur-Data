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
public class QueueLinkList {

    private Node front;
    private Node rear;

    public QueueLinkList() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public void enqueue(int id) {
        Node newNode = new Node(id);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
            newNode.next = null;
        }
    }

    public Node dequeue() {
        Node temp = null;
        if (front == null) {
            System.out.println("Antrian kosong");
        } else if (front == rear) {
            temp = front;
            front = rear = null;
        } else {
            temp = front;
            front = front.next;
            front.prev = null;
        }
        return temp;
    }

    public void display() {
        Node current = front;
        if (current == null) {
            System.out.println("Antriannya kosong");
        } else {
            while (current != null) {
                current.displayLink();
                current = current.next;
            }
        }
        System.out.println("");
    }

}
