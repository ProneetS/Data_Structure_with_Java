import java.util.*;

public class PrintName {

    public static void fun(int i, int n){
        if( i > n){
            return;
        }
        System.out.println("proneet");
        fun(i+1, n);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();

        fun(1, n);
        scn.close();
    }    
}
