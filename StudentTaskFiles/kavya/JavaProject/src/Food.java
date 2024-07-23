import java.util.*;
public class Food{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        ArrayList<String> items=new ArrayList<String>();
        ArrayList<Integer> itemscost=new ArrayList<Integer>();
        System.out.println(" Welcome To 🍳 TUMMY YUMMY😋 ");
        boolean flag = true;
        while(flag){

            System.out.println("Menu");
            System.out.println("1.BreakFast");
            System.out.println("2.Lunch");
            System.out.println("3.Snacks");
            System.out.println("4.Dinner");
            System.out.println("5.Exit");
            System.out.println("Enter your Choice");

            int c = sc.nextInt();

            sc.nextLine();

            switch(c)
            {
                case 1:
                    String[] BreakFastItems = {"Dosa", "Idly", "Vada", "Poori", "Upma"};
                    int[] BreakFastItemscost = {20, 20, 30, 40, 25};
                    for(int i =0; i<BreakFastItems.length; i++){
                        System.out.println((i+1)+"."+ BreakFastItems[i] +" "+ "-----" + BreakFastItemscost[i] + "/-");
                    }

                    System.out.println("Enter your Dish Number");
                    int dishBreakFast = sc.nextInt();
                    System.out.println(BreakFastItems[dishBreakFast-1] + BreakFastItemscost[dishBreakFast-1]);
                    items.add(BreakFastItems[dishBreakFast-1]);
                    itemscost.add(BreakFastItemscost[dishBreakFast-1]);
                    break;

                case 2:
                    String[] LunchItems ={"Briyani", "Veg Briyani", "Rice", "Fried Rice", "Mandi"};
                    int[] LunchItemscost = {250, 150, 100, 70, 350};
                    for(int i =0; i<LunchItems.length; i++){
                        System.out.println((i+1)+"."+ LunchItems[i] +" "+ "-----"+ LunchItemscost[i] + "/-");
                    }

                    System.out.println("Enter your Dish Number");
                    int dishLunch = sc.nextInt();
                    System.out.println(LunchItems[dishLunch-1] +" "+ LunchItemscost[dishLunch-1]);
                    items.add(LunchItems[dishLunch-1]);
                    itemscost.add(LunchItemscost[dishLunch-1]);
                    break;


                case 3:
                    String[] SnacksItems ={"Cookies", "French Fries", "Fruits Custard", "Sprouts", "Cakes"};
                    int[] SnacksItemscost = {30, 50, 70, 20, 30};
                    for(int i =0; i< SnacksItems.length; i++){
                        System.out.println((i+1)+"."+ SnacksItems[i] +" "+ "-----" + SnacksItemscost[i] + "/-");
                    }

                    System.out.println("Enter your Dish Number");
                    int dishSnacks = sc.nextInt();
                    System.out.println(SnacksItems[dishSnacks-1] +" "+ SnacksItemscost[dishSnacks-1]);
                    items.add(SnacksItems[dishSnacks-1]);
                    itemscost.add(SnacksItemscost[dishSnacks-1]);
                    break;

                case 4:
                    String[] DinnerItems ={"Chapathi", "Palak Pannner", "Parota", "Pulka", "Curd Rice"};
                    int[] DinnerItemscost = {50, 70, 40, 30, 60};
                    for(int i =0; i< DinnerItems.length; i++){
                        System.out.println((i+1)+"."+ DinnerItems[i] +" "+ "-----" + DinnerItemscost[i] + "/-");
                    }

                    System.out.println("Enter your Dish Number");
                    int dishDinner = sc.nextInt();
                    System.out.println(DinnerItems[dishDinner-1] +" "+ DinnerItemscost[dishDinner-1]);
                    items.add(DinnerItems[dishDinner-1]);
                    itemscost.add(DinnerItemscost[dishDinner-1]);
                    break;

                case 5:
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid number");
            }
        }
        System.out.println(" ");
        System.out.println("Enter your Name");
        String n = sc.nextLine();
        System.out.println("Enter your Number");
        String c = sc.nextLine();
        System.out.println("Enter your Address");
        String a = sc.nextLine();
        System.out.println("Name : "+ n);
        System.out.println("Mobile: "+ c);
        System.out.println("Address : "+ a);
        int TotalBill = 0;
        for(int i=0; i<items.size(); i++){
            TotalBill += itemscost.get(i);
        }
        System.out.println(items+"="+itemscost + "/-");
        System.out.println(" ");
        System.out.println("Your TotalBill : "+TotalBill + "/-");
        System.out.println(" ");

        System.out.println("      ---Order Placed🤩 ---      ");
        System.out.println("***Thank You For Visiting🤗 ***");
    }
}