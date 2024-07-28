//import java.util.*;
//class MenuItem{
//    public String name;
//    public double price;
//    public MenuItem(String name, double price){
//        this.name = name;
//        this.price = price;
//    }
//    public String getName(){
//        return name;
//    }
//    public double getPrice(){
//        return price;
//    }
//}
//public class work {
//    private static ArrayList<MenuItem> menuItems = new ArrayList<>();
//    public static void main(String[] args) {
//        initialiseMenu();
//        Scanner scanner = new Scanner(System.in);
//        Order order = new Order();
//        int choice;
//        do {
//            diaplayMenu();
//            System.out.println("enter ur choice (1 : " + menuItems.size() + ") or 0 to finish: ");
//            choice = scanner.nextInt();
//            if (choice >= 1 && choice <= menuItems.size()) {
//                MenuItem selected = menuItems.get(choice - 1);
//                order.addItem(selected);
//            } else if (choice != 0) {
//                System.out.println("Invalid choice please enter again  ");
//            }
//        }
//        while (choice != 0);
//        scanner.nextLine();
//        System.out.println("enter ur name: ");
//        String name = scanner.nextLine();
//        System.out.println("enter phn num: ");
//        String phnNum = scanner.nextLine();
//        System.out.println("enter ur add: ");
//        String address = scanner.nextLine();
//        order.setUserInfo(name, phnNum, address);
//        order.displayOrder();
//        scanner.close();
//    }
//    public static void initialiseMenu() {
//        menuItems.add(new MenuItem("DarkForest cake----", 800.00));
//        menuItems.add(new MenuItem("Pastie-------------", 70.00));
//        menuItems.add(new MenuItem("Water Bottle-------", 50.00));
//        menuItems.add(new MenuItem("Banana Juices------", 40.00));
//        menuItems.add(new MenuItem("Dry Fruit Juice----", 100.00));
//        menuItems.add(new MenuItem("Apple Juices-------", 60.00));
//        menuItems.add(new MenuItem("Grapes Juices------", 40.00));
//        menuItems.add(new MenuItem("MuskMelon Juices---", 40.00));
//        menuItems.add(new MenuItem("Badam Milk---------", 70.00));
//        menuItems.add(new MenuItem("DairyMilk chocolate", 50.00));
//        menuItems.add(new MenuItem("MilkyBar chocolate-", 40.00));
//        menuItems.add(new MenuItem("Dark chocolate-----", 150.00));
//        menuItems.add(new MenuItem("Gulab-Jamun--------", 40.00));
//        menuItems.add(new MenuItem("Payasam------------", 40.00));
//        menuItems.add(new MenuItem("Happy Happy Biscuit", 10.00));
//        menuItems.add(new MenuItem("Good-day Biscuit---", 20.00));
//        menuItems.add(new MenuItem("Banana Juices------", 40.00));
//    }
//    public static void diaplayMenu() {
//        System.out.println("----- MENU -----");
//        for (int i = 0; i < menuItems.size(); i++) {
//            System.out.println((i + 1) + "." + menuItems.get(i).getName() + " -----Rs." + menuItems.get(i).getPrice());
//        }
//        System.out.println("0.Samaptham");
//    }
//    public static class Order {
//        public ArrayList<MenuItem> items;
//        public String name;
//        public String phnNum;
//        public String address;
//        public  Order() {
//            items = new ArrayList<>();
//        }
//        public void addItem(MenuItem item) {
//            items.add(item);
//        }
//        public double getTotalCost() {
//            int total = 0;
//            for (MenuItem item : items) {
//                total += item.getPrice();
//            }
//            return total;
//        }
//        public void setUserInfo(String name, String phnNum, String address) {
//            this.name = name;
//            this.phnNum = phnNum;
//            this.address = address;
//        }
//        public void modifications(){
//            System.out.println("Do you want to modify the menu ?");
//            if(){
//
//            }
//        }
//        public void displayOrder() {
//            System.out.println("Your order: ");
//            for (MenuItem item : items) {
//                System.out.println(item.getName() + "Rs =" + item.getPrice());
//            }
//            System.out.println("----------**********----------");
//            System.out.println("Total cost: Rs- " + getTotalCost());
//            System.out.println("Customer details-->");
//            System.out.println("Name: " + name);
//            System.out.println("PhnNum: " + phnNum);
//            System.out.println("Address: " + address);
//            System.out.println("----------**********----------");
//        }
//    }
//}
//
//
//
//
//
