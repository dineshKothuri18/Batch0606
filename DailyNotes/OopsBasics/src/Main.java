import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static ArrayList<String> names;
    public static void main(String[] args) {

//        String name = "Oops Class";
//
//        Scanner sc = new Scanner(System.in);
//
//        Car thar = new Car();
//        thar.brandName = "Mahindra";
//        thar.color = "Black";
//        thar.mfgDate = "24Jul2024";
//        thar.price = 900000;
//        thar.startEngine();
//        thar.stopEngine();
//
//        System.out.println(thar.brandName);
//        System.out.println(thar.color);
//        System.out.println(thar.mfgDate);
//        System.out.println(thar.price);
//
//        PersonDetails person = new PersonDetails();
//        person.fName = "Sai";
//        person.lName = "Charan";
//        person.age = 50;
//        person.gender = 'M';
//        person.email = "sai@gmai.com";
//        person.address = "Karimnagar";
//        person.getFullName();
//        person.getNameCount();
//
//
//
//        PersonDetails person2 = new PersonDetails();
//        person2.fName = "Raghu";
//        person2.lName = "Ramji";
//        person2.age = 60;
//        person2.gender = 'M';
//        person2.email = "ramji@gmai.com";
//        person2.address = "Sathenapalli";
//        person2.getFullName();
//        person2.getNameCount();

        State telangana = new State();
        telangana.name = "Telangana";
        telangana.area = 123;
        telangana.population = 456;
        telangana.capitalCity = new City();
        telangana.capitalCity.name = "Hyderabad";
        telangana.capitalCity.noOfhospitals = 1200;
        telangana.capitalCity.noOfPoliceStations = 20;


    }
}

//Task:Create a Class Village & class City each class must have 10 properties
//and create 5 villages and 5 cities in Main

