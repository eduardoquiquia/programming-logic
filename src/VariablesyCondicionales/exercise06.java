package VariablesyCondicionales;

import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        // Pedir dos números y decir si uno es múltiplo del otro.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter another number: ");
        double number2 = Double.parseDouble(scanner.nextLine());

        if (number1%number2 == 0) {
            System.out.println("They are multiples.");
        } else {
            System.out.println("The are not multiples.");
        }
    }
}
