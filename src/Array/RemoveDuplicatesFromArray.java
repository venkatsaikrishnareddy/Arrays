package Array;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        System.out.println("Array after removing duplicates:");
        for (int i : array) {
            if (set.add(i)) {  // Set only adds unique elements
                System.out.print(i + " ");
            }
        }
    }
}
