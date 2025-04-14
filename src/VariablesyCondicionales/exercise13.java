package VariablesyCondicionales;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        //  Pedir un número entre 0 y 9.999, decir si es capicúa.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 99999: ");
        int number = Integer.parseInt(scanner.nextLine());
        int dm, um, c, d, u;

        u = number % 10;
        number /= 10;

        d = number % 10;
        number /= 10;

        c = number % 10;
        number /= 10;

        um = number % 10;
        number /= 10;

        dm = number;
        boolean capicua = false;

        if (dm == u && um == d) {
            capicua = true;
        } else if (dm == 0 && um == u && c == d) {
            capicua = true;
        } else if (dm == 0 && um == 0 && c == u) {
            capicua = true;
        } else if (dm == 0 && um == 0 && c == 0 && u == d) {
            capicua = true;
        }
        System.out.println("The number is capicua: " + capicua);
    }
}
