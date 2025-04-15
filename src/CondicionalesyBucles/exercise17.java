package CondicionalesyBucles;

import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        // Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las
        //facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio
        //por litro.
        //Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y
        //cuantas facturas se emitieron de más de 600 €.

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double total_billing = 0;
        int mount_liters = 0;
        int article_1 = 1;
        int mount_bill = 0;

        while (count < 5) {
            System.out.print("Enter the code of the article: ");
            int code_article = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the number of liters sold: ");
            int amount_liters = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the price of the liters purchased: ");
            double price_liters = Integer.parseInt(scanner.nextLine());
            total_billing = price_liters * amount_liters;

            if (code_article == article_1) {
                mount_liters += amount_liters;
            }

            if (total_billing > 600) {
                mount_bill++;
            }

            count++;
        }

        System.out.println("Total billing: " + total_billing);
        System.out.println("Quantity of liters sold of article 1: " + mount_liters);
        System.out.println("Number of invoices greater than 600: " + mount_bill);
    }
}
