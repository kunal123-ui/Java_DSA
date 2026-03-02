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
	static node top=null;
	static void push(int v)
	{
		node n=new node(v);
		if(top==null)
			top=n;
		else
		{
			n.next=top;
			top=n;
		}
	}
	static void dis()
	{
		node temp=top;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	static int pop()
	{
		int d;
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			d=top.data;
			top=top.next;
		}
		return d;
	}
	static boolean isEmpty()
	{
		return top==null;
	}
	static int peek()
	{
		return top.data;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		for(int i=0; i<size; i++) {
			push(s.nextInt());
		}
		dis();
		System.out.println(pop());
		dis();
		System.out.println(peek());
	}
}