class Node {
	int data;
	Node next;

	public Node(int d) {
		data = d;
		next = null;
	}
}

class Queue {
	Node front, rear;

	public Queue() {
		front =rear = null;
	}

	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (rear == null) {
			front = rear = newNode;
		}
		else 
		{
		rear.next = newNode;
		rear = newNode;
		}
	}

	public int dequeue() {
		if (front == null) {
			return -1;
		}
		int data = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		return data;
	}

	public boolean isEmpty() {
		return front == null;
	}
}

class Graph {
	int size;
	Node[] adjList;

	public Graph(int V) {
		size= V;
		adjList = new Node[size];
	}
	public void add(int src, int dest) {
		Node newNode = new Node(dest);
		if(adjList[src]==null)
			adjList[src] = newNode;
		else {
			Node t= adjList[src];
			while(t.next!=null)
				t=t.next;
			t.next=newNode;
		}
	}


	public void BFS(int source) {
		boolean[] visited = new boolean[size];
		Queue queue = new Queue();

		visited[source] = true;
		queue.enqueue(source);

		while (!queue.isEmpty()) {
			int current = queue.dequeue();
			System.out.print(current + " ");

			Node temp = adjList[current];
			while (temp != null) {
				int neighbor = temp.data;
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					queue.enqueue(neighbor);
				}
				temp = temp.next;
			}
		}
	}
}
public class Main {
	public static void main(String[] args) {
		Graph m = new Graph(5);
		m.add(0,1);
		m.add(0,2);
		m.add(1,0);
		m.add(1,2);
		m.add(1,4);
		m.add(2,0);
		m.add(2,1);
		m.add(2,3);
		m.add(3,2);
		m.add(3,4);
		m.add(4,1);
		m.add(4,3);

		System.out.println("BFS Traversal starting from vertex 0:");
		m.BFS(0);
	}
}
