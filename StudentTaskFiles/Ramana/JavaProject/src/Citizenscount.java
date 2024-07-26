import java.util.*;

public class Citizenscount {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String,HashMap<String,String>> citizenDatabase = new HashMap<>();
        while(true){
            displayActions();
            String choices = scanner.nextLine();
            switch(choices){
                case"1":
                case"Add person details":
                    addPerson(citizenDatabase);
                    break;
                case "2":
                case "modify person":
                    modifyPerson(citizenDatabase);
                    break;
                case "3":
                case "delete person":
                    deletePerson(citizenDatabase);
                    break;
                case "4":
                case "display person":
                    displayPerson(citizenDatabase);
                    break;
                case "5":
                case "exit":
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option number or command.");
                    break;
            }
            HashMap<String, String> details = citizenDetails();
            displayDetails(details);
            System.out.print("\n Do you want to modify any detail? (yes/no): ");
            String choice = scanner.nextLine().trim().toLowerCase();
            if (choice.equals("yes")) {
                modifyDetails(details);
                displayDetails(details);
            } else if (choice.equals("no")) {
                System.out.println("Thank you for entering your details.");
            } else {
                System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            }
        }
//        HashMap<String, String> details = citizenDetails();
//        displayDetails(details);
//        System.out.print("\n Do you want to modify any detail? (yes/no): ");
//        String choice = scanner.nextLine().trim().toLowerCase();
//        if (choice.equals("yes")) {
//            modifyDetails(details);
//            displayDetails(details);
//        } else if (choice.equals("no")) {
//            System.out.println("Thank you for entering your details.");
//        } else {
//            System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
//        }
    }

    public static HashMap<String,String> citizenDetails () {
        HashMap<String, String> citizenDetails = new HashMap<>();
        while (true) {
            System.out.print("Enter your FirstName: ");
            String firstName = scanner.nextLine();
            if (!firstName.isEmpty()) {
                citizenDetails.put("FirstName", firstName);
                break;
            } else {
                System.out.println("Please enter a valid FirstName.");
            }
        }
        while (true) {
            System.out.print("Enter your LastName: ");
            String lastName = scanner.nextLine();
            if (!lastName.isEmpty()) {
                citizenDetails.put("LastName", lastName);
                break;
            } else {
                System.out.println("Please enter a valid LastName.");
            }
        }
        while (true) {
            System.out.print("Enter your Age: ");
            String ageStr = scanner.nextLine();
            if (!ageStr.isEmpty()) {
                try {
                    int age = Integer.parseInt(ageStr);
                    citizenDetails.put("Age", String.valueOf(age));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid Age (numeric value).");
                }
            } else {
                System.out.println("Please enter a valid Age.");
            }
        }
        while (true) {
            System.out.print("Enter your Gender: ");
            String gender = scanner.nextLine();
            if (!gender.isEmpty()) {
                citizenDetails.put("Gender", gender);
                break;
            } else {
                System.out.println("Please enter a valid Gender.");
            }
        }
        while (true) {
            System.out.print("Enter your MobileNumber: ");
            String mobileNumber = scanner.nextLine();
            if (!mobileNumber.isEmpty()) {
                citizenDetails.put("MobileNumber", mobileNumber);
                break;
            } else {
                System.out.println("Please enter a valid MobileNumber.");
            }
        }
        while (true) {
            System.out.print("Enter your occupation: ");
            String occupation = scanner.nextLine();
            if (!occupation.isEmpty()) {
                citizenDetails.put("Occupation", occupation);
                break;
            } else {
                System.out.println("Please enter a valid Occupation.");
            }
        }
        while (true) {
            System.out.print("Enter your E-mail: ");
            String email = scanner.nextLine();
            if (!email.isEmpty()) {
                citizenDetails.put("E-mail",email );
                break;
            } else {
                System.out.println("Please enter a valid Occupation.");
            }
        }

        return citizenDetails;
    }

    public static void displayDetails(HashMap<String, String> details) {
        System.out.println("\n YOUR DETAILS ARE :");
        for (Map.Entry<String, String> entry : details.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void modifyDetails(HashMap<String, String> details) {
        while (true) {
            System.out.println("\nWhich detail do you want to modify?");
            System.out.println("1. FirstName");
            System.out.println("2. LastName");
            System.out.println("3. Age");
            System.out.println("4. Gender");
            System.out.println("5. MobileNumber");
            System.out.println("6. Occupation");
            System.out.println("7. Email");
            System.out.print("Enter your choice (1-7): ");
            String choiceStr = scanner.nextLine().trim();
            int choice;
            try {
                choice = Integer.parseInt(choiceStr);
                switch (choice) {
                    case 1:
                        modifyDetail(details, "FirstName");
                        break;
                    case 2:
                        modifyDetail(details, "LastName");
                        break;
                    case 3:
                        modifyDetail(details, "Age");
                        break;
                    case 4:
                        modifyDetail(details, "Gender");
                        break;
                    case 5:
                        modifyDetail(details, "MobileNumber");
                        break;
                    case 6:
                        modifyDetail(details, "Occupation");
                        break;
                    case 7:
                        modifyDetail(details,"Email");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 6.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number.");
            }
        }
    }

    public static void modifyDetail(HashMap<String,String> details, String key){
        System.out.println("enter the details u want to modify " + key + ":");
        String newValue = scanner.nextLine();
        details.put(key,newValue);
        System.out.println("modified" + key + "successfully");
    }

    public static void displayActions(){
        System.out.println("***POSSIBLE ACTIONS***");
        System.out.println("1.Add person details");
        System.out.println("2.Delete person details");
        System.out.println("3.Display person details");
        System.out.println("4.Modify person details");
        System.out.println("5.Exit");
        System.out.println("Enter your choice ");
    }

    public static void addPerson(HashMap<String,HashMap<String,String>> citizenDatabase){
        HashMap<String,String> details = citizenDetails();
        String key = details.get("FirstName") + " " + details.get("LastName");
        citizenDatabase.put(key,details);
        System.out.println("Person details added successfully3");
    }

    public static void deletePerson(HashMap<String,HashMap<String,String>> citizenDatabase){
        if(citizenDatabase.isEmpty()){
            System.out.println("No person details please add a person first ");
            return;
        }
        displayPerson(citizenDatabase);
        System.out.println("enter name of the person to perform operation");
        String name = scanner.nextLine();
        if (citizenDatabase.containsKey(name)) {
            citizenDatabase.remove(name);
            System.out.println("Person deleted successfully.");
        } else {
            System.out.println("Person with name '" + name + "' not found.");
        }
    }

    public static void displayPerson(HashMap<String, HashMap<String, String>> citizenDatabase) {
        if (citizenDatabase.isEmpty()) {
            System.out.println("No persons to display.");
            return;
        }
        System.out.println("\n === PERSON DETAILS === ");
        for (String name : citizenDatabase.keySet()) {
            System.out.println(name + ":");
            HashMap<String, String> details = citizenDatabase.get(name);
            for (Map.Entry<String, String> entry : details.entrySet()) {
                System.out.println("\t" + entry.getKey() + ": " + entry.getValue());
            }
            System.out.println();
        }
    }

    public static void modifyPerson(HashMap<String, HashMap<String, String>> citizenDatabase) {
        if (citizenDatabase.isEmpty()) {
            System.out.println("No persons to modify. Please add a person first.");
            return;
        }
        displayPerson(citizenDatabase);
        System.out.print("Enter the name of the person to modify: ");
        String name = scanner.nextLine().trim();
        if (citizenDatabase.containsKey(name)) {
            HashMap<String, String> details = citizenDatabase.get(name);
            modifyDetails(details);
            citizenDatabase.put(name, details);
            System.out.println("Person details modified successfully.");
        } else {
            System.out.println("Person with name '" + name + "' not found.");
        }
    }
}
