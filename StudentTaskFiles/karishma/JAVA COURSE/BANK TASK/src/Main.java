//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 public class Main {
    public static void main(String[] args) {
        Banks bank1 = new Banks();
        bank1.bankname = " SBI";
        bank1.bankcount = 3;

        Branch branch1 = new Branch();
        branch1.Branchname = "SBI Old Guntur";
        branch1.IDFC = "SBIN1234";
        branch1.Address = " Guntur, Andhra Pradesh";
        branch1.noofEmployee = 10;

        Staff staff1 = new Staff();
        staff1.nameofemployee = "harshitha";
        staff1.id = 123;
        staff1.designation = "Manager";
        staff1.salary = 90000;

        Staff staff2 = new Staff();
        staff2.nameofemployee = " Bramani";
        staff2.id = 00456;
        staff2.designation = "Assistant manager";
        staff2.salary = 80000;

        Staff staff3 = new Staff();
        staff3.nameofemployee = " swathi";
        staff3.id = 7852;
        staff3.designation = "System operator";
        staff3.salary = 70000;

        Staff staff4 = new Staff();
        staff4.nameofemployee = "santhi";
        staff4.id = 0041;
        staff4.designation = "supervisor";
        staff4.salary = 50000;

        AccountHolder accountHolder1 = new AccountHolder();
        accountHolder1.name = " Karishma ";
        accountHolder1.age = 21;
        accountHolder1.acctype = "Savings account";
        accountHolder1.balance = 25000;

        AccountHolder accountHolder2 = new AccountHolder();
        accountHolder2.name = " jani ";
        accountHolder2.age = 22;
        accountHolder2.acctype = "zero balace account";
        accountHolder2.balance = 5000000;

        AccountHolder accountHolder3 = new AccountHolder();
        accountHolder3.name = " Athik";
        accountHolder3.age = 21;
        accountHolder3.acctype = "current account";
        accountHolder3.balance = 3000;

        branch1.staff.add(staff1);
        branch1.staff.add(staff2);
        branch1.staff.add(staff3);
        branch1.staff.add(staff4);

        branch1.accountHolders.add(accountHolder1);
        branch1.accountHolders.add(accountHolder2);
        branch1.accountHolders.add(accountHolder3);

        Branch branch2 = new Branch();
        branch2.Branchname = "SBI SVN Colony";
        branch2.IDFC = "SBI5236";
        branch2.Address = " SVN Colony  Andhra Pradesh";
        branch2.noofEmployee = 20;

        Staff staff5 = new Staff();
        staff5.nameofemployee = " Suhana";
        staff5.id = 258;
        staff5.designation = "Manager";
        staff5.salary = 75000;

        Staff staff6 = new Staff();
        staff6.nameofemployee = " Almas ";
        staff6.id = 00567;
        staff6.designation = "Assistant manager";
        staff6.salary = 70000;

        Staff staff7 = new Staff();
        staff7.nameofemployee = " Raziyulla";
        staff7.id = 729;
        staff7.designation = "System operator";
        staff7.salary = 100000;

        Staff staff8 = new Staff();
        staff8.nameofemployee = "manasa";
        staff8.id = 841;
        staff8.designation = "Watchman";
        staff8.salary = 1000;

        AccountHolder accountHolder4 = new AccountHolder();
        accountHolder4.name = " Haseena";
        accountHolder4.age = 39;
        accountHolder4.acctype = "Savings account";
        accountHolder4.balance = 42500;

        AccountHolder accountHolder5 = new AccountHolder();
        accountHolder5.name = "uday";
        accountHolder5.age = 52;
        accountHolder5.acctype = "zero balace account";
        accountHolder5.balance = 5000;

        AccountHolder accountHolder6 = new AccountHolder();
        accountHolder6.name = " kesav";
        accountHolder6.age = 40;
        accountHolder6.acctype = "current account";
        accountHolder6.balance = 30000;

        branch2.staff.add(staff5);
        branch2.staff.add(staff6);
        branch2.staff.add(staff7);
        branch2.staff.add(staff8);

        branch2.accountHolders.add(accountHolder4);
        branch2.accountHolders.add(accountHolder5);
        branch2.accountHolders.add(accountHolder6);

        Branch branch3 = new Branch();
        branch3.Branchname = "SBI Aanandha pet";
        branch3.IDFC = "SBI008963";
        branch3.Address = "Aanandha pet, Andhra Pradesh";
        branch3.noofEmployee = 20;

        Staff staff9 = new Staff();
        staff9.nameofemployee = "Nisha";
        staff9.id = 858;
        staff9.designation = "Manager";
        staff9.salary = 95000;

        Staff staff10 = new Staff();
        staff10.nameofemployee = " siri";
        staff10.id = 0567;
        staff10.designation = "Assistant manager";
        staff10.salary = 80000;



        AccountHolder accountHolder7 = new AccountHolder();
        accountHolder7.name = " minni";
        accountHolder7.age = 21;
        accountHolder7.acctype = "Savings account";
        accountHolder7.balance = 4500;

        AccountHolder accountHolder8 = new AccountHolder();
        accountHolder8.name = "harish";
        accountHolder8.age = 52;
        accountHolder8.acctype = "zero balace account";
        accountHolder8.balance = 5000;

        AccountHolder accountHolder9 = new AccountHolder();
        accountHolder9.name = " v.v.kumar";
        accountHolder9.age = 40;
        accountHolder9.acctype = "current account";
        accountHolder9.balance = 50000;

        branch3.staff.add(staff9);
        branch3.staff.add(staff10);


        branch3.accountHolders.add(accountHolder7);
        branch3.accountHolders.add(accountHolder8);
        branch3.accountHolders.add(accountHolder9);

        bank1.branches.add(branch1);
        bank1.branches.add(branch2);
        bank1.branches.add(branch3);

        //Bank 2 deatils:

        Banks bank2 = new Banks();
        bank1.bankname = " HDFC Bank";
        bank1.bankcount = 2;

        Branch branch4 = new Branch();
        branch4.Branchname = "HDFC Kokapet";
        branch4.IDFC = "UBI0001234";
        branch4.Address = " Kokapet, Hyderabad";
        branch4.noofEmployee = 15;

        Staff staff11 = new Staff();

        staff11.nameofemployee = "Srinivas";
        staff11.id = 123;
        staff11.designation = "Manager";
        staff11.salary = 85000;

        Staff staff12 = new Staff();
        staff12.nameofemployee = " B.Harish";
        staff12.id = 456;
        staff12.designation = "Assistant manager";
        staff12.salary = 70000;

        Staff staff13 = new Staff();
        staff13.nameofemployee = " Gopavanitha";
        staff13.id = 789;
        staff13.designation = "System operator";
        staff13.salary = 50000;

        AccountHolder accountHolder10 = new AccountHolder();
        accountHolder10.name = " vyshanavi";
        accountHolder10.age = 40;
        accountHolder10.acctype = "Savings account";
        accountHolder10.balance = 55500;

        AccountHolder accountHolder11 = new AccountHolder();
        accountHolder11.name = " srikantha";
        accountHolder11.age = 45;
        accountHolder11.acctype = "current account";
        accountHolder11.balance = 33000;

        branch4.staff.add(staff11);
        branch4.staff.add(staff12);
        branch4.staff.add(staff13);

        branch4.accountHolders.add(accountHolder10);
        branch4.accountHolders.add(accountHolder11);

        Branch branch5 = new Branch();
        branch5.Branchname = " HDFC  kondapur";
        branch5.IDFC = "HDFC5236";
        branch5.Address = "Kondapur, Hyderabad";
        branch5.noofEmployee = 23;

        Staff staff14= new Staff();
        staff14.nameofemployee = "Lokesh";
        staff14.id = 258;
        staff14.designation = "Manager";
        staff14.salary = 75000;

        Staff staff15 = new Staff();
        staff15.nameofemployee = "Hanuma";
        staff15.id = 567;
        staff15.designation = "Assistant manager";
        staff15.salary = 70000;

        Staff staff16= new Staff();
        staff16.nameofemployee = " ravi";
        staff16.id = 729;
        staff16.designation = "System operator";
        staff16.salary = 45000;

        AccountHolder accountHolder12 = new AccountHolder();
        accountHolder12.name = "Pravanith reddy";
        accountHolder12.age = 921;
        accountHolder12.acctype = "Savings account";
        accountHolder12.balance = 42500;

        AccountHolder accountHolder13 = new AccountHolder();
        accountHolder13.name = "Deepthi reddy";
        accountHolder13.age = 252;
        accountHolder13.acctype = "zero balace account";
        accountHolder13.balance = 524500;

        branch2.staff.add(staff14);
        branch2.staff.add(staff15);
        branch2.staff.add(staff16);

        branch2.accountHolders.add(accountHolder12);
        branch2.accountHolders.add(accountHolder13);

        bank2.branches.add(branch4);
        bank2.branches.add(branch5);

        System.out.println("Bank1 details:" + " " + bank1.bankname);
        for (Branch branch : bank1.branches){
            System.out.println(" Branchname :" + " " + branch.Branchname);
            System.out.println("Branch IDFC :"+ " " + branch.IDFC);
            System.out.println("Branch Address: " + " " + branch.Address);
            System.out.println("Branches employeees: " + " " + branch.noofEmployee);
            System.out.println("    " + " Staff:");

            int staffnumber = 1;
            for (Staff staff : branch1.staff){
                System.out.println("ID: "+ " " + staff.id + " ," +" Name opf the employee:"+ " "+ staff.nameofemployee + " ," +" designation:" + " "+ staff.designation +" ," +" Salary :"+ " "+ staff.salary);
                staffnumber++;
            }

            System.out.println("                  Account holders:");
            int accountholder = 1;
            for(AccountHolder accountHolder : branch1.accountHolders){
                System.out.println("Name:" + " "+ accountHolder.name + " ,"+ " Age: " + " "+ accountHolder.age+ " ,"+ " Accoiunt type:" + " "+ accountHolder.acctype+" ,"+ " Balance:" + " "+ accountHolder.balance);
                accountholder++;
            }
        }

        System.out.println();
        System.out.println("Bank2 details:" + " "+ bank2.bankname);
        for (Branch branch : bank2.branches){
            System.out.println(" Branchname :" + " " + branch.Branchname);
            System.out.println("Branch IDFC :"+ " " + branch.IDFC);
            System.out.println("Branch Address: " + " " + branch.Address);
            System.out.println("Branches employeees: " + " " + branch.noofEmployee);
            System.out.println("    " + " Staff:");

            int staffnumber = 1;
            for (Staff staff : branch2.staff){
                System.out.println("ID: "+ " " + staff.id + " ," +" Name of the employee:"+ " "+ staff.nameofemployee + " ," +" designation:" + " "+ staff.designation +" ," +" Salary :"+ " "+ staff.salary);
                staffnumber++;
            }

            System.out.println("                  Account holders:");
            int accountholder = 1;
            for(AccountHolder accountHolder : branch2.accountHolders){
                System.out.println("Name:" + " "+ accountHolder.name + " ,"+ " Age: " + " "+ accountHolder.age+ " ,"+ " Account type:" + " "+ accountHolder.acctype+" ,"+ " Balance:" + " "+ accountHolder.balance);
                accountholder++;
            }
        }
    }

}
