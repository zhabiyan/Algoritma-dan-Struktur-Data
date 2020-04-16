/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

/**
 *
 * @author Zhabiyan
 */
public class ModifikasiLinkedLists {

    Node head;
    int size;

    public ModifikasiLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        head = new Node(item, head);
        size++;
    }

    public void add(int item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
        }
        size++;
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LibkedLists kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("NIlai index di luar batas");
        }
        Node tmp = head;
        for (int i = 1; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("NIlai index di luar batas");
        } else {
            if (index == 0) {
                removeFirst();
            } else {
                Node prev = head;
                Node cur = head.next;
                for (int i = 1; i < index; i++) {
                    prev = cur;
                    cur = prev.next;
                }
                prev.next = cur.next;
                size--;
            }
        }
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }

    public void addByValue(int cari, int item) throws Exception {
        Node tmp = head;
        int index = 0;
        boolean ditemukan = false;
        while (tmp.next != null) {
            tmp = tmp.next;
            index++;
            if (head.data == cari) {
                ditemukan = true;
                break;
            } else if (tmp.data == cari) {
                ditemukan = true;
                index++;
                break;
            }
        }
        if (ditemukan) {
            add(item, index);
        } else {
            throw new Exception("Data tidak ditemukan!");
        }
    }

    public void removeByValue(int cari) throws Exception {
        Node tmp = head;
        int index = 0;
        boolean ditemukan = false;
        while (tmp.next != null) {
            tmp = tmp.next;
            index++;
            if (head.data == cari) {
                removeFirst();
                break;
            } else if (tmp.data == cari) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            remove(index);
        } else {
            throw new Exception("Data tidak ditemukan!");
        }
    }

    public void cari(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index diluar batas");
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Data pada indeks ke-" + index + " adalah : " + tmp.data);
        }
    }

    public void cariKey(int cari) throws Exception {
        Node tmp = head;
        int index = 0;
        boolean ditemukan = false;
        if (isEmpty()) {
            System.out.println("LinkedLists kosong");
        } else {
            while (tmp.next != null) {
                tmp = tmp.next;
                index++;
                if (head.data == cari) {
                    ditemukan = true;
                    break;
                } else if (tmp.data == cari) {
                    ditemukan = true;
                    index++;
                    break;
                }
            }
        }
        if (ditemukan) {
            System.out.println("Data " + cari + " ditemukan pada indeks ke-" + index);
        } else {
            throw new Exception("Data tidak ditemukan!");
        }
    }
}
