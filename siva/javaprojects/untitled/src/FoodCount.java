import java.util.ArrayList;
import java.util.Scanner;

public class FoodCount {
    public static void main(String []args){
        System.out.println("                         < Randi  Thini Bill Pay Chesi Pondi >                      ");
        System.out.println();
        System.out.println("                                   * WELCOME *                                       ");
        System.out.println();
        ArrayList<String> st =new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();

        String[] menu = {"Non Veg","Veg","Done"};
        String[][] items ={{"Boneless Chiken Biryani","Dum Biryani","Fish Biryani","Chiken Curry","Chiken 65","Mutton Biryani"," Chiken Fry","Chiken Masala","Tandoori Chiken"},{"Panenr Biryani","Aloo Biryani","Kaju Biryani","Veg Gongura Biryani","Mushroom Biryani","Babycorn Biryani"},{"Done"}};

        int[][] Cost = {{190,150,120,200,150,120,160,110,190},{120,130,150,120,150,170}};


        Scanner sc = new Scanner(System.in);

        boolean tr =true;
        while (tr){
            for(int i =0; i< menu.length ; i++){
                System.out.println((i+1)+"."+menu[i]);
            }

            System.out.println("Enter Your choise :: ");
            int Dish = sc.nextInt();
            if(Dish>=1 && Dish<=2) {



                for (int j = 0; j < items[Dish - 1].length; j++) {
                    System.out.println((j + 1) + "." + items[Dish - 1][j] + "             " + Cost[Dish - 1][j]+"/-");
                }
                System.out.println();
                System.out.println("Enter your Dish Number :");
                int DishNo = sc.nextInt();
                st.add(items[Dish - 1][DishNo - 1] + " " + Cost[Dish - 1][DishNo - 1] + "/- ");
                in.add(Cost[Dish-1][DishNo-1]);
                System.out.println("Your Order Detail's : "+st);
            }


            else if(Dish==3){
                System.out.println("Enter your Name :");

                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter your PhNo :");
                String phNo = sc.nextLine();
                System.out.println("Enter your Address :");
                String address = sc.nextLine();
                System.out.println(st);
                int totalBill=0;
                for(int i = 0 ; i<st.size();i++){
                    totalBill = (totalBill)+(in.get(i));
                }

                System.out.println("TotalBill : "+totalBill);

                System.out.println( "Name :"+name);
                System.out.println("PhNo :"+phNo);
                System.out.println("Address :"+address);
                System.out.println();

                System.out.println("************************-Your Order is Conformed-************************");
                tr=false;
                break;
            }

        }
    }
}

