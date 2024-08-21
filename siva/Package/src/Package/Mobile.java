package Package;
import java.util.ArrayList;
import java.util.Scanner;

public class Mobile {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Class>products=new ArrayList<>();
        boolean b=true;

        while (b){
            try{
                System.out.println("1.AddProducts\n2.DisplayProducts\n3.CompareProducts\n4.Exist");
           int choise=sc.nextInt();
            switch (choise){
                case 1:
                    try{
                        System.out.println("Enter name");
                        String Name = sc.nextLine();
                    }catch (Exception e){

                    }
            }

            }catch (Exception e){
                System.out.println("Invalid number Please Enter Valid number");
            }
        }

    }
}
