import java.util.ArrayList;
import java.util.Scanner;

public class Start_Ekkada {
    public static int sbicnt = 0;
    public static int hdfcnt = 0;
    public static int icicicnt = 0;
    public static int sbiempcnt = 0;
    public static int hdfempcnt = 0;
    public static int iciciempcnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Bank 1
        Bank sbi = new Bank();
        sbi.Bank_Name = "State Bank of India";
        sbi.shortcut = "SBI ";
        sbi.branches = new ArrayList<>();

        // Bank-1 --> Branch 1
        Branch branch1 = new Branch("Hyderabad", "SBI 1328", "Kukatpally");
        branch1.employees = new ArrayList<>();
        branch1.customers = new ArrayList<>();
        sbi.branches.add(branch1);
        // Bank-1 --> Branch 2
        Branch branch2 = new Branch("Khammam", "SBI 0143", "Kusumanchi");
        branch2.employees = new ArrayList<>();
        branch2.customers = new ArrayList<>();
        sbi.branches.add(branch2);
        // Bank-1 --> Branch 3
        Branch branch3 = new Branch("Mumbai", "SBI 1432", "Navi munbai");
        branch3.employees = new ArrayList<>();
        branch3.customers = new ArrayList<>();
        sbi.branches.add(branch3);

        // Bank-2
        Bank hdfc = new Bank();
        hdfc.Bank_Name = "HDFC BANK";
        hdfc.shortcut = "HDFC ";
        hdfc.branches = new ArrayList<>();
        // Bank-2 --> Branch1
        branch1 = new Branch("Delhi", "HDFC 1328", "new delhi"); // Bank-1 --> Branch 1
        branch1.employees = new ArrayList<>();
        branch1.customers = new ArrayList<>();
        hdfc.branches.add(branch1);
        // Bank-2 --> Branch2
        branch2 = new Branch("Chennai", "HDFC 0143", "Marina");
        branch2.employees = new ArrayList<>();
        branch2.customers = new ArrayList<>();
        hdfc.branches.add(branch2);
        // Bank-2 --> Branch3
        branch3 = new Branch("Bengaluru", "HDFC 1432", "White fields");
        branch3.employees = new ArrayList<>();
        branch3.customers = new ArrayList<>();
        hdfc.branches.add(branch3);

