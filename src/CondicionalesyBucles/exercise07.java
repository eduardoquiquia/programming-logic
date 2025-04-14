package CondicionalesyBucles;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        //  Pedir números hasta que se introduzca uno negativo, y calcular la media.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int quantity = 0;
        int sum = 0;

        while (number > 0) {
            quantity++;
            sum += number;

            System.out.println("Enter another number: ");
            number = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("The average of the numbers is: " + (sum/quantity));
    }
}
