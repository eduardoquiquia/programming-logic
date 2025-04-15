package CondicionalesyBucles;

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        // Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum_salary = 0;
        int count_salary = 0;

        while (count < 10) {
            System.out.print("Enter a salary: ");
            int salary = Integer.parseInt(scanner.nextLine());

            sum_salary += salary;

            if (salary > 1000) {
                count_salary++;
            }

            count++;
        }

        System.out.println("The sum of the wages is: " + sum_salary);
        System.out.println("Number of salaries greater than 1000: " + count_salary);
    }
}
