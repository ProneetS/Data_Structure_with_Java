import java.util.*;

public class PrintRevNumBacktrack {

    public static void RevnumBacktrack(int i, int n){

        if(i > n){
            return;
        }
        RevnumBacktrack(i + 1, n);
        System.out.println(i);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scn.nextInt();
        System.out.println();

        RevnumBacktrack(1,n);
        scn.close();
    }
}
