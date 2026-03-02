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
	static void addedge(int src,int des)
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
	static void dis()
	{
		for(int i=0; i<size; i++)
		{
			System.out.print("vertex "+i+" :");
			node temp=a[i];
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}

	}
	static void del(int src, int des) {
        if (a[src] == null)
            return;
        if (a[src].data == des) {
            a[src] = a[src].next;
            return;
        }
        node temp = a[src];
        while (temp.next != null) {
            if (temp.next.data == des) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		a=new node[size];
		addedge(0,1);
		addedge(0,3);
		addedge(0,4);
		addedge(1,2);
		addedge(1,3);
		addedge(1,4);
		addedge(2,0);
		addedge(2,4);
		addedge(3,1);
		addedge(3,2);
		addedge(4,0);
		addedge(4,1);
		addedge(4,3);
		dis();
		System.out.println("After delete");
		del(2,4);
		dis();
	}
}