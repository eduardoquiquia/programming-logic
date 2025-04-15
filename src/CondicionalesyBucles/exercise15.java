package CondicionalesyBucles;

import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        // Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos
        // mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum_age = 0;
        double sum_height = 0;
        int count_height = 0;
        int count_students = 0;

        while (count < 5) {
            System.out.print("Enter a student's age: ");
            int age = Integer.parseInt(scanner.nextLine());
            sum_age += age;

            System.out.print("Enter a student's height: ");
            double height = Double.parseDouble(scanner.nextLine());
            System.out.println("----------------------------------------");
            sum_height += height;

            if (age >= 18) {
                count_students++;
            }

            if (height > 1.75) {
                count_height++;
            }
            count++;
        }

        System.out.println("The average age of the students is: " + sum_age/5);
        System.out.println("The average height of the students is: " + sum_height/5);
        System.out.println("The number of students over 18 is: " + count_students);
        System.out.println("The number of students who are taller than 1.75 is: " + count_height);
    }
}
