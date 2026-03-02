import java.util.*;

class node {
    int data;
    node L, R;

    node(int v) {
        data = v;
        L = R = null;
    }
}

public class Main {
    static node root = null;

    static boolean isFull(node r) {
        if (r == null)
            return true;

        if (r.L == null && r.R == null)
            return true;

        if (r.L != null && r.R != null)
            return isFull(r.L) && isFull(r.R);

        return false;
    }

    public static void main(String[] args) {
        root = new node(10);
        root.L = new node(20);
        root.R = new node(30);
        root.L.L = new node(40);
        root.L.R = new node(50);

        System.out.println(isFull(root));
    }
}
