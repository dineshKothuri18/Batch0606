import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {


        Bank bank = new Bank();
        bank.bankname = "HDFC";
        bank.branchs = new ArrayList<>();

        Branch Branch1 = new Branch();
        //Branch1.branch = "Ammerpet";
        Branch1.name = "guntur";
        Branch1.ifsccode = "HDFC008076";
        Branch1.telenumber = "08637658";
        Branch1.bankeamil = "hdfc@gmail.com";
        Branch1.pincode = "532007";

        Branch1.employees = new ArrayList<>();

        Employee em1 = new Employee();
        em1.fullname = "kavya sri";
        em1.designation = "manager";
        em1.salary = "500000";
        em1.id = "hdfckavyasri";


        Employee em2 = new Employee();
        em2.fullname = "sai";
        em2.designation = "receptionist";
        em2.salary = "500000";
        em2.id = "hdfcsai";


        Employee em3 = new Employee();
        em3.fullname = "sumanth";
        em3.designation = "cashier";
        em3.salary = "500000";
        em3.id = "hdfcsumanth";

        Branch1.employees.add(em1);
        Branch1.employees.add(em2);
        Branch1.employees.add(em3);

        bank.branchs.add(Branch1);


        Branch Branch2 = new Branch();
        // Branch2.branches = "nizampet";
        Branch2.name = "khammam";
        Branch2.ifsccode = "HDFC008076";
        Branch2.telenumber = "08637658";
        Branch2.bankeamil = "hdfc@gmail.com";
        Branch2.pincode = "532007";

        Branch2.employees = new ArrayList<>();

        Employee sd1 = new Employee();
        sd1.fullname = "chitti";
        sd1.designation = "reception";
        sd1.salary = "10000";
        sd1.id = "hdfcchitti";


        Employee sd2 = new Employee();
        sd2.fullname = "fareed";
        sd2.designation = "lockerinchager";
        sd2.salary = "500000";
        sd2.id = "hdfcfareed";


        Employee sd3 = new Employee();
        sd3.fullname = "chai";
        sd3.designation = "profileupdate";
        sd3.salary = "100000";
        sd3.id = "hdfcchai";

        Branch2.employees.add(sd1);
        Branch2.employees.add(sd2);
        Branch2.employees.add(sd3);

        bank.branchs.add(Branch2);


        Branch Branch3 = new Branch();
        //Branch3.branches = "chandanagar";
        Branch3.name = "nellore";
        Branch3.ifsccode = "HDFC008076";
        Branch3.telenumber = "08637658";
        Branch3.bankeamil = "hdfc@gmail.com";
        Branch3.pincode = "532007";

        Branch3.employees = new ArrayList<>();


        Employee cm1 = new Employee();
        cm1.fullname = "harsha";
        cm1.designation = "loan";
        cm1.salary = "10000";
        cm1.id = "hdfcharsha";


        Employee cm2 = new Employee();
        cm2.fullname = "rani";
        cm2.designation = "cleaning";
        cm2.salary = "500000";
        cm2.id = "hdfcrani";


        Employee cm3 = new Employee();
        cm3.fullname = "jyothi";
        cm3.designation = "customercare";
        cm3.salary = "100000";
        cm3.id = "hdfcjyothi";

        Branch3.employees.add(cm1);
        Branch3.employees.add(cm2);
        Branch3.employees.add(cm3);

        bank.branchs.add(Branch3);


        System.out.println("Bank Name: " + bank.bankname);
        for (int i = 0; i <= 2; i++) {
            System.out.println("Employee location: " + bank.branchs.get(0).name);
            System.out.println("IFSC code: " + bank.branchs.get(0).ifsccode);
            System.out.println("Tele number: " + bank.branchs.get(0).telenumber);
            System.out.println("Bank Email: " + bank.branchs.get(0).bankeamil);
            System.out.println("Pin code: " + bank.branchs.get(0).pincode);


            System.out.println(bank.branchs.get(0).employees.get(0).fullname);
            System.out.println("--------------------------------------------------------");


            System.out.println("Bank Name: " + bank.bankname);
            System.out.println("Employee location: " + bank.branchs.get(1).name);
            System.out.println("IFSC code: " + bank.branchs.get(1).ifsccode);
            System.out.println("Tele number: " + bank.branchs.get(1).telenumber);
            System.out.println("Bank Email: " + bank.branchs.get(1).bankeamil);
            System.out.println("Pin code: " + bank.branchs.get(1).pincode);


            System.out.println(bank.branchs.get(1).employees.get(1).fullname);
            System.out.println("--------------------------------------------------------");


            System.out.println("Bank Name: " + bank.bankname);
            System.out.println("Employee location: " + bank.branchs.get(2).name);
            System.out.println("IFSC code: " + bank.branchs.get(2).ifsccode);
            System.out.println("Tele number: " + bank.branchs.get(2).telenumber);
            System.out.println("Bank Email: " + bank.branchs.get(2).bankeamil);
            System.out.println("Pin code: " + bank.branchs.get(2).pincode);


            System.out.println(bank.branchs.get(2).employees.get(2).fullname);
            System.out.println("--------------------------------------------------------");


            //System.out.println("bank1.branch");

        }
    }
}
