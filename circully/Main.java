import java.util.*;

class node {
    int data;
    node next;

    node(int v) {
        data = v;
        next = null;
    }
}

public class Main {
    static node head = null, tail = null;

    static void ins(int v) {
        node n = new node(v);

        if (head == null) {
            head = tail = n;
            n.next = head;
        } else {
            tail.next = n;
            tail = n;
            tail.next = head;
        }
    }

    static void dellast() {
        node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        tail = temp;
        tail.next = head;
    }

    static void dis() {
        if (head == null) return;

        node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++)
            ins(s.nextInt());

        dis();
        dellast();
        dis();
        dellast();
        dis();
    }
}
