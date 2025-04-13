package VariablesyCondicionales;

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        // Pedir dos números y decir si son iguales o no.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter another number: ");
        double number2 = Double.parseDouble(scanner.nextLine());

        if (number1 == number2) {
            System.out.println("They are equal.");
        } else {
            System.out.println("They are different.");
        }
    }
}
