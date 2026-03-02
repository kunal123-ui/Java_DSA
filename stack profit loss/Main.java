import java.util.*;
class node 
{
    int data;
    node next;
    node(int v)
    {
        data=v;next=null;
    }
}
public class Main
{
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
    static int pop()
    {
        int d;
        if(isEmpty())
        {
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
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++){
		a[i]=s.nextInt();
		}
		int res[]=new int[size];
		push(0);
		res[0]=1;
		for(int i=1;i<size;i++){
		    while(!isEmpty()&&a[i]>=a[peek()])
		        pop();
		    
		    res[i]=isEmpty()?i+1:i-peek();
		    push(i);
		}
		System.out.println(Arrays.toString(res));
	}
}