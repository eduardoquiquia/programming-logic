package CondicionalesyBucles;

public class exercise11 {
    public static void main(String[] args) {
        // Diseñar un programa que muestre el producto de los 10 primeros números impares.

        int count = 0;
        int product = 1;
        int number = 1;

        while (count < 10) {
            if (number%2 != 0) {
                product *= number;
                count++;
            }

            number++;
        }

        System.out.println("The product of odd numbers is: " + product);
    }
}
