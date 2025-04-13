package VariablesyCondicionales;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        // Se desea desarrollar un programa que calcule el índice de masa corporal de una persona.
        // Para ello, se requiere definir el peso de la persona (en kilogramos) y su estatura (en metros).
        // El índice de masa corporal (IMC) se calcula utilizando la siguiente fórmula: IMC = peso/estatura2

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in (kg): ");
        int weight = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your height: ");
        double height = Double.parseDouble(scanner.nextLine());

        System.out.println("The person has a weight = " + weight + "kg | height = " + height);
        double imc = weight / (height*height);

        if (imc < 16) {
            System.out.print("Severe thinness");
        } else if (imc < 17) {
            System.out.print("Moderate thinness");
        } else if (imc < 18.5) {
            System.out.print("Mild thinness");
        } else if (imc < 25) {
            System.out.print("Normal weight");
        } else if (imc < 30) {
            System.out.print("Overweight");
        } else if (imc < 35) {
            System.out.print("Mild obesity");
        } else if (imc < 40) {
            System.out.print("Moderate obesity");
        } else {
            System.out.print("Morbit obesity");
        }
    }
}
