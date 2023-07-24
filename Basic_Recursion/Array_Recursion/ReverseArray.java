import java.util.Scanner;

public class ReverseArray {


    public static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
        }
     }

    public static void reverseArray(int arr[], int n){
        int p1 = 0, p2 = n - 1;
        while (p1 < p2) {
           int tmp = arr[p1];
           arr[p1] = arr[p2];
           arr[p2] = tmp;
           p1++;
           p2--;
        }

        printArray(arr, n);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int arrSize = scn.nextInt();
        System.out.println();

        int[] arr = new int[arrSize];
        for(int i = 0; i < arrSize; i++){
            arr[i] = scn.nextInt();
        }

        reverseArray(arr, arrSize);

        scn.close();
    }    
}


//Reverse An array using two pointer method in recursion 
