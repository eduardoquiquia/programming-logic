package CondicionalesyBucles;

import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        //  Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (number != 0) {
            sum += number;

            System.out.print("Enter another number: ");
            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
