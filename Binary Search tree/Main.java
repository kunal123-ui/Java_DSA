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
	static node ins(node root, int v) {
		if (root == null)
			return new node(v);
		if (v < root.data)
			root.L = ins(root.L, v);
		else
			root.R = ins(root.R, v);
		return root;
	}
	static void inorder(node root) {
		if (root == null) return;

		inorder(root.L);
		System.out.print(root.data + " ");
		inorder(root.R);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		       int s = sc.nextInt();
		       int a[] = new int[s];
		       for (int i = 0; i < s; i++)
		       a[i] = sc.nextInt();              //array input
		       node root = null;
		       for (int i = 0; i < s; i++)
		       root = ins(root, a[i]);
		       inorder(root);
		                                            */


		String s=sc.nextLine();
		String a[]=s.split(" +");
		for(int i=0; i<a.length; i++)
		{	//sting input
			int t=Integer.parseInt(a[i]);
			root=ins(root,t);
		}
		inorder(root);
	}
}
