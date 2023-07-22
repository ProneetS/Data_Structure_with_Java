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


//This is Parameterized way of calling a Function through Parameter. Where we are returning the value and not the function. 
// It means all the work are done through parameter value calculation. 