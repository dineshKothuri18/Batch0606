import com.banks.employee.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner sc;
    public static ArrayList<String> names;
    public static void main(String[] args) {

        names = new ArrayList<>();
        Collections.addAll(names,"Vijaya","Kavya","Mohit");
        try {
            System.out.println(names.get(3));
        }catch (Exception e){
            System.out.println(e.getClass());
            System.out.println(e.getLocalizedMessage());
        }
        sc = new Scanner(System.in);
        askAge();


    }

    public static void askAge(){
        System.out.println("Please enter you age");
        try {
            String age = sc.nextLine();
            System.out.println("Entered age is " + age);
        }catch (Exception e){
            System.out.println(e.getClass());
            System.out.println(e.getLocalizedMessage());
            sc.nextLine();
            askAge();
        }
        sc.nextLine();
        System.out.println("Form Completed");
    }
}

//Write a programme to save product information
//Ex: name,version,weight,dimensions-lbh,simslot,cardslot,battery
//


