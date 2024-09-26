import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //first take the size of the array
        System.out.println("Enter the size of the first array, note it should be odd: ");
        int arrSize = 0;
        if (sc.hasNextInt()) {
            arrSize = sc.nextInt();
        }

        //initialize the array size depending on the user input
        //check that the array size if odd, if even stop the program
        if(arrSize % 2 == 0) {
            System.out.println("The array size should be odd");
            return;
        }
        //if the array size is odd, then initialize the array
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
        System.out.println("The maximum element is: " +maxTriple(arr));


    }

    public static int maxTriple(int[] arr){
        //define variables to store the value of first, last, and middle element
        int firstElement = arr[0];
        int lastElement = arr[arr.length-1];
        int middleElement = arr[arr.length/2];
        //return the max using the math library
        return Math.max(firstElement,Math.max(lastElement,middleElement));
    }
}