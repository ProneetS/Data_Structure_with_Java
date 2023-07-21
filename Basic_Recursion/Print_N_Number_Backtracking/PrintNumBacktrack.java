import java.util.*;

public class PrintNumBacktrack {

    public static void Backtrack(int i, int N){
        if(i < 1){
            return;
        }
        Backtrack( i - 1, N);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        System.out.println();

        Backtrack(n, n);
        scn.close();
    }
}


// Printing Number from 1 to N using backtracking