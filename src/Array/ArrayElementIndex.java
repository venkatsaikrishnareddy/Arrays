package Array;

import java.util.Scanner;

public class ArrayElementIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to find its index: ");
        int value = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The index of " + value + " is: " + index);
        } else {
            System.out.println(value + " is not found in the array.");
        }
    }
}
