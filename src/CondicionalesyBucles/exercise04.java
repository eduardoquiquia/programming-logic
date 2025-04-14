package CondicionalesyBucles;
import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        // Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int quantity = 0;

        while (number >= 0) {
            quantity += 1;

            System.out.print("Enter another number: ");
            number = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Quantity: " + quantity);
    }
}
