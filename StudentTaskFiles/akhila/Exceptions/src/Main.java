import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = false;

        while (!flag) {
            try {
                System.out.print("Enter product name: ");
                String name = scanner.nextLine();

                System.out.print("Enter brand name: ");
                String brandName = scanner.nextLine();

                System.out.print("Enter version: ");
                String version = scanner.nextLine();

                System.out.print("Enter weight (in grams): ");
                double weight = scanner.nextDouble();
                if (weight <= 0) {
                    throw new IllegalArgumentException("Weight must be positive");
                }

                scanner.nextLine();

                System.out.print("Enter dimensions (LxBxH): ");
                String dimensions = scanner.nextLine();

                System.out.print("Enter SIM slot: ");
                String simSlot = scanner.nextLine();

                System.out.print("Enter card slot: ");
                String cardSlot = scanner.nextLine();

                System.out.print("Enter battery: ");
                String battery = scanner.nextLine();

                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                if (price <= 0) {
                    throw new IllegalArgumentException("Price must be positive");
                }

                flag = true;


                System.out.println("\nProduct saved successfully:");

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());

                scanner.nextLine();
            } 
        }
    }
}

