package VariablesyCondicionales;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        // Pedir el radio de un círculo y calcular su área. A=PI*r^2.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of a circle: ");
        double radius = Double.parseDouble(scanner.nextLine());

        double area = Math.PI*(radius*radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
