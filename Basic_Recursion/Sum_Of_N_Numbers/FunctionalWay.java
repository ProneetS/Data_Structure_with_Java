import java.util.*;

public class FunctionalWay {

    public static int Func(int n){
        if(n == 0){
            return 0;
        }

        return n + Func(n - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        System.out.println();

        System.out.println("The sum of numbers till "+n+" is: " +Func(n));

        scn.close();
    }
}