        //Bank-3
        Bank icici = new Bank();
        icici.Bank_Name = "ICICI BANK";
        icici.shortcut = "ICICI ";
        icici.branches = new ArrayList<>();
        //Bank-3 --> Branch-1
        branch1 = new Branch("Manipur", "ICICI 1328", "Imphal"); // Bank-1 --> Branch 1
        branch1.employees = new ArrayList<>();
        branch1.customers = new ArrayList<>();
        icici.branches.add(branch1);
        //Bank-3 --> Branch-2
        branch2 = new Branch("UP", "ICICI 0143", "Ayodhya");
        branch2.employees = new ArrayList<>();
        branch2.customers = new ArrayList<>();
        icici.branches.add(branch2);
        //Bank-3 --> Branch-3
        branch3 = new Branch("Gujarat", "ICICI 1432", "Dwaraka");
        branch3.employees = new ArrayList<>();
        branch3.customers = new ArrayList<>();
        icici.branches.add(branch3);
        int rp = 1;
        while (rp == 1) {
            System.out.println("Please choose Whose Details you wanna add");
            System.out.println("1. Customer");
            System.out.println("2. Staff/Employee");
            System.out.println("3. Exit");
            int p = sc.nextInt();
            switch (p) {
                case 1:
                    System.out.println("Please Choose a bank to which you wanna add Customer");
                    System.out.println("1. SBI");
                    System.out.println("2. HDFC");
                    System.out.println("3. ICICI");
                    int r = sc.nextInt();
                    switch (r) {
                        case 1:
                            Branch b = choose_branch(sbi, r);
                            Add_customer_details(sbi, b);
                            break;
                        case 2:
                            Branch b1 = choose_branch(hdfc, r);
                            Add_customer_details(hdfc, b1);
                            break;
                        case 3:
                            Branch b2 = choose_branch(icici, r);
                            Add_customer_details(icici, b2);
                            break;
                        default:
                            System.out.println("Please Enter a valid Input");
                    }

                    break;
                case 2:
                    System.out.println("Please Choose a bank to add new Employee details");
                    System.out.println("1. SBI");
                    System.out.println("2. HDFC");
                    System.out.println("3. ICICI");
                    int a = sc.nextInt();
                    switch (a) {
                        case 1:
                            Branch b = choose_branch(sbi, a);
                            Add_staff_details(sbi, b);
                            break;
                        case 2:
                            Branch b1 = choose_branch(hdfc, a);
                            Add_staff_details(hdfc, b1);
                            break;
                        case 3:
                            Branch b2 = choose_branch(icici, a);
                            Add_staff_details(icici, b2);
                            break;
                        default:
                            System.out.println("Please Enter a valid Input");
                    }

                    break;
                case 3:
                    rp = 0;
                    break;

                default:
                    System.out.println("please Enter a Valid input");
            }
        }
        System.out.println("Please choose whose details you wanna display");
        System.out.println("1. Customer");
        System.out.println("2. Staff/Employee");
        System.out.println("3. Managers Details");
        int p = sc.nextInt();
        switch (p) {
            case 1:
                System.out.println("Please Choose a bank to display the customers");
                System.out.println("1. SBI");
                System.out.println("2. HDFC");
                System.out.println("3. ICICI");
                int r = sc.nextInt();
                switch (r) {
                    case 1:
                        Branch b = choose_branch(sbi, r);
                        view_details(sbi, b, 0 );
                        break;
                    case 2:
                        Branch b1 = choose_branch(hdfc, r);
                        view_details(hdfc, b1, 0);
                        break;
                    case 3:
                        Branch b2 = choose_branch(icici, r);
                        view_details(icici, b2, 0);
                        break;
                    default:
                        System.out.println("Please Enter a valid Input");
                }
                break;
            case 2:
                System.out.println("Please Choose a bank to display the employees details");
                System.out.println("1. SBI");
                System.out.println("2. HDFC");
                System.out.println("3. ICICI");
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        Branch b = choose_branch(sbi, a);
                        view_details(sbi, b,1);
                        break;
                    case 2:
                        Branch b1 = choose_branch(hdfc, a);
                        view_details(hdfc, b1,1);
                        break;
                    case 3:
                        Branch b2 = choose_branch(icici, a);
                        view_details(icici, b2,1);
                        break;
                    default:
                        System.out.println("Please Enter a valid Input");
                }

