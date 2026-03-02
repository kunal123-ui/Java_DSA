import java.util.*;  
public class Main
{
    static int size, i;
    static int[] a;     
    static void ins(int v){
        if(i == size)
            resize();
        a[i] = v;
        i++;
    }
    static void resize(){
        size = size*2;
        a = Arrays.copyOf(a, size); 
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        a = new int[size];
        for(i = 0; i < size; i++)
            a[i] = s.nextInt();
            System.out.println(Arrays.toString(a));
        ins(6);
         System.out.println(Arrays.toString(a));
        ins(7);
        ins(8);
        System.out.println(Arrays.toString(a));
    }
}
