package CondicionalesyBucles;

import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        // Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        while (number != 0) {
            if (number%2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }

            System.out.print("Enter another number: ");
            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Closed Program");
    }
}