                break;
            case 3:
                System.out.println("The Managers Details of all Banks are");
                System.out.println("-----------------------------------------------------------------");
                System.out.format("|%-5s|%-20s|%-12s|%-15s|%-8s|","S.No","Employee Name","Employee ID","Designation","Salary");
                System.out.println();
                System.out.println("-----------------------------------------------------------------");
                view_details(sbi);
                view_details(hdfc);
                view_details(icici);
                System.out.println("-----------------------------------------------------------------");
                break;
            default:
                System.out.println("please Enter a Valid input");
        }
    }

    public static Branch choose_branch(Bank sbi, int p) {
        Scanner sc = new Scanner(System.in);
        switch (p) {
            case 1:
                boolean flag = true;
                while (flag) {
                    System.out.println("Please choose the branch");
                    System.out.println("1. Hyderabad");
                    System.out.println("2. Khammam");
                    System.out.println("3. Mumbai");
                    int r = sc.nextInt();
                    if (r >= 1 && r <= 3) {
                        flag = false;
                        return sbi.branches.get(r - 1);
                    } else {
                        System.out.println("Please Enter a Valid input");
                    }
                }
            case 2:
                boolean flag1 = true;
                while (flag1) {
                    System.out.println("Please choose the branch");
                    System.out.println("1. Delhi");
                    System.out.println("2. Chennai");
                    System.out.println("3. Bengaluru");
                    int r = sc.nextInt();
                    if (r >= 1 && r <= 3) {
                        flag1 = false;
                        return sbi.branches.get(r - 1);
                    } else {
                        System.out.println("Please Enter a Valid input");
                    }
                }
            case 3:
                boolean flag2 = true;
                while (flag2) {
                    System.out.println("Please choose the branch");
                    System.out.println("1. Manipur");
                    System.out.println("2. UP");
                    System.out.println("3. Gujarat");
                    int r = sc.nextInt();
                    if (r >= 1 && r <= 3) {
                        flag2 = false;
                        return sbi.branches.get(r - 1);
                    } else {
                        System.out.println("Please Enter a Valid input");
                    }
                }
        }
        return null;
    }

    public static void Add_customer_details(Bank sbi, Branch hyderabad) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Following Details:");
        System.out.println("Enter the Account Holder Name: ");
        String Name = sc.nextLine();
        System.out.println("Enter the Account type (Savings, Current, Salary, NRI)");
        String Account_type = sc.nextLine();
        System.out.println("Enter Gender");
        char gender = sc.nextLine().charAt(0);
        System.out.println("Enter customers Date of Birth");
        String dob = sc.nextLine();
        System.out.println("Enter customers Fathers name");
        String fathersname = sc.nextLine();
        String Account_number = Acc_ID(sbi,hyderabad);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        Customer customer = new Customer(Name, Account_type,Account_number,gender, dob, fathersname,age);
        sbi.branches.get(sbi.branches.indexOf(hyderabad)).customers.add(customer);
    }
    public static String Acc_ID(Bank sbi, Branch hyderabad){
        String ans = "";
        if(sbi.shortcut.equals("SBI")){
            ans = ans+"9001";
            sbiempcnt++;
        }
        else if(sbi.shortcut.equals("HDFC")){
            ans = ans+"9002";
            hdfempcnt++;
        }
        else if(sbi.shortcut.equals("ICICI")){
            ans = ans+"9003";
            iciciempcnt++;
        }
        if(sbi.branches.get(sbi.branches.indexOf(hyderabad)).Branch_name.equals("Hyderabad")){
            ans = ans+"8101";
        }
        else if(sbi.branches.get(sbi.branches.indexOf(hyderabad)).Branch_name.equals("Khammam")){
            ans = ans+"8102";
        }
        else if(sbi.branches.get(sbi.branches.indexOf(hyderabad)).Branch_name.equals("Mumbai")){
            ans = ans+"8103";
        }
        else if(sbi.branches.get(sbi.branches.indexOf(hyderabad)).Branch_name.equals("Delhi")){
            ans = ans+"8201";
        }
        else if(sbi.branches.get(sbi.branches.indexOf(hyderabad)).Branch_name.equals("Chennai")){
            ans = ans+"8202";
        }
        else if(sbi.branches.get(sbi.branches.indexOf(hyderabad)).Branch_name.equals("Bengaluru")){
            ans = ans+"8203";
        }
        else if(sbi.branches.get(sbi.branches.indexOf(hyderabad)).Branch_name.equals("Manipur")){
            ans = ans+"8301";
        }
        else if(sbi.branches.get(sbi.branches.indexOf(hyderabad)).Branch_name.equals("UP")){
            ans = ans+"8302";
        }
        else if(sbi.branches.get(sbi.branches.indexOf(hyderabad)).Branch_name.equals("Gujarat")){
            ans = ans+"8303";
        }
        if(sbi.shortcut.equals("SBI")){
            ans = ans+String.valueOf(sbiempcnt);
        }
        else if(sbi.shortcut.equals("HDFC")){
            ans = ans+String.valueOf(hdfempcnt);
        }
        else if(sbi.shortcut.equals("ICICI")){
            ans = ans+String.valueOf(iciciempcnt);
        }
        return ans;
    }

    public static void Add_staff_details(Bank sbi, Branch hyderabad) {
        int cnt = 0;
        if(sbi.Bank_Name.equals("State Bank of India")){
            cnt = sbicnt++;
        }
        if(sbi.Bank_Name.equals("HDFC BANK")){
            cnt = hdfcnt++;
        }
        if(sbi.Bank_Name.equals("ICICI BANK")){
            cnt = icicicnt++;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Following Details:");
        System.out.println("Enter the Employee Name: ");
        String Employee_name = sc.nextLine();
        System.out.println("Enter Designation");
        String Designation = sc.nextLine();
        System.out.println("Enter Salary for the Designation");
        int Salary = sc.nextInt();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        Employee employees = new Employee(Employee_name, sbi.shortcut+String.valueOf(cnt+1), Designation, Salary,age);
        sbi.branches.get(sbi.branches.indexOf(hyderabad)).employees.add(employees);
    }
    public static void view_details(Bank SBI){
        for(int i = 0; i < SBI.branches.size();i++){
            for(int j = 0; j < SBI.branches.get(i).employees.size();j++){
                if(SBI.branches.get(i).employees.get(j).Designation.equals("Manager")) {
                    System.out.format("|%-5d|%-20s|%-12s|%-15s|%-8s|", (j + 1), SBI.branches.get(i).employees.get(j).Name, SBI.branches.get(i).employees.get(j).employee_ID, SBI.branches.get(i).employees.get(j).Designation, SBI.branches.get(i).employees.get(j).Salary);
                    System.out.println();
                }
            }

        }
    }
    public static void view_details(Bank SBI , Branch b, int p) {

        switch (p){
            case 1:
                    System.out.println("The Employees Details of "+SBI.Bank_Name+" "+SBI.branches.get(SBI.branches.indexOf(b)).Branch_name+" Branch.");
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.format("|%-5s|%-20s|%-12s|%-10s|%-15s|%-8s|","S.No","Employee Name","Employee ID","Age","Designation","Salary");
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------");
                    for(int j = 0; j < SBI.branches.get(SBI.branches.indexOf(b)).employees.size();j++){
                        System.out.format("|%-5d|%-20s|%-12s|%-10d|%-15s|%-8s|",(j+1),SBI.branches.get(SBI.branches.indexOf(b)).employees.get(j).Name,SBI.branches.get(SBI.branches.indexOf(b)).employees.get(j).employee_ID,SBI.branches.get(SBI.branches.indexOf(b)).employees.get(j).Age,SBI.branches.get(SBI.branches.indexOf(b)).employees.get(j).Designation,SBI.branches.get(SBI.branches.indexOf(b)).employees.get(j).Salary);
                        System.out.println();
                    }
                    System.out.println("-----------------------------------------------------------------------------");
                    break;
            case 0:
                    System.out.println("The Customer Details of "+SBI.Bank_Name+" "+SBI.branches.get(SBI.branches.indexOf(b)).Branch_name+" Branch.");
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.format("|%-5s|%-20s|%-12s|%-8s|%-8s|%-8s|%-20s|","S.No","Customer Name","Account Type","Age","Gender","DOB","Fathers Name");
                    System.out.println();
                    System.out.println("--------------------------------------------------------------------------------------");
                    for(int i = 0; i < SBI.branches.get(SBI.branches.indexOf(b)).customers.size();i++){
                        System.out.format("|%-5s|%-20s|%-12s|%-8d|%-8s|%-8s|%-20s|",(i+1),SBI.branches.get(SBI.branches.indexOf(b)).customers.get(i).Name,SBI.branches.get(SBI.branches.indexOf(b)).customers.get(i).Account_type,SBI.branches.get(SBI.branches.indexOf(b)).customers.get(i).Age,SBI.branches.get(SBI.branches.indexOf(b)).customers.get(i).Gender,SBI.branches.get(SBI.branches.indexOf(b)).customers.get(i).Date_of_birth,SBI.branches.get(SBI.branches.indexOf(b)).customers.get(i).Father_name);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------------------------------------------");
                    break;
        }
    }
}


