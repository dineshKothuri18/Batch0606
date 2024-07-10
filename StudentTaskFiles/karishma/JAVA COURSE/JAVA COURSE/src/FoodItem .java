import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// Class representing a food item
class FoodItem {
    String name;
    double price;

    FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

// Class representing a restaurant
class Restaurant {
    String name;
    ArrayList<FoodItem> menu;

    Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
    }

    void addFoodItem(FoodItem item) {
        menu.add(item);
    }

    @Override
    public String toString() {
        return name;
    }
}

// Class representing an order
class Order {
    Restaurant restaurant;
    ArrayList<FoodItem> items;

    Order(Restaurant restaurant) {
        this.restaurant = restaurant;
        this.items = new ArrayList<>();
    }

    void addItem(FoodItem item) {
        items.add(item);
    }

    double getTotal() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.price;
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder("Order from " + restaurant.name + ":\n");
        for (FoodItem item : items) {
            details.append(item.toString()).append("\n");
        }
        details.append("Total: $").append(getTotal());
        return details.toString();
    }
}

// Main class for the food delivery app
public class FoodDeliveryApp {
    private static ArrayList<Restaurant> restaurants = new ArrayList<>();
    private static ArrayList<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        // Adding some sample restaurants and food items
        Restaurant r1 = new Restaurant("Pizza Palace");
        r1.addFoodItem(new FoodItem("Margherita Pizza", 8.50));
        r1.addFoodItem(new FoodItem("Pepperoni Pizza", 9.50));
        restaurants.add(r1);

        Restaurant r2 = new Restaurant("Burger Barn");
        r2.addFoodItem(new FoodItem("Cheeseburger", 5.00));
        r2.addFoodItem(new FoodItem("Bacon Burger", 6.00));
        restaurants.add(r2);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to the Food Delivery App");
            System.out.println("1. View Restaurants");
            System.out.println("2. Place Order");
            System.out.println("3. View Orders");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    viewRestaurants();
                    break;
                case 2:
                    placeOrder(scanner);
                    break;
                case 3:
                    viewOrders();
                    break;
                case 4:
                    System.out.println("Thank you for using the Food Delivery App!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewRestaurants() {
        System.out.println("\nAvailable Restaurants:");
        for (int i = 0; i < restaurants.size(); i++) {
            System.out.println((i + 1) + ". " + restaurants.get(i));
        }
    }

    private static void placeOrder(Scanner scanner) {
        System.out.println("\nSelect a restaurant to place an order from:");
        viewRestaurants();
        System.out.print("Enter restaurant number: ");
        int restaurantIndex = scanner.nextInt() - 1;
        if (restaurantIndex < 0 || restaurantIndex >= restaurants.size()) {
            System.out.println("Invalid restaurant number.");
            return;
        }

        Restaurant selectedRestaurant = restaurants.get(restaurantIndex);
        Order order = new Order(selectedRestaurant);

        while (true) {
            System.out.println("\nAvailable food items at " + selectedRestaurant.name + ":");
            for (int i = 0; i < selectedRestaurant.menu.size(); i++) {
                System.out.println((i + 1) + ". " + selectedRestaurant.menu.get(i));
            }
            System.out.print("Enter food item number to add to order (or 0 to finish): ");
            int itemIndex = scanner.nextInt() - 1;
            if (itemIndex == -1) {
                break;
            } else if (itemIndex < 0 || itemIndex >= selectedRestaurant.menu.size()) {
                System.out.println("Invalid food item number.");
            } else {
                order.addItem(selectedRestaurant.menu.get(itemIndex));
                System.out.println("Added " + selectedRestaurant.menu.get(itemIndex).name + " to the order.");
            }
        }

        if (!order.items.isEmpty()) {
            orders.add(order);
            System.out.println("Order placed successfully!\n");
        } else {
            System.out.println("No items in the order. Order not placed.\n");
        }
    }

    private static void viewOrders() {
        if (orders.isEmpty()) {
            System.out.println("\nNo orders placed yet.");
        } else {
            System.out.println("\nPlaced Orders:");
            for (Order order : orders) {
                System.out.println(order);
                System.out.println("----------------------");
            }
        }
    }
}