package Encapsulamiento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.println("¿Cuántos productos desea agregar? ");
        int quantity = Integer.parseInt(scanner.nextLine());

        for (int i=1; i<=quantity; i++) {
            System.out.println("Ingrese el código del producto: ");
            String code = scanner.nextLine();

            System.out.println("Ingrese la descripción del producto: ");
            String description = scanner.nextLine();

            System.out.println("Ingrese el precio del producto: ");
            double price = Double.parseDouble(scanner.nextLine());

            Product product = new Product(code, description, price);
            products.add(product);
        }

        for (Product product: products) {
            System.out.println("---------------------------------------------");
            System.out.println("Code: " + product.GetCode());
            System.out.println("Description: " + product.GetDescription());
            System.out.println("Price: " + product.GetPrice());
            System.out.println("----------------------------------------------");
        }
    }
}
