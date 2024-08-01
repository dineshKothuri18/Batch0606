import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        Bank federal = new Bank("Federal bank");
        federal.branches.add(new Branch("Hyderabad","Federal 123","Kukatpally"));
        federal.branches.add(new Branch("Banagalore","Federal456","Rajaji nagar"));
        federal.branches.add(new Branch("Vizag","Federal0987","Seethammadhara"));

        Bank ICICI = new Bank("ICICI bank");
         ICICI.branches.add(new Branch("Mumbabi","ICICI 567","Bombay"));
         ICICI.branches.add(new Branch("Kolkota"," ICICI 987"," vadodara"));
         ICICI.branches.add(new Branch("kadapa","ICICI 56743","Pulivendhula"));

         Bank sbi = new Bank("State bank of India");
         sbi.branches.add(new Branch("Hyderabad","SBIN0987","Kondapur"));
         sbi.branches.add(new Branch("Anantapur","SBIN8907","Sai nagar"));
         sbi.branches.add(new Branch("Kurnool","SBIN1234","Nandhayala"));

         while (true){
             System.out.println("_________________Enter the Option u want:_______________");
             System.out.println("1. Add Customer");
             System.out.println(("2.Add Staff"));
             System.out.println("3. Display details");
             System.out.println(("4. Exit"));

             int option = sc.nextInt();

             if (option==4){
                 break;
             }

             System.out.println("-------------------------- Choose the option u want----------------------");
             System.out.println("1.Federal");
             System.out.println("2.ICICI");
             System.out.println("3.SBI");
             int bankchoice = sc.nextInt();
             Bank selectedbank = bankchoice==1? federal:bankchoice==2? ICICI:sbi;

             System.out.println("*****************Choose the branch:********************");

             for (int i=0; i<selectedbank.branches.size();i++){
                 System.out.println((i+1) + "." + selectedbank.branches.get(i).branchname);

             }
             int branchchoice = sc.nextInt();
             Branch selectedbranch = selectedbank.branches.get(branchchoice-1);
             sc.nextLine();

             if(option==1){
                 addCustomer(sc, selectedbranch);
             } else if (option==2) {
                 addEmployee(sc, selectedbranch);
             } else if (option==3) {
                 viewDetails(sc, selectedbranch);
             }
         }
             sc.close();
    }
    private static void addCustomer(Scanner sc, Branch branch){
        System.out.println("Enter Customer name:");
        String name = sc.nextLine();
        System.out.println("Enter customer age:");
        int age = sc.nextInt();
        System.out.println("Enter gender:");
        String gender = sc.nextLine();
        System.out.println("Enter customer acc type(savings, current):");
        String acctype = sc.nextLine();

        branch.customers.add(new Customer(name,age,gender,acctype));
    }
    private static void addEmployee(Scanner sc,Branch branch){
        System.out.println(" Enter employee name:");
        String name = sc.nextLine();
        System.out.println("Enter employee designation:");
        String designation = sc.nextLine();
        System.out.println(" Enter employee id:");
        int id = sc.nextInt();
        System.out.println(" Enter employee salary:");
        int salary = sc.nextInt();

        branch.employees.add(new Employee(name,id,designation,salary));
    }
    private static void viewDetails(Scanner sc, Branch branch){
        System.out.println("view details");
        System.out.println("1. Employees");
        System.out.println("2. Customers");
        int choice = sc.nextInt();

         if (choice==1){
             System.out.println("Employee details:");
             for(Employee employee : branch.employees){
                 System.out.println("Name:"+ " "+ employee.name);
                 System.out.println("Designation:"+ " "+ employee.designation);
                 System.out.println("ID: "+ " "+ employee.id);
                 System.out.println("Salary:"+" "+ employee.salary);
             }
         }else {

             System.out.println("Enter customer details:");
             for (Customer customer : branch.customers){
                 System.out.println("Name:"+" "+ customer.name);
                 System.out.println("Age:"+ " "+ customer.age);
                 System.out.println("Gender:"+ " "+ customer.gender);
                 System.out.println("Account type:"+ " "+ customer.acctype);
             }
         }
    }
}
