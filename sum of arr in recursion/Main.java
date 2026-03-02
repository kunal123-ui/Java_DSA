import java.util.*;
public class Main{
    static int sum(int[]a,int n){
        if(n==0)
        return a[n];
        return a[n-1] +sum(a,n-1);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
		System.out.println(sum(a,n));
	}
}