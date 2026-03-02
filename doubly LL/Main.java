import java.util.*;
class node {
    int data;
    node next;
    node prev;
    node(int v) {
        data = v;
        next = null;
        prev = null;
    }
}
public class Main {
    static node head = null;
    static node tail = null;
    static void ins(int v) {
        node n = new node(v);

        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }
    static void displayForward() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static void displayBackward() {
        node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int siz = sc.nextInt();
        for (int i = 0; i < siz; i++){
            int v = sc.nextInt();
            ins(v);
        }
        displayForward();
        displayBackward();
    }
}
