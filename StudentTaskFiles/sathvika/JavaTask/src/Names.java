import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Names {
    public static ArrayList<HashMap<String, String>> people = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean options = true;
        while (options) {
            person();
            printUserDetails();
            System.out.println("1. Add Person Details to the PeopleList");
            System.out.println("2. Update Person Details of a Person in the PeopleList");
            System.out.println("3. Remove Person From the PeopleList");
            System.out.println("4. Print User Details From the PeopleList");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                addPersonDetails();
            } else if (choice == 2) {
                updatePersonDetails();
            } else if (choice == 3) {
                removePersonDetails();
            } else if (choice == 4) {
                printUserDetails();
            } else if (choice == 5) {
                options = false;
            } else {
                System.out.println("Invalid option. Please enter the correct details.");
            }
        }
    }

    public static void person() {
        HashMap<String, String> personDetails = new HashMap<>();
        System.out.println("Please enter First Name of the Person: ");
        String fname = sc.nextLine();
        personDetails.put("FirstName", fname);

        System.out.println("Please enter Second Name of the Person: ");
        String lname = sc.nextLine();
        personDetails.put("SecondName", lname);

        System.out.println("Please enter your Mail ID: ");
        String mail = sc.nextLine();
        personDetails.put("MailID", mail);

        System.out.println("Please enter your Phone Number: ");
        String number = sc.nextLine();
        personDetails.put("PhoneNumber", number);

        System.out.println("Please enter your address: ");
        String address = sc.nextLine();
        personDetails.put("Address", address);

        System.out.println("Please enter your occupation: ");
        String job = sc.nextLine();
        personDetails.put("Occupation", job);

        System.out.println("Please enter your age: ");
        String age = sc.nextLine();
        personDetails.put("Age", age);

        System.out.println("Please enter your Gender (M/F/O): ");
        String gender = sc.nextLine();
        if (gender.equalsIgnoreCase("M")) {
            System.out.println("Male");
        } else if (gender.equalsIgnoreCase("F")) {
            System.out.println("Female");
        } else {
            System.out.println("Others");
        }
        personDetails.put("Gender", gender);

        System.out.println("Please enter your Aadhaar Number: ");
        String aadhaar = sc.nextLine();
        personDetails.put("AadhaarNumber", aadhaar);

        people.add(personDetails);
    }

    public static void printUserDetails() {
        for (HashMap<String, String> person : people) {
            System.out.println("Name: " + person.get("FirstName") + " " + person.get("SecondName"));
            System.out.println("Mail ID: " + person.get("MailID"));
            System.out.println("Phone Number: " + person.get("PhoneNumber"));
            System.out.println("Address: " + person.get("Address"));
            System.out.println("Occupation: " + person.get("Occupation"));
            System.out.println("Age: " + person.get("Age"));
            System.out.println("Gender: " + person.get("Gender"));
            System.out.println("Aadhaar Number: " + person.get("AadhaarNumber"));
            System.out.println("_________________");
        }
    }

    public static void addPersonDetails() {
        HashMap<String, String> personDetails = new HashMap<>();

        System.out.println("Please enter first name: ");
        String fname = sc.nextLine();
        personDetails.put("FirstName", fname);

        System.out.println("Please enter second name: ");
        String lname = sc.nextLine();
        personDetails.put("SecondName", lname);

        System.out.println("Please your email ID: ");
        String mail = sc.nextLine();
        personDetails.put("MailID", mail);

        System.out.println("Please enter your phone number: ");
        String number = sc.nextLine();
        personDetails.put("PhoneNumber", number);

        System.out.println("Please enter your address: ");
        String address = sc.nextLine();
        personDetails.put("Address", address);

        System.out.println("Please enter your occupation: ");
        String job = sc.nextLine();
        personDetails.put("Occupation", job);

        System.out.println("Please enter your age: ");
        String age = sc.nextLine();
        personDetails.put("Age", age);

        System.out.println("Please enter your gender: ");
        String gender = sc.nextLine();
        personDetails.put("Gender", gender);

        System.out.println("Please enter your Aadhaar Number: ");
        String aadhaar = sc.nextLine();
        personDetails.put("AadhaarNumber", aadhaar);

        people.add(personDetails);

        System.out.println("Person details added successfully.");
    }

    public static void updatePersonDetails() {
        System.out.println("Enter Aadhaar Number to update person details: ");
        String aadhaar = sc.nextLine();

        for (HashMap<String, String> person : people) {
            if (person.get("AadhaarNumber").equals(aadhaar)) {
                System.out.println("Update person details");

                System.out.println("Please enter your first name: ");
                String fname = sc.nextLine();
                person.put("FirstName", fname);

                System.out.println("Please enter your last name: ");
                String lname = sc.nextLine();
                person.put("SecondName", lname);

                System.out.println("Please enter your mail ID: ");
                String mail = sc.nextLine();
                person.put("MailID", mail);

                System.out.println("Please enter your address: ");
                String address = sc.nextLine();
                person.put("Address", address);

                System.out.println("Please enter your occupation: ");
                String job = sc.nextLine();
                person.put("Occupation", job);

                System.out.println("Please enter your age: ");
                String age = sc.nextLine();
                person.put("Age", age);

                System.out.println("Please enter your gender: ");
                String gender = sc.nextLine();
                person.put("Gender", gender);

                System.out.println("Person details updated successfully.");
                return;
            }
        }
        System.out.println("Person not found.");
    }

    public static void removePersonDetails() {
        System.out.println("Enter the Aadhaar Number of the person to remove: ");
        String aadhaar = sc.nextLine();

        for (HashMap<String, String> person : people) {
            if (person.get("AadhaarNumber").equals(aadhaar)) {
                people.remove(person);
                System.out.println("Person removed successfully.");
                return;
            }
        }
        System.out.println("Person not found.");
    }
}