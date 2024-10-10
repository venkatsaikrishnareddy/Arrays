package Array;

import java.util.Arrays;
import java.util.Scanner;

public class KLargestElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        Arrays.sort(array);  // Sort array

        System.out.println("The " + k + " largest elements are:");
        for (int i = n - 1; i >= n - k; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
