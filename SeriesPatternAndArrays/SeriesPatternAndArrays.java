import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SeriesPatternAndArrays {
    public static void main(String[] args) {
        //ask the user for input
        Scanner sc = new Scanner(System.in);
        int number=0;
        while(true) {
            System.out.print("Enter a number: ");
            try{
                number = sc.nextInt();
                //the number should be bigger or equal to zero
                if (number >= 0) {
                    break;
                } else {
                    System.out.println("invalid input, try again");
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid input");
                //clear the user choice
                sc.next();
            }
        }
        //print the result
        System.out.print("New array: " + Arrays.toString(seriesUp(number)));


    }

    public static int[] seriesUp(int n) {
        //calculate the size of the array
        int size = n * (n + 1) / 2;
        //initialize the array
        int[] arr = new int[size];
        //define variable index to keep track of the numbers in the array
        int index = 0;

        //outer loop will iterate through the numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            //inner loop will add the sequence
            for (int j = 1; j <= i; j++) {
                //add elements to the array
                arr[index++] = j;
            }
        }
        //return the array
        return arr;
    }
}
