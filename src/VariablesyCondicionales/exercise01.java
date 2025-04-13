package VariablesyCondicionales;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class exercise01 {
    public static void main(String[] args) {
        // Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales.
        // Si no existen, debe indicarlo.

        Scanner scanner = new Scanner(System.in);
        double x1, x2, d;

        System.out.println("Enter the value of (a): ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the value of (b): ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the value of (c): ");
        double c = Double.parseDouble(scanner.nextLine());

        d = ((b*b) - 2*a*c);

        if (d == 0) {
            System.out.println("There are no real solutions");
        } else {
            x1 = (-b + sqrt((b*b) - 4*a*c)) / (2*a);
            x2 = (-b - sqrt((b*b) - 4*a*c)) / (2*a);

            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
    }
}
