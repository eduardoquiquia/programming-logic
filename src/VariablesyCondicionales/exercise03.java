package VariablesyCondicionales;

import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        // Pedir el radio de una circunferencia y calcular su longitud.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of a circle: ");
        double radius = Double.parseDouble(scanner.nextLine());

        double length = 2*Math.PI*radius;
        System.out.println("The length of a circle of radius " + radius + " is: " + length);
    }
}
