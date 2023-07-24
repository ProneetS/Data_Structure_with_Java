import java.util.Scanner;

public class FactorialNum {


    public static int Factorial(int n){
        if( n == 0){
            return 1;
        }
        return n * Factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to know its factorial: ");
        int n = scn.nextInt();
        System.out.println();

        System.out.println("The factorial of " + n + " is "+ Factorial(n));
        scn.close();
    }
}
