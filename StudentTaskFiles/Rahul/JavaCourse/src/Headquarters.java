import java.util.ArrayList;
import java.util.Scanner;

public class Headquarters {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        //Bank-1 Details
        Bank SBI = new Bank();

        SBI.Bank_name = "State Bank of India"; //Bank-1
        SBI.branches = new ArrayList<>();

        Branch branch1 = new Branch(); // Bank-1 --> Branch 1
        branch1.Branch_name = "Hyderabad";
        branch1.IFSC_code = 101;
        branch1.location = "Kukatpally";
        branch1.employees = new ArrayList<>();
        SBI.branches.add(branch1);

        Employee employee1 = new Employee(); //Bank-1 --> Branch 1 --> Employee1
        employee1.employee_Name = "Sumanth";
        employee1.employee_ID = 1;
        employee1.Designation = "Manager";
        employee1.Salary = 100000;
        branch1.employees.add(employee1);

        Employee employee2 = new Employee(); //Bank-1 --> Branch 1 --> Employee2
        employee2.employee_Name = "Vijaya";
        employee2.employee_ID = 2;
        employee2.Designation = "Assit. Manager";
        employee2.Salary = 80000;
        branch1.employees.add(employee2);

        Employee employee3 = new Employee(); //Bank-1 --> Branch 1 --> Employee3
        employee3.employee_Name = "Kavya";
        employee3.employee_ID = 3;
        employee3.Designation = "Recovery Agent";
        employee3.Salary = 60000;
        branch1.employees.add(employee3);

        Employee employee4 = new Employee(); //Bank-1 --> Branch 1 --> Employee4
        employee4.employee_Name = "Raghu";
        employee4.employee_ID = 4;
        employee4.Designation = "Loan Officer";
        employee4.Salary = 60000;
        branch1.employees.add(employee4);

        Branch branch2 = new Branch(); // Bank-1 --> Branch 2
        branch2.Branch_name = "Khammam";
        branch2.IFSC_code = 102;
        branch2.location = "Kusumanchi";
        branch2.employees = new ArrayList<>();
        SBI.branches.add(branch2);

        employee1 = new Employee(); //Bank-1 --> Branch 2 --> Employee1
        employee1.employee_Name = "Rahul";
        employee1.employee_ID = 1;
        employee1.Designation = "Manager";
        employee1.Salary = 100000;
        branch2.employees.add(employee1);

        employee2 = new Employee(); //Bank-1 --> Branch 2 --> Employee2
        employee2.employee_Name = "Sai kumar";
        employee2.employee_ID = 2;
        employee2.Designation = "Assit. Manager";
        employee2.Salary = 80000;
        branch2.employees.add(employee2);

        employee3 = new Employee(); //Bank-1 --> Branch 2 --> Employee3
        employee3.employee_Name = "Sathvika";
        employee3.employee_ID = 3;
        employee3.Designation = "Recovery Agent";
        employee3.Salary = 60000;
        branch2.employees.add(employee3);

        employee4 = new Employee(); //Bank-1 --> Branch 2 --> Employee4
        employee4.employee_Name = "Sai deepa";
        employee4.employee_ID = 4;
        employee4.Designation = "Loan Officer";
        employee4.Salary = 60000;
        branch2.employees.add(employee4);


        //Bank 2 Details
        Bank HDFC = new Bank();

        HDFC.Bank_name = "HDFC BANK"; //Bank-2
        HDFC.branches = new ArrayList<>();

        branch1 = new Branch(); //Bank-2 --> Branch 1
        branch1.Branch_name = "Hyderabad";
        branch1.IFSC_code = 101;
        branch1.location = "Kukatpally";
        branch1.employees = new ArrayList<>();
        HDFC.branches.add(branch1);

        employee1 = new Employee(); //Bank-2 --> Branch 1 --> Employee1
        employee1.employee_Name = "Sumanth";
        employee1.employee_ID = 1;
        employee1.Designation = "Manager";
        employee1.Salary = 100000;
        branch1.employees.add(employee1);

