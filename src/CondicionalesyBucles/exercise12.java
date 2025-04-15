package CondicionalesyBucles;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        // Pedir un número y calcular su factorial.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int factorial = 1;

        while (number >= 1) {
            factorial *= number;
            number--;
        }

        System.out.println("The factorial of the number is: " + factorial);
    }
}
