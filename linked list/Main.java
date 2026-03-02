import java.util.*;
class node 
{
    int data;     // Line 4 and 5 node part declaration
    node next;
    node(int v) //constructor 
    {
        data=v; //  line 6 to 10 node part initialisation
        next=null;
    }
}
public class Main
{
    static int size;//list size variable declaration 
    static node head=null,tail=null; //starting point and end point variable declaration
    static void ins(int v)   //Line 16 to 26 List creating
    {
        node n=new node(v); // node creating 
        if(head==null)
        head=tail=n;       // starting and end point initialisation
        else 
        {
            tail.next=n;   // node connection 
            tail=n;     // change newnode as end node 
        }
    }
   static void delany(int p){
     if (p == 1) {                // check position is 1st or not
        head = head.next;             // move head
        size--;
    }
    else  
    {
        node temp = head;
        for (int i = 2; i < p; i++) { // iterate the position
            temp = temp.next;         // iterate the node
        }
        temp.next = temp.next.next;   // remove the node
        
    }
}
static void dis()
    {
        node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void insf(int v)
    {
        node n=new node(v);
        n.next=head; //connect new node to head
        head=n;     //change new node as head
        size++;    //inc size of list
    }
    static void insany(int v,int p)
    {
        if(p>size+1) //check position out of range
        System.out.println("out of range");
        else if(p==1) //check position is 1st or not
        insf(v);
        else 
        {
            node n=new node(v);
            node temp=head;
            for(int i=2;i<p;i++){// iterate the position
            temp=temp.next; //iterate the node 
            }
            n.next=temp.next; //connect new node to next node 
            temp.next=n;      //connect previous node to new node
            size++;
        }
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of list:");
	     size=s.nextInt();//getting list size
		System.out.println("Enter the values of list:");
		for(int i=1;i<=size;i++){
		ins(s.nextInt());}  //insert  method calling
		dis();//display method calling 
		System.out.println("\nEnter the new value of list:");
		insf(s.nextInt());//insert 1st method calling
		dis();
		System.out.println("\nEnter the new value and pos of list:");
		insany(s.nextInt(),s.nextInt());//insert any position method calling
		dis();
	}
}