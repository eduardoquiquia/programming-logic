package CondicionalesyBucles;
import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        //  Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
        //números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
        //cuando el usuario acierta.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int n = (int) (Math.random()*100) + 1;

        while (number != n) {
            if (number < n) {
                System.out.println("The number is less than N");
            } else {
                System.out.println("The number is greater than N");
            }

            System.out.print("Enter another number: ");
            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("They are equals, your got it right");
    }
}
