import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[2];
        //ask the user to enter the elements
        System.out.println("Enter two elements for the first array: ");
        //add the elements
        for (int i = 0; i < 2; i++) {
            if (sc.hasNextInt()) {
                arr1[i] = sc.nextInt();
            }
        }

        int[] arr2 = new int[2];
        //ask the user to enter the elements
        System.out.println("Enter two elements for the second array: ");
        //add the elements
        for (int i = 0; i < 2; i++) {
            if (sc.hasNextInt()) {
                arr2[i] = sc.nextInt();
            }
        }

        System.out.println("The bigger array is:  " + Arrays.toString(biggerTwo(arr1,arr2)));


    }
    public static int[] biggerTwo(int[] a, int[] b) {
        //calculate the sum of each array
        int sumOfA = a[0] + a[1];
        int sumOfB = b[0] + b[1];

        //check if the sum of a is bigger, then return a
        if (sumOfA > sumOfB) {
            return a;
        }
        //check if the sum of b is bigger, then return b
        else if (sumOfA < sumOfB) {
            return b;
        }
        //else, both has the same sum, then return a
        else{
            return a;
        }

    }
}