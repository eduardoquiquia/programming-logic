package VariablesyCondicionales;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        // Hacer un programa que determine si un año es bisiesto o no.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the date of a year: ");
        int year = Integer.parseInt(scanner.nextLine());

        if (year%4 == 0 && year%100 != 0) {
            System.out.print("The year is a leap year.");
        } else if (year%4 == 0 && year%100 == 0 && year%400 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
