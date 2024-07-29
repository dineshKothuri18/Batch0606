import java.util.ArrayList;
import java.util.Scanner;

public class Allbranch {
    private String custname;
    private String accountnum;
    private String username;
    private String password;
    public boolean StaffOrcust;

    public void stafforcus() {
        Scanner sc = new Scanner(System.in);

            System.out.println("Select the category: \n1) Staff\n2) Customer");
            System.out.println("Enter the option: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    StaffOrcust = true;
                    System.out.println("Please enter details:");
                    System.out.print("Username: ");
                    username = sc.nextLine();
                    System.out.print("Password: ");
                    password = sc.nextLine();
                    break;
                case 2:
                    StaffOrcust = false;
                    System.out.println("Please enter details:");
                    System.out.print("Customer name: ");
                    custname = sc.nextLine();
                    System.out.print("Account number: ");
                    accountnum = sc.nextLine();
                    break;
            }


    }

    public boolean gettorf() {
        return StaffOrcust;
    }
    public String getcustname() {
        return custname;
    }

    public String getAccountnum() {
        return accountnum;
    }
    public String getuserna() {
        return username;
    }

    public String getpassword() {
        return password;
    }
}