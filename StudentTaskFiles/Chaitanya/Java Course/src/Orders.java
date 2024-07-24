import java.util.ArrayList;
import java.util.Scanner;
class BiryaniItems{
    public String name;
    public double price;
    public BiryaniItems(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
public class Orders {
    private static ArrayList<BiryaniItems> BiryaniItems = new ArrayList<>();
    public static void main(String[] args) {
        initialiseMenu();
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        int choice;
        do {
            diaplayMenu();
            System.out.println("enter ur choice (1 : " + BiryaniItems.size() + ") or 0 to finish: ");
            choice = scanner.nextInt();
            if (choice >= 1 && choice <= BiryaniItems.size()) {
               BiryaniItems selected = BiryaniItems.get(choice - 1);
                order.addItem(selected);
            } else if (choice != 0) {
                System.out.println("Invalid choice please enter again  ");
            }
        }
        while (choice !=0);
        scanner.nextLine();
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phnnumber: ");
        String phnNumber = scanner.nextLine();
        System.out.println("Enter your address: ");
        String address = scanner.nextLine();
        order.setUserInfo(name, phnNumber, address);
        order.displayOrder();
        scanner.close();
    }
    public static void initialiseMenu() {
       BiryaniItems.add(new BiryaniItems("Keema Biryani----", 410.00));
       BiryaniItems.add(new BiryaniItems("sugandhi murgh Biryani----", 385.00));
       BiryaniItems.add(new BiryaniItems("Mushroom moti biryani---", 324.00));
       BiryaniItems.add(new BiryaniItems("fry chicken biryani-----", 345.00));
       BiryaniItems.add(new BiryaniItems("chicken dum biryani----", 321.00));
       BiryaniItems.add(new BiryaniItems("fish biryani-------", 320.00));
       BiryaniItems.add(new BiryaniItems("mutton biryani------", 340.00));
       BiryaniItems.add(new BiryaniItems("spl mutton biryani---", 250.00));
       BiryaniItems.add(new BiryaniItems("chicken 65 biryani------", 350.00));
       BiryaniItems.add(new BiryaniItems("Egg biryani", 250.00));
       
    }
    public static void diaplayMenu() {
        System.out.println("----- WELCOME TO BIRYANI ITEMS -----");
        for (int i = 0; i < BiryaniItems.size(); i++) {
            System.out.println((i + 1) + "." + BiryaniItems.get(i).getName() + " -----Rs." + BiryaniItems.get(i).getPrice());
        }
        System.out.println("0.  Finish");
    }
    public static class Order {
        public ArrayList<BiryaniItems> items;
        public String name;
        public String phnNumber;
        public String address;
        public  Order() {
            items = new ArrayList<>();
        }
        public void addItem(BiryaniItems item) {
            items.add(item);
        }
        public double getTotalCost() {
            int total = 0;
            for (BiryaniItems item : items) {
                total += item.getPrice();
            }
            return total;
        }
        public void setUserInfo(String name, String phnNumber, String address) {
            this.name = name;
            this.phnNumber = phnNumber;
            this.address = address;
        }
        public void displayOrder() {
            System.out.println("Your order: ");
            for (BiryaniItems item : items) {
                System.out.println(item.getName() + "Rs =" + item.getPrice());
            }
            System.out.println("----------****----------");
            System.out.println("Total cost: Rs- " + getTotalCost());
            System.out.println("Customer details-->");
            System.out.println("Name: " + name);
            System.out.println("PhnNumber: " + phnNumber);
            System.out.println("Address: " + address);
            System.out.println("----------****----------");
        }
    }
}