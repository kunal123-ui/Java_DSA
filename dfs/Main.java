import java.util.*;
class node 
{
    int data;
    node next;
    node(int v)
    {
        data=v;
        next=null;
    }
}
public class Main
{
    static int size;
    static node a[];
    static boolean vis[];
    static void add(int src,int des)
    {
        node n=new node(des);
        if(a[src]==null)
        a[src]=n;
        else 
        {
            node temp=a[src];
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    static void dfs(int src)
    {
        vis[src]=true;
        System.out.print(src+" ");
        node temp=a[src];
        while(temp!=null)
        {
            int ne=temp.data;
            if(!vis[ne])
            {
                dfs(ne);
            }
            temp=temp.next;
        }
        
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		a=new node[size];
		vis=new boolean[size];
	    add(0,1);
		add(0,2);
		add(1,0);
		add(1,2);
		add(1,4);
		add(2,0);
		add(2,1);
		add(2,3);
		add(3,2);
		add(3,4);
		add(4,1);
		add(4,3);
		dfs(0);
	}
}