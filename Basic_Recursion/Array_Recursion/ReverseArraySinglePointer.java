import java.util.Scanner;

public class ReverseArraySinglePointer {

    //printing array
    static void printArray(int ans[], int n){
        System.out.println("Reverse array is: \n");
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }


    static void reverseArray(int arr[], int n){
        int ans[] = new int[n];
        for(int i = n - 1; i>= 0; i--){
            ans[n - i - 1] = arr[i];
        }

        printArray(ans, n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Size of the array: ");
        int arrsize = scn.nextInt();

        //declaring Array of given size
        int arr[] = new int[arrsize];

        //taking the input for the array
        for(int i = 0; i < arrsize; i++){
            System.out.println("Enter the value at " + i +"th Index");
            arr[i] = scn.nextInt();
        }

        //printing the user input array
        System.out.println("The array is \n");
        for(int i = 0; i < arrsize;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        //Calling reverser array function
        reverseArray(arr, arrsize);
        scn.close();
    }
}



//This approach is based on single pointer 