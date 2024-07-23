import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Janabalekkalu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> personDetails = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Person");
            System.out.println("2. Delete Person");
            System.out.println("3. Display Persons");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    addPerson(personDetails, scanner);
                    break;
                
                case 2:
                    deletePerson(personDetails, scanner);
                    break;
                case 3:
                    displayPersons(personDetails);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private static void addPerson(ArrayList<HashMap<String, String>> personDetails, Scanner scanner) {
        HashMap<String, String> person = new HashMap<>();
        System.out.println("Enter full name: ");
        person.put("fullName", scanner.nextLine());
        System.out.println("Enter gender: ");
        person.put("gender", scanner.nextLine());
        System.out.println("Enter age: ");
        person.put("age", scanner.nextLine());
        System.out.println("Enter email: ");
        person.put("email", scanner.nextLine());
        System.out.println("Enter phone number: ");
        person.put("phoneNumber", scanner.nextLine());
        System.out.println("Enter occupation: ");
        person.put("occupation", scanner.nextLine());
        System.out.println("Enter adhar: ");
        person.put("adhar", scanner.nextLine());
        personDetails.add(person);
        System.out.println("Person added successfully.");
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
     System.out.println((i + 1) + " . " + person.get("fullName") + "  =  " + person.get("gender") + " , " + person.get("age") + " , " + person.get("email") + " , " + person.get("phoneNumber") + " , " + person.get("occupation") + " , " + person.get("adhar"));
            }
        }
    }
}



