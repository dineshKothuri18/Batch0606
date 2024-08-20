//import java.lang.classfile.instruction.ExceptionCatch;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static ArrayList<Product> Product_details = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product d = new Product("vivo", "s1pro", "186.7", "2", "17 hours 7 minutes");
        Product e = new Product("oppo", " T 20 pro 5G", "150.4", "2", "15 hours");
        Product f = new Product("redmi", "13c 5G", "170.7", "2", "17 hours");
        Collections.addAll(Product_details, d, e, f);


        try {
            System.out.println(d.productname);
        } catch (Exception e1) {
            System.out.println(d.getClass());
            System.out.println(d.getClass());
        }
        sc = new Scanner(System.in);

        try {
            System.out.println(d.version);
        } catch (Exception e2) {
            System.out.println(d.version);
            System.out.println(d.version);
        }
        sc = new Scanner(System.in);

        try {
            System.out.println(d.weight);
        } catch (Exception e3) {
            System.out.println(d.weight);
            System.out.println(d.weight);
        }
        sc = new Scanner(System.in);

        try {
            System.out.println(d.simslot);
        } catch (Exception e4) {
            System.out.println(d.simslot);
            System.out.println(d.simslot);
        }
        sc = new Scanner(System.in);

        try {
            System.out.println(d.battery);
        } catch (Exception e6) {
            System.out.println(d.battery);
            System.out.println(d.battery);
        }
        sc = new Scanner(System.in);




    }
}







        //system.out. println("Enter a productname");
        //String product = sc.nextLine();

        //System.out.println("Enter a version");
        //String version = sc.nextLine();

        //System.out.println("Enter a weight");
        //String weight = sc.nextLine();


        //System.out.println("Enter a simslot");
        //String simslot = sc.nextLine();


        //System.out.println("Enter a battery");
        //String battery = sc.nextLine();

