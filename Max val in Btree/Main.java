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
    static int Max(node r) {
        if (r == null)
        return Integer.MIN_VALUE;
        return Math.max(r.data, Math.max(Max(r.L), Max(r.R)));
    }
    public static void main(String[] args) {
        root = new node(17);
        root.L = new node(15);
        root.R = new node(2);
        root.L.L = new node(5);
        root.R.R = new node(6);
        root.R.R.L = new node(1);
        root.R.R.R = new node(1);
        root.R.R.L.R = new node(70);
        System.out.println(Max(root));    
    }
}