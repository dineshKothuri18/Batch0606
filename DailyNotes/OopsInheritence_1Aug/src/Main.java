import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static ArrayList<String> optionsLis;
    public static ArrayList<String> boysSchemes;
    public static ArrayList<String> girlsSchemes;
    public static Scanner sc;
    public static void main(String[] args) {
        initialise();
        showOptions(optionsLis,"Please select below Option");
        displaySubptions();

        Main main = new Main();
        main.sampleFunction();
    }

    public static void initialise(){
        optionsLis = new ArrayList<>();
        boysSchemes = new ArrayList<>();
        girlsSchemes = new ArrayList<>();
        sc = new Scanner(System.in);

        Collections.addAll(optionsLis,"Boy","Girl");
        Collections.addAll(boysSchemes,"BoySch-1","BoySch-2","BoySch-3","BoySch-4","BoySch-5");
        Collections.addAll(girlsSchemes,"GirSch-1","GirSch-2","GirSch-3");
    }
    public static void displaySubptions(){
        int opt = sc.nextInt();
        switch (opt) {
            case 1 -> showOptions(boysSchemes, "Please select below Boys Schemes");
            case 2 -> showOptions(girlsSchemes, "Please select below Girls Schemes");
            default -> System.out.println("Invalid Option");
        }

        int selectedScheme = sc.nextInt();
        switch (opt){
            case 1->displaySelectedOption(boysSchemes,selectedScheme);
            case 2->displaySelectedOption(girlsSchemes,selectedScheme);
        }
    }

    public static void displaySelectedOption(ArrayList<String>subOption,int index){
        if(index >= 1 && index <= subOption.size()){
            System.out.println("You selected " + subOption.get(index-1) );
        }
    }
    public static void showOptions(ArrayList<String> ref,String message){

        System.out.println(message);
        for (int i = 0; i < ref.size(); i++) {
            System.out.println((i+1)+"."+ref.get(i));
        }
    }

    void sampleFunction(){
        System.out.println("Sample Function");
    }
}