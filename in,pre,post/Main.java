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
	static void preorder(node r) {
		if (r == null)
			return;
		System.out.print(r.data + " ");
		preorder(r.L);
		preorder(r.R);
	}
	static void inorder(node r) {
		if (r == null)
			return;
		inorder(r.L);
		System.out.print(r.data + " ");
		inorder(r.R);
	}
	static void postorder(node r) {
		if (r == null)
		return;
		postorder(r.L);
		postorder(r.R);
		System.out.print(r.data + " ");
	}
	public static void main(String[] args) {
		root = new node(17);
		root.L = new node(15);
		root.R = new node(2);
		root.L.L = new node(5);
		root.R.R = new node(6);
		root.R.R.L = new node(1);
		root.R.R.L.R = new node(70);
		root.R.R.R = new node(20);
		System.out.print("Pre : ");
		preorder(root);
		System.out.print("\nIn : ");
		inorder(root);
		System.out.print("\nPos : ");
		postorder(root);
	}
}
