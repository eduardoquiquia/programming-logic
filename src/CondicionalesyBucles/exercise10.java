package CondicionalesyBucles;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        // Pedir 15 números y escribir la suma total.

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (count < 15) {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;

            count++;
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
