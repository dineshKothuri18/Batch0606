import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ShoppingApp {
    public static void main(String[] args) {
       
        ArrayList<HashMap<String, String>> productList = new ArrayList<>();
        ArrayList<HashMap<String, String>> cart = new ArrayList<>();

      
        addProduct(productList, "Iphone -15", "Apple", "1000", "10%", "Black");
        addProduct(productList, "Samsung galaxy S24-ultra", "Samsung", "500", "5%", "Blue");
        addProduct(productList, "Oneplus 11R", "Oneplus", "150", "15%", "SeaBlue");
        addProduct(productList, "IQ9T", "IQ", "160", "20%", "White-Red");
        addProduct(productList, "Vivo V29 Pro", "Vivo", "200", "15%", "Blue");

      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter your email: ");
        String userEmail = scanner.nextLine();
         System.out.print("Enter your Phonenum: ");
        String userPhone = scanner.nextLine();
         System.out.print("Enter your Address: ");
        String userAddress = scanner.nextLine();
        

        
        boolean running = true;
        while (running) {
            System.out.println("\nMain Menu:");
            System.out.println("1. View Products");
            System.out.println("2. Add Product");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Add to Cart");
            System.out.println("6. View Cart");
            System.out.println("7. Checkout");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    displayProducts(productList);
                    break;
                case "2":
                    addProductDynamic(productList, scanner);
                    break;
                case "3":
                    updateProduct(productList, scanner);
                    break;
                case "4":
                    deleteProduct(productList, scanner);
                    break;
                case "5":
                    addToCart(productList, cart, scanner);
                    break;
                case "6":
                    displayProducts(cart);
                    break;
                case "7":
                    checkout(userName, userEmail, userPhone, userAddress, cart, scanner);
                    running = false;
                    break;
                case "8":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    private static void addProduct(ArrayList<HashMap<String, String>> productList, String name, String brandName, String price, String discount, String colour) {
        HashMap<String, String> product = new HashMap<>();
        product.put("name", name);
        product.put("brandName", brandName);
        product.put("price", price);
        product.put("discount", discount);
        product.put("colour", colour);
        productList.add(product);
    }

    private static void addProductDynamic(ArrayList<HashMap<String, String>> productList, Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter brand name: ");
        String brandName = scanner.nextLine();
        System.out.print("Enter price: ");
        String price = scanner.nextLine();
        System.out.print("Enter discount: ");
        String discount = scanner.nextLine();
        System.out.print("Enter colour: ");
        String colour = scanner.nextLine();

        addProduct(productList, name, brandName, price, discount, colour);
        System.out.println("Product added successfully.");
    }

    private static void updateProduct(ArrayList<HashMap<String, String>> productList, Scanner scanner) {
        displayProducts(productList);
        System.out.print("Enter the product number to update: ");
        int productIndex = Integer.parseInt(scanner.nextLine()) - 1;

        if (productIndex >= 0 && productIndex < productList.size()) {
            HashMap<String, String> product = productList.get(productIndex);
            System.out.print("Enter new product name (leave blank to keep current): ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) product.put("name", name);
            System.out.print("Enter new brand name (leave blank to keep current): ");
            String brandName = scanner.nextLine();
            if (!brandName.isEmpty()) product.put("brandName", brandName);
            System.out.print("Enter new price (leave blank to keep current): ");
            String price = scanner.nextLine();
            if (!price.isEmpty()) product.put("price", price);
            System.out.print("Enter new discount (leave blank to keep current): ");
            String discount = scanner.nextLine();
            if (!discount.isEmpty()) product.put("discount", discount);
            System.out.print("Enter new colour (leave blank to keep current): ");
            String colour = scanner.nextLine();
            if (!colour.isEmpty()) product.put("colour", colour);

            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Invalid product number.");
        }
    }

    private static void deleteProduct(ArrayList<HashMap<String, String>> productList, Scanner scanner) {
        displayProducts(productList);
        System.out.print("Enter the product number to delete: ");
        int productIndex = Integer.parseInt(scanner.nextLine()) - 1;

        if (productIndex >= 0 && productIndex < productList.size()) {
            productList.remove(productIndex);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Invalid product number.");
        }
    }

    private static void addToCart(ArrayList<HashMap<String, String>> productList, ArrayList<HashMap<String, String>> cart, Scanner scanner) {
        displayProducts(productList);
        System.out.print("Enter the product number to add to cart: ");
        int productIndex = Integer.parseInt(scanner.nextLine()) - 1;

        if (productIndex >= 0 && productIndex < productList.size()) {
            cart.add(productList.get(productIndex));
            System.out.println("Product added to cart.");
        } else {
            System.out.println("Invalid product number.");
        }
    }

    private static void displayProducts(ArrayList<HashMap<String, String>> products) {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (int i = 0; i < products.size(); i++) {
                HashMap<String, String> product = products.get(i);
                System.out.println((i + 1) + ". " + product.get("name") + " - " + product.get("brandName") + ", Price: $" + product.get("price") + ", Discount: " + product.get("discount") + ", Colour: " + product.get("colour"));
            }
        }
    }

    private static void checkout(String userName, String userEmail,String userPhone,String userAddress, ArrayList<HashMap<String, String>> cart, Scanner scanner) {
        System.out.println("\nUser Details:");
        System.out.println("Name: " + userName);
        System.out.println("Email: " + userEmail);
        System.out.println("Phone num: " + userPhone);
        System.out.println("Address: " + userAddress);

        System.out.println("\nYour cart:");
        displayProducts(cart);

        double totalAmount = 0.0;
        for (HashMap<String, String> product : cart) {
            double price = Double.parseDouble(product.get("price"));
            double discount = Double.parseDouble(product.get("discount").replace("%", ""));
            double discountedPrice = price - (price * (discount / 100));
            totalAmount += discountedPrice;
        }

        System.out.printf("Total Amount: $%.2f\n", totalAmount);

        System.out.print("Enter payment method (Credit Card, Debit Card): ");
        String paymentMethod = scanner.nextLine();

        System.out.println("\nCheckout Summary:");
        System.out.println("Total Amount: $" + String.format("%.2f", totalAmount));
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("\nThank you for shopping with us!");
    }
}