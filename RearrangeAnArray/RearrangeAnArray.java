import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RearrangeAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = 0;

        //first get the size of the array
        while (true) {
            System.out.print("Enter the size of the array: ");
            //add try-catch block for error handling
            try {
                arrSize = sc.nextInt(); //take the input from the user
                //check that the size is bigger than 0, if yes, break out the block
                if (arrSize > 0) {
                    break;
                } else {
                    System.out.println("invalid input, the size should be a number");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                //clear the user choice
                sc.next();
            }
        }

        //initialize the array
        int[] arr = new int[arrSize];

        //ask the user to enter the elements
        System.out.printf("Enter %d elements to the array: \n", arrSize);
        for (int i = 0; i < arrSize; i++) {
            //add try-catch for error handling
            while (true) {
                try {
                    arr[i] = sc.nextInt();
                    break; //exit the loop when a valid number is entered
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input!!");
                    //clear the user choice
                    sc.next();
                }
            }
        }

        //print results
        System.out.println("Rearrange array: " + Arrays.toString(rearrangeArray(arr)));

    }

    public static int[] rearrangeArray(int[] arr) {
        //outer loop will access the element of the array
        //the goal is to find 4 and place it in the right position which is after 3
        for(int i = 0; i < arr.length; i++) {
            //the inner loop will check if there is a 3
            //the loop will start from 0, so we can search from the left or the right of the current element
            for(int j=0; j<arr.length; j++) {
                //check if the current element is 4, and the other element is 3
                if(arr[i] ==4 && arr[j] == 3) {
                    //swap the 4 with the element next to 3
                    //arr[i] is the 4
                    //arr[j+1] is the element next to 3
                    int temp = arr[j+1];
                    arr[j+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        //return the rearranged array
        return arr;
    }
}
