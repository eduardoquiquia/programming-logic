package VariablesyCondicionales;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        // Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 99999: ");
        int number = Integer.parseInt(scanner.nextLine());
        int dm, um, c, d, u;

        u = number%10;
        number /= 10;

        d = number%10;
        number /= 10;

        c = number%10;
        number /= 10;

        um = number%10;
        number /= 10;

        dm = number;

        System.out.println(u + " | " + d + " | " + c + " | " + um + " | " + dm);
    }
}
