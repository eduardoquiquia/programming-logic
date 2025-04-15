package CondicionalesyBucles;

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        // Escribir todos los números del 100 al 0 de 7 en 7.

        int number = 100;

        while (number >= 0) {
            System.out.println(number);
            number -= 7;
        }
    }
}
