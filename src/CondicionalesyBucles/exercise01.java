package CondicionalesyBucles;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        //  Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        while (number > 0) {
            System.out.println("number² => " + (number*number));

            System.out.print("Enter another number: ");
            number = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Closed Program");
    }
}
