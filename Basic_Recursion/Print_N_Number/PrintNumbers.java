import java.util.*;

public class PrintNumbers {
    public static void fun(int i, int n){
        if( i > n){
            return;
        }
        System.out.println(i);
        fun(i+1, n);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        System.out.println();

        fun(1, n);
        scn.close();
    }    
}


// Printing the numbers from 1 to N 