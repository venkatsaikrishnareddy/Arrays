package Array;
import java.util.Scanner;

public class SwapTwoArraysWithTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the arrays: ");
        int n = scanner.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }

        // Swapping the arrays using a temporary variable
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = array1[i];
            array1[i] = array2[i];
            array2[i] = temp[i];
        }

        System.out.println("First array after swap:");
        for (int i : array1) {
            System.out.print(i + " ");
        }

        System.out.println("\nSecond array after swap:");
        for (int i : array2) {
            System.out.print(i + " ");
        }
    }
}
