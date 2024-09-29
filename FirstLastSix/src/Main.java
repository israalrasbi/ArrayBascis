import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Check if the number six is in the start or the end of the array");
        Scanner sc = new Scanner(System.in);
        //first take the size of the array
        System.out.println("Enter the size of the array: ");
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

        System.out.println("Does 6 in the start or the end of the array? " + firstLast6(arr));

    }
    public static boolean firstLast6 (int[] arr){
        return arr[0] == 6 || arr[arr.length-1] == 6;
    }
}