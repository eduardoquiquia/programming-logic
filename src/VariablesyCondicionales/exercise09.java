package VariablesyCondicionales;

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        //  Pedir un número entre 0 y 9.9999 y decir cuantas cifras tiene.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 99.999: ");
        int number = Integer.parseInt(scanner.nextLine());

        if (number < 10 && number > 0) {
            System.out.println("The number has 1 digit.");
        } else if (number < 100 && number > 10) {
            System.out.println("The number has 2 digits.");
        } else if (number < 1000 && number > 100) {
            System.out.println("The number has 3 digits");
        } else if (number < 10000 && number > 1000) {
            System.out.println("The number has 4 digits.");
        } else if (number < 100000 && number > 10000) {
            System.out.println("The number has 5 digits.");
        } else {
            System.out.println("Invalid number");
        }
    }
}