        employee2 = new Employee();//Bank-2 --> Branch 1 --> Employee2
        employee2.employee_Name = "Vijaya";
        employee2.employee_ID = 2;
        employee2.Designation = "Assit. Manager";
        employee2.Salary = 80000;
        branch1.employees.add(employee2);

        employee3 = new Employee(); //Bank-2 --> Branch 1 --> Employee3
        employee3.employee_Name = "Kavya";
        employee3.employee_ID = 3;
        employee3.Designation = "Recovery Agent";
        employee3.Salary = 60000;
        branch1.employees.add(employee3);

        employee4 = new Employee(); //Bank-2 --> Branch 1 --> Employee4
        employee4.employee_Name = "Raghu";
        employee4.employee_ID = 4;
        employee4.Designation = "Loan Officer";
        employee4.Salary = 60000;
        branch1.employees.add(employee4);

        branch2 = new Branch(); //Bank-2 --> Branch 2
        branch2.Branch_name = "Khammam";
        branch2.IFSC_code = 102;
        branch2.location = "Kusumanchi";
        branch2.employees = new ArrayList<>();
        HDFC.branches.add(branch2);

        employee1 = new Employee(); //Bank-2 --> Branch 2 --> Employee1
        employee1.employee_Name = "Rahul";
        employee1.employee_ID = 1;
        employee1.Designation = "Manager";
        employee1.Salary = 100000;
        branch2.employees.add(employee1);

        employee2 = new Employee(); //Bank-2 --> Branch 2 --> Employee2
        employee2.employee_Name = "Sai kumar";
        employee2.employee_ID = 2;
        employee2.Designation = "Assit. Manager";
        employee2.Salary = 80000;
        branch2.employees.add(employee2);

        employee3 = new Employee(); //Bank-2 --> Branch 2 --> Employee3
        employee3.employee_Name = "Sathvika";
        employee3.employee_ID = 3;
        employee3.Designation = "Recovery Agent";
        employee3.Salary = 60000;
        branch2.employees.add(employee3);

        employee4 = new Employee(); //Bank-2 --> Branch 2 --> Employee4
        employee4.employee_Name = "Sai deepa";
        employee4.employee_ID = 4;
        employee4.Designation = "Loan Officer";
        employee4.Salary = 60000;
        branch2.employees.add(employee4);
        boolean flag = true;
        while(flag) {
            System.out.println("To view the details");
            System.out.println("Please choose the Bank");
            System.out.println("1. SBI");
            System.out.println("2. HDFC");
            System.out.println("3. Exit");
            int p = sc.nextInt();
            switch (p){
                case 1:
                    view_details(SBI);
                    break;
                case 2:
                    view_details(HDFC);
                    break;
                case 3:
                    flag = false;
                    System.out.println("BYE");
                    break;
                default:
                    System.out.println("Enter the correct number");


            }
        }
    }
    public static void view_details(Bank SBI){
        for(int i = 0; i < SBI.branches.size();i++){
            System.out.println("The Employees Details of "+SBI.Bank_name+" "+SBI.branches.get(i).Branch_name+" Branch.");
            System.out.println("-----------------------------------------------------------------");
            System.out.format("|%-5s|%-20s|%-12s|%-15s|%-8s|","S.No","Employee Name","Employee ID","Designation","Salary");
            System.out.println();
            System.out.println("-----------------------------------------------------------------");
            for(int j = 0; j < SBI.branches.get(i).employees.size();j++){
                System.out.format("|%-5d|%-20s|%-12d|%-15s|%-8s|",(j+1),SBI.branches.get(i).employees.get(j).employee_Name,SBI.branches.get(i).employees.get(j).employee_ID,SBI.branches.get(i).employees.get(j).Designation,SBI.branches.get(i).employees.get(j).Salary);
                System.out.println();
            }
            System.out.println("-----------------------------------------------------------------");
        }
    }
}
