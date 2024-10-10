package Array;

import java.util.Scanner;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int[] evenArray = new int[n];
        int[] oddArray = new int[n];
        int evenIndex = 0, oddIndex = 0;

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0) {
                evenArray[evenIndex++] = array[i];
            } else {
                oddArray[oddIndex++] = array[i];
            }
        }

        System.out.println("Array with even numbers first, then odd numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArray[i] + " ");
        }
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArray[i] + " ");
        }
    }
}
