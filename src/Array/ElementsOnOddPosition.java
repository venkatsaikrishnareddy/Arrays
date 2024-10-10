package Array;

import java.util.Scanner;

public class ElementsOnOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Elements on odd positions (0-based index):");
        for (int i = 0; i < n; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}
