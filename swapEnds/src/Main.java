import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //first take the size of the array
        System.out.print("Enter the size of the first array: ");
        int arrSize = 0;
        if (sc.hasNextInt()) {
            arrSize = sc.nextInt();
        }

        //initialize the array size depending on the user input
        int[] arr = new int[arrSize];
        //ask the user to enter the elements
        System.out.println("Enter the elements of the array: ");
        //add the elements
        for (int i = 0; i < arrSize; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        //print result
        System.out.println("Swapped array: " + Arrays.toString(swapEnds(arr)));

    }

    public static int[] swapEnds(int[] arr){
        //define a variable for the length
        int arrLen = arr.length;

        //check if the length is at least 1
        if(arrLen>1){
            //define variable temp that will be used for swapping
            int temp;
            //swap
            temp = arr[0];
            arr[0] = arr[arrLen-1];
            arr[arrLen-1] = temp;
        }
        //return the swapped array
        return arr;
    }
}