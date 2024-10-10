package Array;

import java.util.Scanner;

public class SwapThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b + ", c = " + c);

        // Swap using temporary variable
        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b + ", c = " + c);
    }
}
