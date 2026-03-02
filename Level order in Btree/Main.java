import java.util.*;
class node 
{
    int data;
    node L,R;
    node(int v)
    {
        data=v;
        L=R=null;
    }
}
public class Main
{
    static node root=null;
    static void inorder(node r)
    {
        if(r==null)
        return;
        
        inorder(r.L);
        System.out.print(r.data+" ");
        inorder(r.R);
    }
    static int countNodes(node r)
    {
        if(r==null)
        return 0;
        
        return countNodes(r.L)+countNodes(r.R)+1;
    }
    static boolean isfullBT(node r)
    {
        if(r==null)
        return true;
        else if(r.L==null && r.R==null)
        return true;
        else if(r.L!=null && r.R!=null)
        return isfullBT(r.L)&&isfullBT(r.R);
        
        return false;
    }
    static int findmax(node r)
    {
        if(r==null)
        return -1;
       
        return Math.max(r.data,Math.max(findmax(r.L),findmax(r.R)));
    }
    static int maxDepth(node r)
    {
        if(r==null)
        return 0;
        return Math.max(maxDepth(r.L),maxDepth(r.R))+1;
    }
    static void levelorder(node r,int i)
    {
        if(r==null)
        return;
        else if(i==0)
        System.out.print(r.data+" ");
        else if(i>0)
        {
            levelorder(r.L,i-1);
            levelorder(r.R,i-1);
        }
    }
	public static void main(String[] args) {
		root=new node(1);
		root.L=new node(2);
		root.R=new node(3);
		root.L.L=new node(12);
		root.L.R=new node(6);
		root.R.L=new node(16);
		root.R.R=new node(7);
		root.L.R.R=new node(80);
		inorder(root);
		System.out.print("\n"+countNodes(root));
		System.out.println(isfullBT(root)?"\nFull BT":"\nNot Full BT");
		System.out.println("Max element in BT : "+findmax(root));
		int h=maxDepth(root);
		System.out.print("Max depth of BT : "+h);
		System.out.println();
		for(int i=0;i<h;i++)
		{
		    levelorder(root,i);
		}
	}
}