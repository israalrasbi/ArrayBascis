import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //read the first array
        System.out.println("Enter the size of the first array: ");
        int arrSize1 = sc.nextInt();
        //call the readArray function to add the elements
        int[] a = readArray(sc, arrSize1, "first");

        //read the second array
        System.out.println("Enter the size of the second array: ");
        int arrSize2 = sc.nextInt();
        int[] b = readArray(sc, arrSize2, "second");

        //print the result
        //get the String representation of array
        String strArr = Arrays.toString(front11(a, b));
        System.out.println("New list: " + strArr);

    }

    public static int[] front11(int[] a, int[] b) {
        //define variables for the arrays lengths
        int aLen = a.length;
        int bLen = b.length;

        //if both list are empty, then the output should be empty list
        if (aLen == 0 && bLen == 0) {
            return new int[]{};
        }
        //if a is empty, then the output should be only b items
        else if (aLen == 0 && bLen != 0) {
            return new int[]{b[0]};
        }

        //if b is empty, then the output should be only  items
        else if (bLen == 0 && aLen != 0) {
            return new int[]{a[0]};
        }
        //if both lists have items, then add the first item of each list
        else {
            return new int[]{a[0], b[0]};
        }
    }

    public static int[] readArray(Scanner sc, int arraySize, String arrayName) {
        //define the array
        int[] arr = new int[arraySize];
        //make sure the array is not empty
        if (arr.length > 0) {
            System.out.println("Enter " + arraySize+ " elements to the " + arrayName + " array:");
            //the user will enter the elements
            for (int i = 0; i < arraySize; i++) {
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                } else {
                    System.out.println("Invalid input. Please enter integers.");
                    sc.next(); // clear invalid input
                    i--; // repeat the input for the current index
                }
            }
        }
        return arr;
    }


}