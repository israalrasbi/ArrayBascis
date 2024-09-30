import java.util.InputMismatchException;
import java.util.Scanner;

public class CountTheClumps {
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
        System.out.printf("Enter %d elements for the array: \n", arrSize);
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
        System.out.println("Number of clumps in the array: " + countClumps(arr));

    }
    public static int countClumps(int[] arr){
        //define variables
        int arrLen = arr.length;
        int count = 0; //this to keep track of clumps in the array
        int i =0; //this will be used in the loops to access the elements

        //outer while loop will iterate through the elements of the array
        while(i<arrLen){
            //define variables
            int currentElement = arr[i]; //this will store the current elements that will be used to compare
            int size = 0; //this will keep track of consecutive elements

            //inner while loop will count clumps
            //i<arrLen >> to avoid out of bound errors
            //currentElement == arr[i]>>check if we are still in the clump or not
            while((i<arrLen) && (currentElement == arr[i])){
                i++;
                size++; //this is to count how many times the element is encountered
            }
            //the clump should always be more than one, if yes increment the counter
            if(size>1){
                count++;
            }
        }

        return count;
    }
}
