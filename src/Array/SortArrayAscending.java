package Array;

import java.util.Scanner;
import java.util.Arrays;

public class SortArrayAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Array in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
