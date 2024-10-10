package Array;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];  // Array to copy elements into

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        // Copy elements from array1 to array2
        for (int i = 0; i < n; i++) {
            array2[i] = array1[i];
        }

        System.out.println("Elements of the second array after copying:");
        for (int i : array2) {
            System.out.print(i + " ");
        }
    }
}
