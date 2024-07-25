import java.util.*;

public class Bombitop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> itemss = new ArrayList<String>();
        ArrayList<Integer> itemsscost = new ArrayList<Integer>();
        boolean flag = true;

        while (flag) {
            System.out.println("    " + "---------------Welcome To---------------");
            System.out.println("    " + "-------Vachi Thini Po Restaurant----------");
            System.out.println("                    MenuList");
            System.out.println("            Choose the below options:");
            System.out.println("1. Breakfast");
            System.out.println("2. Starters");
            System.out.println("3. Biryanis");
            System.out.println("4. Desserts");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    String[] itemsBreakfast = {"Dosa", "Idly", "Bonda", "Vada", "Masala Dosa", "Upma", "Onion Dosa", "Uttapa", "Puri", "Poha idli"};
                    int[] costsBreakfast = {30, 30, 30, 30, 40, 20, 40, 30, 35, 50};

                    for (int i = 0; i < itemsBreakfast.length; i++) {
                        System.out.println((i + 1) + "  " + itemsBreakfast[i] + "---" + costsBreakfast[i] + "rs");
                    }

                    System.out.println("Enter your dish number: ");
                    int dishBreakfast = sc.nextInt();
                    sc.nextLine();

                    System.out.println(itemsBreakfast[dishBreakfast - 1] + "    " + "---" + costsBreakfast[dishBreakfast - 1]);

                    itemss.add(itemsBreakfast[dishBreakfast - 1]);
                    itemsscost.add(costsBreakfast[dishBreakfast - 1]);
                    break;

                case 2:
                    String[] itemsStarters = {"mushroom", "pannertikka", "chickenlollipop", "dargonchicken", "fishfingers", "gobimanchuria", "noddles", "firedrice", "dahikebab"};
                    int[] costsStarters = {150, 180, 250, 280, 80, 100, 95, 150, 85, 60};

                    for (int i = 0; i < itemsStarters.length; i++) {
                        System.out.println((i + 1) + "  " + itemsStarters[i] + "--" + costsStarters[i] + "rs");
                    }

                    System.out.println("Enter your dish number: ");
                    int dishStarters = sc.nextInt();
                    sc.nextLine();

                    System.out.println(itemsStarters[dishStarters - 1] + "     " + "--------" + costsStarters[dishStarters - 1]);
                    itemss.add(itemsStarters[dishStarters - 1]);
                    itemsscost.add(costsStarters[dishStarters - 1]);
                    break;

                case 3:
                    String[] itemsBiryanis = {"chicken briyani", "mutton briyani", "prawanbriyani", "butterchicken", "pannerbriyani", "mushroombriyani", "muttonkemma", "chickendoublemasalabriyani", "pannermasalabriyani", "pannermandhi"};
                    int[] costsBiryanis = {160, 180, 250, 300, 400, 180, 450, 220, 190, 170};

                    for (int i = 0; i < itemsBiryanis.length; i++) {
                        System.out.println((i + 1) + "  " + itemsBiryanis[i] + "           " + "--" + costsBiryanis[i] + "rs");
                    }

                    System.out.println("Enter your dish number: ");
                    int dishBiryanis = sc.nextInt();
                    sc.nextLine();

                    System.out.println(itemsBiryanis[dishBiryanis - 1] + "     " + "--------" + costsBiryanis[dishBiryanis - 1]);
                    itemss.add(itemsBiryanis[dishBiryanis - 1]);
                    itemsscost.add(costsBiryanis[dishBiryanis - 1]);
                    break;

                case 4:
                    String[] itemsDesserts = {"Cake", "Cookies", "Pies", "Ice Cream", "Cheesecake", "Tiramisu", "Pavlova", "Creme brulee", "Banoffee pie", "Chocolate mousse"};
                    int[] costsDesserts = {150, 160, 111, 125, 130, 140, 100, 55, 89, 90};

                    for (int i = 0; i < itemsDesserts.length; i++) {
                        System.out.println((i + 1) + "   " + itemsDesserts[i] + "           " + "--" + costsDesserts[i] + "rs");
                    }

                    System.out.println("Enter your dish number: ");
                    int dishDesserts = sc.nextInt();
                    sc.nextLine();

                    System.out.println(itemsDesserts[dishDesserts - 1] + "     " + "--------" + costsDesserts[dishDesserts - 1]);
                    itemss.add(itemsDesserts[dishDesserts - 1]);
                    itemsscost.add(costsDesserts[dishDesserts - 1]);
                    break;

                case 5:
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }


        System.out.println("Enter your name : ");
        String n = sc.nextLine();
        System.out.println("Enter your address : ");
        String a = sc.nextLine();
        System.out.println("Enter your contact : ");
        String c = sc.nextLine();

        System.out.println("Name: " + n);
        System.out.println("address : " + a);
        System.out.println("Contact : " + c);

        int totalBill = 0;
        for (int i = 0; i < itemss.size(); i++) {
            totalBill += itemsscost.get(i);
        }
        System.out.println("Total bill: " + totalBill);
        System.out.println("Thank you for visiting!");
        System.out.println("Taste bagunte randi, leda ante etu pakkaki chudakandi.");


    }
}