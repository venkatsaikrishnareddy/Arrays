package Array;

import java.util.Scanner;

public class CommonElementsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        String[] array1 = new String[n1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextLine();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        String[] array2 = new String[n2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextLine();
        }

        System.out.println("Common elements:");
        for (String element1 : array1) {
            for (String element2 : array2) {
                if (element1.equals(element2)) {
                    System.out.println(element1);
                    break;
                }
            }
        }
    }
}
