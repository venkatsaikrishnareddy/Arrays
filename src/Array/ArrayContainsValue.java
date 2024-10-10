package Array;

import java.util.Scanner;

public class ArrayContainsValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to search for: ");
        int value = scanner.nextInt();

        boolean found = false;
        for (int num : array) {
            if (num == value) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(value + " is found in the array.");
        } else {
            System.out.println(value + " is not found in the array.");
        }
    }
}
