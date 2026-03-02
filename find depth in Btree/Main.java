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
    static int height(node r) {
        if (r == null)
            return 0;
        return Math.max(height(r.L),height(r.R) )+1;
    }
    public static void main(String[] args) {
        root = new node(10);
        root.L = new node(20);
        root.R = new node(30);
        root.L.L = new node(40);
        root.R.R= new node(50);
        root.L.R = new node(58);
         root.R.L= new node(70);
         root.R.R.R= new node(60);
          root.L.L.L= new node(80);
        System.out.println(height(root));
    }
}
