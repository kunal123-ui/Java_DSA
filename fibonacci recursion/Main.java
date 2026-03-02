import java.util.*;
public class Main{
    static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n =sc.nextInt();
            System.out.print(fibo(n));
    }
}
