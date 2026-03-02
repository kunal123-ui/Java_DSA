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
    static int size;
    static node head=null,tail=null;
    static void ins(int v)
    {
        node n=new node(v);
        if(head==null)
        head=tail=n;
        else 
        {
            tail.next=n;
            tail=n;
        }
    }
    static void mid()
    {
        int p=size%2==0?size/2:(size/2)+1;
        node temp=head;
        for(int i=1;i<p;i++){
        temp=temp.next;
        }
        if(size%2==0)
        System.out.println(temp.data+" "+temp.next.data);
        else 
        System.out.print(temp.data);
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		for(int i=1;i<=size;i++)
		ins(s.nextInt());
		mid();
	}
}