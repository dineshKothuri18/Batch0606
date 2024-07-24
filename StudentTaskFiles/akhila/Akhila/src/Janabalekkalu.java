import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Janabalekkalu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> personDetails = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Person");
            System.out.println("2. Update Person");
            System.out.println("3. Delete Person");
            System.out.println("4. Display Persons");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    addPerson(personDetails, scanner);
                    break;
                case 2:
                    updatePerson(personDetails, scanner);
                    break;
                case 3:
                    deletePerson(personDetails, scanner);
                    break;
                case 4:
                    displayPersons(personDetails);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private static void addPerson(ArrayList<HashMap<String, String>> personDetails, Scanner scanner) {
        HashMap<String, String> person = new HashMap<>();
        System.out.print("Enter full name: ");
        person.put("fullName", scanner.nextLine());
        System.out.print("Enter gender: ");
        person.put("gender", scanner.nextLine());
        System.out.print("Enter age: ");
        person.put("age", scanner.nextLine());
        System.out.print("Enter email: ");
        person.put("email", scanner.nextLine());
        System.out.print("Enter phone number: ");
        person.put("phoneNumber", scanner.nextLine());
        System.out.print("Enter occupation: ");
        person.put("occupation", scanner.nextLine());
        System.out.print("Enter adhar: ");
        person.put("adhar", scanner.nextLine());
        personDetails.add(person);
        System.out.println("Person added successfully.");
    }

    private static void updatePerson(ArrayList<HashMap<String, String>> personDetails, Scanner scanner) {
        displayPersons(personDetails);
        System.out.print("Enter the person number to update: ");
        int personNumber = Integer.parseInt(scanner.nextLine()) - 1;
        if (personNumber >= 0 && personNumber < personDetails.size()) {
            HashMap<String, String> person = personDetails.get(personNumber);
            System.out.print("Enter new full name (leave blank to keep current): ");
            String fullName = scanner.nextLine();
            if (!fullName.isEmpty()) person.put("fullName", fullName);
            System.out.print("Enter new gender (leave blank to keep current): ");
            String gender = scanner.nextLine();
            if (!gender.isEmpty()) person.put("gender", gender);
            System.out.print("Enter new age (leave blank to keep current): ");
            String age = scanner.nextLine();
            if (!age.isEmpty()) person.put("age", age);
            System.out.print("Enter new email (leave blank to keep current): ");
            String email = scanner.nextLine();
            if (!email.isEmpty()) person.put("email", email);
            System.out.print("Enter new phone number (leave blank to keep current): ");
            String phoneNumber = scanner.nextLine();
            if (!phoneNumber.isEmpty()) person.put("phoneNumber", phoneNumber);
            System.out.print("Enter new occupation (leave blank to keep current): ");
            String occupation = scanner.nextLine();
            if (!occupation.isEmpty()) person.put("occupation", occupation);
            System.out.print("Enter new adhar (leave blank to keep current): ");
            String adhar = scanner.nextLine();
            if (!adhar.isEmpty()) person.put("adhar", adhar);
            System.out.println("Person updated successfully.");
        } else {
            System.out.println("Invalid person number.");
        }
    }

    private static void deletePerson(ArrayList<HashMap<String, String>> personDetails, Scanner scanner) {
        displayPersons(personDetails);
        System.out.print("Enter the person number to delete: ");
        int personNumber = Integer.parseInt(scanner.nextLine()) - 1;
        if (personNumber >= 0 && personNumber < personDetails.size()) {
            personDetails.remove(personNumber);
            System.out.println("Person deleted successfully.");
        } else {
            System.out.println("Invalid person number.");
        }
    }

    private static void displayPersons(ArrayList<HashMap<String, String>> personDetails) {
        if (personDetails.isEmpty()) {
            System.out.println("No persons available.");
        } else {
            for (int i = 0; i < personDetails.size(); i++) {
                HashMap<String, String> person = personDetails.get(i);
             


                System.out.println((i + 1) + ". " + person.get("fullName") + " - " + person.get("gender") + ", " + person.get("age") + ", " + person.get("email") + ", " + person.get("phoneNumber") + ", " + person.get("occupation") + ", " + person.get("adhar"));
            }
        }
    }
}