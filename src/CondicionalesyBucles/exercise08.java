package CondicionalesyBucles;

import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        //  Pedir un número N, y mostrar todos los números del 1 al N.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}
