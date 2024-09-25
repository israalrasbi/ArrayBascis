import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //first take the size of the array
        System.out.println("Enter the size of the first array: ");
        int arr1_size = 0;
        if (sc.hasNextInt()) {
            arr1_size = sc.nextInt();
        }

        //initialize the array size depending on the user input
        int[] a = new int[arr1_size];

        //ask the user to enter the elements
        System.out.println("Enter the elements of the first array: ");
        //add the elements
        for (int i = 0; i < arr1_size; i++) {
            if (sc.hasNextInt()) {
                a[i] = sc.nextInt();
            }
        }

        //take the size of the array
        System.out.println("Enter the size of the second array: ");
        int arr2_size = 0;
        if (sc.hasNextInt()) {
            arr2_size = sc.nextInt();
        }

        //initialize the array size depending on the user input
        int[] b = new int[arr2_size];

        //ask the user to enter the elements
        System.out.println("Enter the elements of the first array: ");
        //add the elements
        for (int i = 0; i < arr2_size; i++) {
            if (sc.hasNextInt()) {
                b[i] = sc.nextInt();
            }
        }
        //print the result
        System.out.println("Does the arrays have common ends? " + commonEnd(a, b));

    }

    public static boolean commonEnd(int[] a, int[] b) {
        //define variables to take the length of both arrays
        int aLen=a.length;
        int bLen=b.length;
        return a[0] == b[0] || a[aLen-1] == b[bLen-1];
    }
}