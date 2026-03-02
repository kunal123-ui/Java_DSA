import java.util.*;

class node
{
	int data;
	node next, prev;

	node(int v)
	{
		data = v;
		next = prev = null;
	}
}

public class Main
{
	static int size = 0;
	static node head = null, tail = null;

	// insert at end
	static void ins(int v)
	{
		node n = new node(v);
		if (head == null)
			head = tail = n;
		else
		{
			tail.next = n;
			n.prev = tail;
			tail = n;
		}
		size++;
	}

	// display forward and backward
	static void dis()
	{
		node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

		System.out.println();
		temp = tail;
		while (temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
		System.out.println();
	}
	static void insany(int v, int p)
	{
		if (p < 1 || p > size + 1)
		{
			System.out.println("out of range");
			return;
		}
		node n = new node(v);
		if (p == 1)
		{
			n.next = head;
			if (head != null)
				head.prev = n;
			head = n;
			if (tail == null)
				tail = n;
		}
		else if (p == size + 1)
		{
			tail.next = n;
			n.prev = tail;
			tail = n;
		}
		else
		{
			node temp = head;
			for (int i = 1; i < p - 1; i++)
				temp = temp.next;

			n.next = temp.next;
			n.prev = temp;
			temp.next.prev = n;
			temp.next = n;
		}
		size++;
	}
	static void delany(int p)
	{
		if (p < 1 || p > size)
		{
			System.out.println("out of range");
			return;
		}

		if (p == 1)
		{
			head = head.next;
			if (head != null)
				head.prev = null;
			else
				tail = null;
		}
		else if (p == size)
		{
			tail = tail.prev;
			tail.next = null;
		}
		else
		{
			node temp = head;
			for (int i = 1; i < p; i++)
				temp = temp.next;
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
		}
		size--;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++)
			ins(s.nextInt());
		dis();
		insany(s.nextInt(), s.nextInt());
		dis();
		delany(s.nextInt());   // pass position
		dis();
	}
}
