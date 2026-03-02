import java.util.*;
class node
{
	char data;
	node next;
	node(char v)
	{
		data=v;
		next=null;
	}
}
public class Main
{
	static int size;
	static node top=null;
	static void push(char v)
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
	static char pop()
	{
		char d;
		if(isEmpty())
		{
			return '0';
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
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		int f=0;
		for(int i=0; i<a.length(); i++)
		{
			if(a.charAt(i)=='(')
				push(')');
			else if(a.charAt(i)=='[')
				push(']');
			else if(a.charAt(i)=='{') 
				push('}');
			else if(isEmpty()||pop()!=a.charAt(i))
			{
				f=1;
				break;
			}
		}
		System.out.println(isEmpty()&&f==0?"Valid":"Invalid");
	}
}