import java.util.*;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HashMap<String, String>> list = new ArrayList<>();
        boolean is = true;

        while (is) {
            System.out.println("Choose an option: ");
            System.out.println("1. Add a new person");
            System.out.println("2. Delete a person");
            System.out.println("3. Modify a person");
            System.out.println("4. Display all persons");
            System.out.println("5. Exit");

            int choice = Integer.valueOf(sc.nextLine());
            //int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    HashMap<String, String> person = new HashMap<>();
                    System.out.print("Enter First name: ");
                    person.put("FName", sc.nextLine());
                    System.out.print("Enter Last name: ");
                    person.put("LName", sc.nextLine());
                    System.out.print("Enter Email: ");
                    person.put("Mail", sc.nextLine());
                    System.out.print("Enter Phone Number: ");
                    person.put("Phone", sc.nextLine());
                    System.out.print("Enter Address: ");
                    person.put("Address", sc.nextLine());
                    System.out.print("Enter Occupation: ");
                    person.put("Occupation", sc.nextLine());
                    System.out.print("Enter Age: ");
                    person.put("Age", sc.nextLine());
                    System.out.print("Enter Gender: ");
                    person.put("Gender", sc.nextLine());
                    System.out.print("Enter Aadhar: ");
                    person.put("Aadhar", sc.nextLine());
                    list.add(person);
                    break;

                case 2:
                    System.out.print("Enter the number of the person to delete (1 to " + list.size() + "): ");
                    int deleteIndex = Integer.valueOf(sc.nextLine()) - 1;
                    if (deleteIndex >= 0 && deleteIndex < list.size()) {
                        list.remove(deleteIndex);
                        System.out.println("Person deleted.");
                    } else {
                        System.out.println("Invalid number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the number of the person to modify (1 to " + list.size() + "): ");
                    int modifyIndex = Integer.valueOf(sc.nextLine()) - 1;
                    if (modifyIndex >= 0 && modifyIndex < list.size()) {
                        HashMap<String, String> personToModify = list.get(modifyIndex);
                        System.out.print("Enter new First name (or press Enter to keep current): ");
                        String newFName = sc.nextLine();
                        if (!newFName.isEmpty()) personToModify.put("FName", newFName);

                        System.out.print("Enter new Last name (or press Enter to keep current): ");
                        String newLName = sc.nextLine();
                        if (!newLName.isEmpty()) personToModify.put("LName", newLName);

                        System.out.print("Enter new Email (or press Enter to keep current): ");
                        String newMail = sc.nextLine();
                        if (!newMail.isEmpty()) personToModify.put("Mail", newMail);

                        System.out.print("Enter new Phone Number (or press Enter to keep current): ");
                        String newPhone = sc.nextLine();
                        if (!newPhone.isEmpty()) personToModify.put("Phone", newPhone);

                        System.out.print("Enter new Address (or press Enter to keep current): ");
                        String newAddress = sc.nextLine();
                        if (!newAddress.isEmpty()) personToModify.put("Address", newAddress);

                        System.out.print("Enter new Occupation (or press Enter to keep current): ");
                        String newOccupation = sc.nextLine();
                        if (!newOccupation.isEmpty()) personToModify.put("Occupation", newOccupation);

                        System.out.print("Enter new Age (or press Enter to keep current): ");
                        String newAge = sc.nextLine();
                        if (!newAge.isEmpty()) personToModify.put("Age", newAge);

                        System.out.print("Enter new Gender (or press Enter to keep current): ");
                        String newGender = sc.nextLine();
                        if (!newGender.isEmpty()) personToModify.put("Gender", newGender);

                        System.out.print("Enter new Aadhar (or press Enter to keep current): ");
                        String newAadhar = sc.nextLine();
                        if (!newAadhar.isEmpty()) personToModify.put("Aadhar", newAadhar);

                        System.out.println("Person details updated.");
                    } else {
                        System.out.println("Invalid number.");
                    }
                    break;

                case 4:
                    System.out.println("\nAll entered details:");
                    for (int i = 0; i < list.size(); i++) {
                        HashMap<String, String> user = list.get(i);
                        System.out.println("\nDetails for Person " + (i + 1) + ":");
                        System.out.println("First Name: " + user.get("FName"));
                        System.out.println("Last Name: " + user.get("LName"));
                        System.out.println("Email: " + user.get("Mail"));
                        System.out.println("Phone: " + user.get("Phone"));
                        System.out.println("Address: " + user.get("Address"));
                        System.out.println("Occupation: " + user.get("Occupation"));
                        System.out.println("Age: " + user.get("Age"));
                        System.out.println("Gender: " + user.get("Gender"));
                        System.out.println("Aadhar: " + user.get("Aadhar"));
                    }
                    break;

                case 5:
                    is = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

            System.out.println("---------------------------------");
        }

        System.out.println("\nProgram ended.\nMalli kaludam");
    }
}