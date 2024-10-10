package Array;

import java.util.Scanner;

public class RemoveArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to remove: ");
        int value = scanner.nextInt();

        int[] newArray = new int[n - 1];
        int index = 0;
        boolean removed = false;

        for (int i = 0; i < n; i++) {
            if (array[i] == value && !removed) {
                removed = true;
                continue;
            }
            if (index < newArray.length) {
                newArray[index++] = array[i];
            }
        }

        System.out.println("Array after removing " + value + ":");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
