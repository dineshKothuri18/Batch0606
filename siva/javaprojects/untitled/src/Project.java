
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> personDetails = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println("1. Add Person");
            System.out.println("2. Update Person");
            System.out.println("3. Delete Person");
            System.out.println("4. Display Persons");
            System.out.println("5. Exit");
            System.out.print("Choose an option : ");
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
        System.out.print("Enter First Name: ");
        person.put("FirstName", scanner.nextLine());

        System.out.print("Enter Last Name: ");
        person.put("LastName", scanner.nextLine());

        System.out.print("Enter Gender: ");
        person.put("Gender", scanner.nextLine());

        System.out.print("Enter Age: ");
        person.put("Age", scanner.nextLine());

        System.out.print("Enter Email: ");
        person.put("email", scanner.nextLine());

        System.out.print("Enter Phone Number: ");
        person.put("PhoneNumber", scanner.nextLine());

        System.out.print("Enter Occupation: ");
        person.put("Occupation", scanner.nextLine());

        System.out.print("Enter Adhaar: ");
        person.put("Adhaar", scanner.nextLine());

        personDetails.add(person);

        System.out.println("Person added successfully.");
    }

    private static void updatePerson(ArrayList<HashMap<String, String>> personDetails, Scanner scanner) {
        displayPersons(personDetails);
        System.out.print("Enter the person number to update: ");
        int personNumber = Integer.parseInt(scanner.nextLine()) - 1;
        if (personNumber >= 0 && personNumber < personDetails.size()) {
            HashMap<String, String> person = personDetails.get(personNumber);

            System.out.print("Enter First Name : ");
            String firstName = scanner.nextLine();
            if (!firstName.isEmpty()) person.put("FirstName", firstName);

            System.out.print("Enter Last Name : ");
            String lastName = scanner.nextLine();
            if (!lastName.isEmpty()) person.put("LastName", lastName);

            System.out.print("Enter Gender : ");
            String gender = scanner.nextLine();
            if (!gender.isEmpty()) person.put("Gender", gender);

            System.out.print("Enter Age : ");
            String age = scanner.nextLine();
            if (!age.isEmpty()) person.put("Age", age);

            System.out.print("Enter Email : ");
            String email = scanner.nextLine();
            if (!email.isEmpty()) person.put("email", email);

            System.out.print("Enter Phone Number : ");
            String phoneNumber = scanner.nextLine();
            if (!phoneNumber.isEmpty()) person.put("PhoneNumber", phoneNumber);

            System.out.print("Enter Occupation : ");
            String occupation = scanner.nextLine();
            if (!occupation.isEmpty()) person.put("Occupation", occupation);

            System.out.print("Enter Adhaar : ");
            String adhar = scanner.nextLine();
            if (!adhar.isEmpty()) person.put("Adhaar", adhar);
            System.out.println();
            System.out.println("     Person updated successfully    ");
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
            System.out.println();
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
                System.out.println();
                System.out.println("Person :" + (i + 1));
                System.out.println("Full Name  : " + person.get("FirstName") + " " + person.get("LastName"));
                System.out.println("Gender     : " + person.get("Gender"));
                System.out.println("Age        : " + person.get("Age"));
                System.out.println("Email      : " + person.get("email"));
                System.out.println("Phone No.  : " + person.get("PhoneNumber"));
                System.out.println("Occupation : " + person.get("Occupation"));
                System.out.println("Adhaar No : " + person.get("Adhaar"));
            }
        }
    }
}
