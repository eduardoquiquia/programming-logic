package VariablesyCondicionales;

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        // Pedir un número e indicar si es positivo o negativo.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number = Double.parseDouble(scanner.nextLine());

        if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is positive.");
        }
    }
}
