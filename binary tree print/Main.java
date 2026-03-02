import java.util.*;
class node 
{
    int data;
    node L,R;
    node(int v){
        data=v;
        R=L=null;
    }
}
public class Main
{
    static node root=null;
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    root=new node(17);
	    root.L=new node(15);
	    root.R=new node(2);
	    root.L.L=new node(5);
	    root.R.R=new node(6);
	    root.R.R.L=new node(33);
	    root.R.R.R=new node(20);
	    root.R.R.L=new node(1);
	    root.R.R.L.R=new node(70);
	    System.out.println(root.data);
	    System.out.println(root.L.data);
	    System.out.println(root.R.data);
	    System.out.println(root.L.L.data);
	    System.out.println(root.R.R.data);
	    System.out.println(root.R.R.L.data);
	    System.out.println(root.R.R.R.data);
	    System.out.println(root.R.R.L.data);
	    System.out.println(root.R.R.L.R.data);
	}
}