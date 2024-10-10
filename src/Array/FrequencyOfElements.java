package Array;

import java.util.Scanner;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int[] frequency = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            frequency[i] = -1;  // Initialize frequency array
        }

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                    frequency[j] = 0;  // Mark as counted
                }
            }
            if (frequency[i] != 0) {
                frequency[i] = count;
            }
        }

        System.out.println("Frequency of each element:");
        for (int i = 0; i < n; i++) {
            if (frequency[i] != 0) {
                System.out.println(array[i] + " occurs " + frequency[i] + " times.");
            }
        }
    }
}
