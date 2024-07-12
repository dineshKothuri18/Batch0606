import java.util.*;
public class Resturant {

        public static void menu() {

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> itemss = new ArrayList<String>();
            ArrayList<Integer> itemsscost = new ArrayList<Integer>();
            boolean flag = true;
            while (flag) {
                System.out.println("      * WELCOME TO BEZAWADA BHOJANAM *");
                System.out.println(" MenuList");
                System.out.println("1.Breakfast");
                System.out.println("2.Starters");
                System.out.println("3.Maincourse");
                System.out.println("4.Desserts");
                System.out.println("5.Exit");
                System.out.println("Enter your choice: ");
                int a = sc.nextInt();
                sc.nextLine();
                String[][] item1 = {{"Idly", "Dosa", "Puri", "vada", "bhaji", "pongal", "bonda", "pungulu", "mysorebonda", "sweetpongal"}, {"mushroom", "pannertikka", "chickenlollipop", "dargonchicken", "fishfingers", "gobimanchuria", "noddles", "firedrice", "dahikebab"},
                        {"chicken briyani", "mutton briyani", "prawanbriyani", "butterchicken", "pannerbriyani", "mushroombriyani", "muttonkemma", "chickendoublemasalabriyani", "pannermasalabriyani", "pannermandhi"}, {"apricortdelight", "mangopudding", "sizzlingbrowine", "carmelchocolate", "redvelvetcake", "creamycake", "chocolava", "blackcurrent", "blackforest", "macarons"}};
                int[][] cost = {{25, 34, 30, 40, 50, 45, 33, 25, 39, 50}, {250, 300, 350, 400, 500, 550, 570, 600, 200, 360}, {300, 360, 400, 550, 670, 800, 450, 220, 170, 190}, {150, 160, 111, 125, 130, 140, 100, 55, 89, 90}};
                if (a >= 1 && a <= 4) {
                    int itemindex = a-1 ;
                    for (int i = 0; i < item1[itemindex].length; i++) {
                        System.out.println((i + 1) + "  " + item1[itemindex][i]+"     "+cost[itemindex][i]+"/-");
                    }
                    System.out.println("enter dish number:  ");
                    int dishnumber = sc.nextInt();
                    if (dishnumber >= 1 && dishnumber <= item1[itemindex].length) {
                        int dishindex = dishnumber - 1;
                        System.out.println(item1[itemindex][dishindex] + "  " + "---" + cost[itemindex][dishindex]);
                        itemss.add(item1[itemindex][dishindex] + "   " + cost[itemindex][dishindex]);
                        itemsscost.add(cost[itemindex][dishindex]);
                    }

                }
                else if (a == 5) {
                    System.out.println("items selected:  " + itemss);
                    int totalbill = 0;
                    for (int i = 0; i < itemsscost.size(); i++) {
                        totalbill = totalbill + itemsscost.get(i);
                    }
                    System.out.println("total bill" +"  "+  totalbill);
                    System.out.println("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter your phone number: ");
                    int phonenumber = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter your address: ");
                    String address = sc.nextLine();
                    System.out.println(" your order confirmed ");
                    System.out.println("Thank you for visting:) ");
                    flag=false;
                }
            }
        }
    }






