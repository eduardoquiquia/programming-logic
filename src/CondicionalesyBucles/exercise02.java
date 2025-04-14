package CondicionalesyBucles;
import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        // Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        while (number != 0) {
            if (number < 0) {
                System.out.println("The number is negative");
            } else {
                System.out.println("The number is positive");
            }

            System.out.print("Enter another number: ");
            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Closed Program");
    }
}
