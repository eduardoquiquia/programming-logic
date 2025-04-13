package VariablesyCondicionales;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        // Pedir dos números y decir cual es el mayor.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of (a): ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the value of (b): ");
        double b = Double.parseDouble(scanner.nextLine());

        if (a > b) {
            System.out.println("A is greather than B.");
        } else if (b > a) {
            System.out.println("B is greather than A");
        } else {
            System.out.println("A is equal to B");
        }
    }
}
