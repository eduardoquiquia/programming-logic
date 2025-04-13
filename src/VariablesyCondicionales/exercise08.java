package VariablesyCondicionales;

import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        //  Pedir tres números y mostrarlos ordenados de mayor a menor.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the second number: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the third number: ");
        double c = Double.parseDouble(scanner.nextLine());

        if (a > b && a > c) {
            if (b<c) {
                System.out.println(a + " | " + c + " | " + b);
            } else {
                System.out.println(a + " | " + b + " | " + c);
            }
        } else if (b > a && b > c) {
            if (a<c) {
                System.out.println(b + " | " + c + " | " + a);
            } else {
                System.out.println(b + " | " + a + " | " + c);
            }
        } else {
            if (a<b) {
                System.out.println(c + " | " + b + " | " + a);
            } else {
                System.out.println(c + " | " + a + " | " + b);
            }
        }
    }
}
