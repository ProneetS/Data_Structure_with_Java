import java.util.*;

public class ParametrizedWay {

    public static void Param(int sum, int i){
        if(i < 1){
            System.out.println("The sum is: "+sum);
            return;
        }

        Param(sum + i, i -1);
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        System.out.println();

        Param(0,n);
        
        scn.close();
    }
}
