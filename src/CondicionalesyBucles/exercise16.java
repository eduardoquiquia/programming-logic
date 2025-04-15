package CondicionalesyBucles;

import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        // Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        int count = 1;

        while (count <= 12) {
            System.out.println(number + " * " + count + " = " + (number*count));
            count++;
        }
    }
}
