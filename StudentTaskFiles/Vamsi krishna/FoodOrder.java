import java.util.ArrayList;
import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu
        String[][] menu = {
                {"Breakfast", "Lunch", "Dinner"},
                {"Idly", "Dosa", "Puri", "Pongal", "Vada"},
                {"Vegetarian", "Non Vegetarian", "Soft Drinks", "Desserts"},
                {"Starters", "Main Course"},
                {"Panner Tikka", "Chilli Mushroom", "Fried Baby Corn"},
                {"Veg Meals", "Veg Biryani", "Mushroom Biryani", "Samber Rice", "Curd Rice"},
                {"Chilli Chicken", "Kaju Chicken", "Chicken Pepper Fry", "Prawn 65", "Mutton Tikka"},
                {"Chicken Biryani", "Mutton Biryani", "Prawn Biryani", "Mixed Mandi"},
                {"Badam Milk", "Orange Juice", "Thumsup", "Limka"},
                {"Rasmali", "Gulab Jam", "Keer", "Rubbdy"}
        };

        // Prices
        double[][] prices = {
                {20, 40, 30, 40, 30},
                {180, 190, 170},
                {100, 140, 200, 65, 60},
                {210, 210, 220, 240, 250},
                {220, 260, 270, 450},
                {50, 40, 20, 20},
                {60, 30, 45, 75}
        };

        // Cart
        ArrayList<String> cart = new ArrayList<>();
        double total = 0;

        // Personal details
        String name = "";
        String address = "";
        String phone = "";
        boolean flag = true;
        while (flag == true) {
            System.out.println("Welcome to Famous Restaurant!");
            System.out.println("Menu:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i][0]);
            }

            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Breakfast:");
                    for (int i = 0; i < menu[1].length; i++) {
                        System.out.println((i + 1) + ". " + menu[1][i] + " - " + prices[0][i] + "/-");
                    }

                    System.out.println("Enter your choice:");
                    int breakfastChoice = sc.nextInt();
                    cart.add(menu[1][breakfastChoice - 1]);
                    total += prices[0][breakfastChoice - 1];
                    break;

                case 2:
                    System.out.println("Lunch:");
                    for (int i = 0; i < menu[2].length; i++) {
                        System.out.println((i + 1) + ". " + menu[2][i]);
                    }

                    System.out.println("Enter your choice:");
                    int lunchChoice = sc.nextInt();

                    switch (lunchChoice) {
                        case 1:
                            System.out.println("Vegetarian:");
                            for (int i = 0; i < menu[3].length; i++) {
                                System.out.println((i + 1) + ". " + menu[3][i]);
                            }

                            System.out.println("Enter your choice:");
                            int vegChoice = sc.nextInt();

                            switch (vegChoice) {
                                case 1:
                                    System.out.println("Starters:");
                                    for (int i = 0; i < menu[4].length; i++) {
                                        System.out.println((i + 1) + ". " + menu[4][i] + " - " + prices[1][i] + "/-");
                                    }

                                    System.out.println("Enter your choice:");
                                    int starterChoice = sc.nextInt();
                                    cart.add(menu[4][starterChoice - 1]);
                                    total += prices[1][starterChoice - 1];
                                    break;

                                case 2:
                                    System.out.println("Main Course:");
                                    for (int i = 0; i < menu[5].length; i++) {
                                        System.out.println((i + 1) + ". " + menu[5][i] + " - " + prices[2][i] + "/-");
                                    }

                                    System.out.println("Enter your choice:");
                                    int mainCourseChoice = sc.nextInt();
                                    cart.add(menu[5][mainCourseChoice - 1]);
                                    total += prices[2][mainCourseChoice - 1];
                                    break;
                            }

                            break;

                        case 2:
                            System.out.println("Non Vegetarian:");
                            for (int i = 0; i < menu[6].length; i++) {
                                System.out.println((i + 1) + ". " + menu[6][i] + " - " + prices[3][i] + "/-");
                            }

                            System.out.println("Enter your choice:");
                            int nonVegChoice = sc.nextInt();
                            cart.add(menu[6][nonVegChoice - 1]);
                            total += prices[3][nonVegChoice - 1];
                            break;

                        case 3:
                            System.out.println("Soft Drinks:");
                            for (int i = 0; i < menu[7].length; i++) {
                                System.out.println((i + 1) + ". " + menu[7][i] + " - " + prices[4][i] + "/-");
                            }

                            System.out.println("Enter your choice:");
                            int softDrinkChoice = sc.nextInt();
                            cart.add(menu[7][softDrinkChoice - 1]);
                            total += prices[4][softDrinkChoice - 1];
                            break;

                        case 4:
                            System.out.println("Desserts:");
                            for (int i = 0; i < menu[8].length; i++) {
                                System.out.println((i + 1) + ". " + menu[8][i] + " - " + prices[5][i] + "/-");
                            }

                            System.out.println("Enter your choice:");
                            int dessertChoice = sc.nextInt();
                            cart.add(menu[8][dessertChoice - 1]);
                            total += prices[5][dessertChoice - 1];
                            break;
                    }

                    break;
                default:
                    flag = false;
                    break;

            }
        }

        // Display cart and total
        System.out.println("Cart:");
        for (String item : cart) {
            System.out.println(item);
        }
        System.out.println("Total: " + total + "/-");

        // Ask for personal details
        System.out.println("Enter your name:");
        name = sc.next();

        System.out.println("Enter your address:");
        address = sc.next();

        System.out.println("Enter your phone number:");
        phone = sc.next();

        // Display order summary
        System.out.println("Order Summary:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Cart:");
        for (String item : cart) {
            System.out.println(item);
        }
        System.out.println("Total: " + total + "/-");

        // Place order
        System.out.println("Place order? (Y/N)");
        String placeOrder = sc.next();

        if (placeOrder.equalsIgnoreCase("Y")) {
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order cancelled.");
        }
    }
}

