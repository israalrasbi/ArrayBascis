import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //first take the size of the array
        System.out.println("Enter the size of the first array: ");
        int arrSize1 = 0;
        if (sc.hasNextInt()) {
            arrSize1 = sc.nextInt();
        }

        //initialize the array size depending on the user input
        int[] a = new int[arrSize1];
        if (a.length > 0) {
            //ask the user to enter the elements
            System.out.println("Enter the elements of the first array: ");
            //add the elements
            for (int i = 0; i < arrSize1; i++) {
                if (sc.hasNextInt()) {
                    a[i] = sc.nextInt();
                }
            }
        }



        //take the size of the array
        System.out.println("Enter the size of the second array: ");
        int arrSize2 = 0;
        if (sc.hasNextInt()) {
            arrSize2 = sc.nextInt();
        }

        //initialize the array size depending on the user input
        int[] b = new int[arrSize2];

        if(b.length > 0) {
            //ask the user to enter the elements
            System.out.println("Enter the elements of the first array: ");
            //add the elements
            for (int i = 0; i < arrSize2; i++) {
                if (sc.hasNextInt()) {
                    b[i] = sc.nextInt();
                }
            }
        }

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
}