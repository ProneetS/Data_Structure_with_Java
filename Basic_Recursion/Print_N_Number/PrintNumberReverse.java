import java.util.*;

public class PrintNumberReverse {
    public static void fun(int i, int n){
        if( i < 1){
            return;
        }
        System.out.println(i);
        fun(i-1, n);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        System.out.println();

        fun(n, n);
        scn.close();
    }    
}
