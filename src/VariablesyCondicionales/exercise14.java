package VariablesyCondicionales;

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        // Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade between 0 and 10: ");
        int grade = Integer.parseInt(scanner.nextLine());

        if (grade >= 0 && grade <= 5) {
            System.out.print("Insufficient");
        } else if (grade >= 6 && grade <= 8) {
            System.out.print("Enough");
        } else if (grade >= 9 && grade <= 10) {
            System.out.println("Good");
        } else {
            System.out.print("Invalid number");
        }
    }
}
