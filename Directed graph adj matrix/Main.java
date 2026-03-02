import java.util.*;
public class Main
{
    static int size;
    static int a[][];
    static void addedge(int src,int des)
    {
        a[src][des]=1;
  
  //     a[des][src]=1   //   for undirected graph
    }
    static void dis()
    {
        System.out.print("V ");
        for(int i=0;i<size;i++)
        System.out.print(i+" ");
        System.out.println();
        for(int i=0;i<size;i++)
        {
            System.out.print(i+" ");
            for(int j=0;j<size;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		a=new int[size][size];
	    addedge(0,1);
	    addedge(0,3);
	    addedge(1,3);
	    addedge(2,0);
	    addedge(2,4);
	    addedge(3,2);
	    addedge(4,1);
	    dis();
	}
}