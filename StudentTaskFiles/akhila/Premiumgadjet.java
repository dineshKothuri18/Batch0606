import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Premiumgadjet {
    public static void main(String[] args){
        ArrayList<HashMap<String,String>> products = new ArrayList<>();
        
        HashMap<String,String> product1 = new HashMap<>();
        product1.put("Name","I Phone-15");
        product1.put("Brandname","IOS");
        product1.put("Price","80000");
        product1.put("Discount","15%");
        product1.put("Colour","Black");

        HashMap<String,String> product2 = new HashMap<>();
        product2.put("Name","Samsung Galaxy - S24");
        product2.put("Brandname","Samsung");
        product2.put("Price","75000");
        product2.put("Discount","10%");
        product2.put("Colour","Silver");

        HashMap<String,String> product3 = new HashMap<>();
        product3.put("Name","Realme-12");
        product3.put("Brandname","Realme");
        product3.put("Price","30000");
        product3.put("Discount","20%");
        product3.put("Colour","Red");

        HashMap<String,String> product4 = new HashMap<>();
        product4.put("Name","IQ-9T");
        product4.put("Brandname","IQ");
        product4.put("Price","40000");
        product4.put("Discount","10%");
        product4.put("Colour","White");

        HashMap<String,String> product5 = new HashMap<>();
        product5.put("Name","Vivo v-29 pro");
        product5.put("Brandname","Vivo");
        product5.put("Price","39000");
        product5.put("Discount","25%");
        product5.put("Colour","silver-white");

        HashMap<String,String> product6 = new HashMap<>();
        product6.put("Name","OnePlus 11R");
        product6.put("Brandname","One Plus");
        product6.put("Price","38000");
        product6.put("Discount","20%");
        product6.put("Colour","Sea Blue");

        HashMap<String,String> product7 = new HashMap<>();
        product7.put("Name","Redmi note 11 pro");
        product7.put("Brandname","Xiomi");
        product7.put("Price","23000");
        product7.put("Discount","15%");
        product7.put("Colour","Black");

        
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name :");
        String userName = scanner.nextLine();
        System.out.println("Enter your Phone Num :");
        String userNumber = scanner.nextLine();
        System.out.println("Enter your Mail:");
        String userEmail = scanner.nextLine();

        ArrayList<HashMap<String,String>> cart = new ArrayList<>();
        while (true) {
            System.out.println("Products : ");
            System.out.println("-------------------------------------------------------");
            for (int i = 0; i < products.size(); i++) {
                HashMap<String,String> product = products.get(i);
                System.out.println((i+1) + " . " + product.get("Name") + " - " + product.get("Brandname") + "-"+ product.get("Price")+" - "+ product.get("Discount")+" - "+ product.get("Colour"));
            }
            System.out.println("-------------------------------------------------------");
            System.out.println("Enter the product number you want to add to cart or -1 to stop:");
            int productNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            if(productNumber == -1){
                break;
            }
            if(productNumber > 0 && productNumber <= products.size()) {
                HashMap<String,String> selectedProduct = products.get(productNumber-1);
                cart.add(selectedProduct);
                System.out.println("Product added to cart: " + selectedProduct.get("Name"));
            } else {
                System.out.println("Invalid product number. Please try again.");
            }
            System.out.println("Do you want to add more items? (Y/N):");
            String userResponse = scanner.nextLine();
            if(!userResponse.equalsIgnoreCase("Y")){
                break;
            }
        }

        double totalAmount = 0;
        System.out.println("Cart contents:");
        for (int i = 0; i < cart.size(); i++) {
            HashMap<String, String> product = cart.get(i);
            double price = Double.parseDouble(product.get("Price"));
            double discount = Double.parseDouble(product.get("Discount").replaceAll("%", ""));
            double amount = price - (price * discount / 100);
            totalAmount += amount;
            System.out.println((i+1) + " " + product.get("Name") + " - " + product.get("Brandname") + " - " + product.get("Price") + " - " + product.get("Discount") + " - " + product.get("Colour") + " - " + "Discounted Price: " + amount);
        }
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Enter payment method (cash/card):");
        String paymentMethod = scanner.nextLine();
        System.out.println("Enter payment amount:");
        double paymentAmount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Order summary");
        System.out.println("User name: " + userName);
        System.out.println("User phone: " + userNumber);
        System.out.println("User email: " + userEmail);
        System.out.println("Payment method: " + paymentMethod);
        System.out.println("Payment Amount: " + paymentAmount);
        System.out.println("Cart contents:");
        for (int i = 0; i < cart.size(); i++) {
            HashMap<String, String> product = cart.get(i);
            System.out.println((i+1) + " " + product.get("Name") + " - " + product.get("Brandname") + " - " + product.get("Price") + " - " + product.get("Discount") + " - " + product.get("Colour"));
        }
        
        System.out.println("-----------------your ordered placed successfully----------------------");
    }
}