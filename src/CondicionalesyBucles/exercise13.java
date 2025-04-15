package CondicionalesyBucles;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        // Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la
        //cantidad de ceros.

        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int count_positives = 0;
        int sum_positives = 0;
        int count_negatives = 0;
        int sum_negatives = 0;
        int count_cero = 0;
        
        while (count < 10) {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            
            if (number > 0) {
                sum_positives += number;
                count_positives++;
            } else if (number < 0) {
                sum_negatives += number;
                count_negatives++;
            } else {
                count_cero ++;
            }
            count ++;
        }

        System.out.println("The average of the positive numbers is: " + sum_positives/count_positives);
        System.out.println("The average of the negative numbers is: " + sum_negatives/count_negatives);
        System.out.println("The amount of 0 is: " + count_cero);
    }
}
