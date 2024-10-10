package Array;

import java.util.Scanner;

public class FindDuplicateStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        String[] array = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }

        System.out.println("Duplicate values in the array:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }
}
