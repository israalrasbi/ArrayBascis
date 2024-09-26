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
        System.out.println("New array: " + Arrays.toString(frontPiece(arr)));

    }

    public static int[] frontPiece(int[] arr){
        int arrLen = arr.length;
        //if the array length is 0, return an empty array
        //this will avoid ArrayIndexOutOfBoundsException error
        if (arrLen == 0) {
            return new int[0];
        }
        //if the array is less than 2, then take whatever element is there
        if (arrLen < 2){
            //created a new list with size 1
            int[] newArr = new int[1];
            //added item to the list
            newArr[0] = arr[0];
            //return the list
            return newArr;
        }
        //else, the array has more than 2 items
        int[] newArr = new int[2];
        newArr[0] = arr[0];
        newArr[1] = arr[1];
        return newArr;
    }
}