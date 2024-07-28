import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        Banks bank1 = new Banks();
        bank1.bankname = " SBI";
        bank1.bankcount = 3;

        Branch branch1 = new Branch();
        branch1.Branchname = "SBI Ameerpet";
        branch1.IDFC = "SBIN001234";
        branch1.Address = " Ameerpet, Hyderabad";
        branch1.noofEmployee = 15;

        Staff staff1 = new Staff();
        staff1.nameofemployee = "Radha";
        staff1.id = 123;
        staff1.designation = "Manager";
        staff1.salary = 85000;

        Staff staff2 = new Staff();
        staff2.nameofemployee = " Krishna";
        staff2.id = 456;
        staff2.designation = "Assistant manager";
        staff2.salary = 70000;

        Staff staff3 = new Staff();
        staff3.nameofemployee = " Malathi";
        staff3.id = 789;
        staff3.designation = "System operator";
        staff3.salary = 50000;

        Staff staff4 = new Staff();
        staff4.nameofemployee = "Prabhakar";
        staff4.id = 741;
        staff4.designation = "Watchman";
        staff4.salary = 20000;

        AccountHolder accountHolder1 = new AccountHolder();
        accountHolder1.name = " Akhila";
        accountHolder1.age = 21;
        accountHolder1.acctype = "Savings account";
        accountHolder1.balance = 2500;

        AccountHolder accountHolder2 = new AccountHolder();
        accountHolder2.name = "chaitanya";
        accountHolder2.age = 22;
        accountHolder2.acctype = "zero balace account";
        accountHolder2.balance = 5000;

        AccountHolder accountHolder3 = new AccountHolder();
        accountHolder3.name = " vamsi krishnna";
        accountHolder3.age = 20;
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
        branch2.Branchname = "SBI Kukatpally";
        branch2.IDFC = "SBI005236";
        branch2.Address = "Kukatpally Hyderabad";
        branch2.noofEmployee = 23;

        Staff staff5 = new Staff();
        staff5.nameofemployee = "Dinesh";
        staff5.id = 258;
        staff5.designation = "Manager";
        staff5.salary = 75000;

        Staff staff6 = new Staff();
        staff6.nameofemployee = " Krishna ram";
        staff6.id = 567;
        staff6.designation = "Assistant manager";
        staff6.salary = 70000;

        Staff staff7 = new Staff();
        staff7.nameofemployee = " Malathi devi";
        staff7.id = 729;
        staff7.designation = "System operator";
        staff7.salary = 45000;

        Staff staff8 = new Staff();
        staff8.nameofemployee = "Prabhakar reddy";
        staff8.id = 841;
        staff8.designation = "Watchman";
        staff8.salary = 18000;

        AccountHolder accountHolder4 = new AccountHolder();
        accountHolder4.name = " Akhila reddy";
        accountHolder4.age = 921;
        accountHolder4.acctype = "Savings account";
        accountHolder4.balance = 42500;

        AccountHolder accountHolder5 = new AccountHolder();
        accountHolder5.name = "Rishi";
        accountHolder5.age = 252;
        accountHolder5.acctype = "zero balace account";
        accountHolder5.balance = 500;

        AccountHolder accountHolder6 = new AccountHolder();
        accountHolder6.name = " Viswanath reddy";
        accountHolder6.age = 40;
        accountHolder6.acctype = "current account";
        accountHolder6.balance = 300000;

        branch2.staff.add(staff5);
        branch2.staff.add(staff6);
        branch2.staff.add(staff7);
        branch2.staff.add(staff8);

        branch2.accountHolders.add(accountHolder4);
        branch2.accountHolders.add(accountHolder5);
        branch2.accountHolders.add(accountHolder6);

        Branch branch3 = new Branch();
        branch3.Branchname = "SBI Nizampet";
        branch3.IDFC = "SBI008963";
        branch3.Address = "Nizampet, Hyderabad";
        branch3.noofEmployee = 20;

        Staff staff9 = new Staff();
        staff9.nameofemployee = "Bharath";
        staff9.id = 858;
        staff9.designation = "Manager";
        staff9.salary = 95000;

        Staff staff10 = new Staff();
        staff10.nameofemployee = " Krishna ram";
        staff10.id = 567;
        staff10.designation = "Assistant manager";
        staff10.salary = 80000;

        Staff staff11 = new Staff();
        staff11.nameofemployee = " Malathi devi";
        staff11.id = 859;
        staff11.designation = "System operator";
        staff11.salary = 55000;

        Staff staff12 = new Staff();
        staff12.nameofemployee = "Babu reddy";
        staff12.id = 841;
        staff12.designation = "clerk";
        staff12.salary = 20000;

        AccountHolder accountHolder7 = new AccountHolder();
        accountHolder7.name = " Gnapika reddy";
        accountHolder7.age = 921;
        accountHolder7.acctype = "Savings account";
        accountHolder7.balance = 4500;

        AccountHolder accountHolder8 = new AccountHolder();
        accountHolder8.name = "Madhu";
        accountHolder8.age = 252;
        accountHolder8.acctype = "zero balace account";
        accountHolder8.balance = 5000;

        AccountHolder accountHolder9 = new AccountHolder();
        accountHolder9.name = " Sivanath reddy";
        accountHolder9.age = 40;
        accountHolder9.acctype = "current account";
        accountHolder9.balance = 50000;

        branch3.staff.add(staff9);
        branch3.staff.add(staff10);
        branch3.staff.add(staff11);
        branch3.staff.add(staff12);

        branch3.accountHolders.add(accountHolder7);
        branch3.accountHolders.add(accountHolder8);
        branch3.accountHolders.add(accountHolder9);

        bank1.branches.add(branch1);
        bank1.branches.add(branch2);
        bank1.branches.add(branch3);

        //Bank 2 deatils:

        Banks bank2 = new Banks();
        bank1.bankname = " Union Bank of India";
        bank1.bankcount = 2;

        Branch branch4 = new Branch();
        branch4.Branchname = "UBI Kokapet";
        branch4.IDFC = "UBI0001234";
        branch4.Address = " Kokapet, Hyderabad";
        branch4.noofEmployee = 15;

        Staff staff13 = new Staff();
        staff13.nameofemployee = "Srinivas";
        staff13.id = 123;
        staff13.designation = "Manager";
        staff13.salary = 85000;

        Staff staff14 = new Staff();
        staff14.nameofemployee = " Triveni";
        staff14.id = 456;
        staff14.designation = "Assistant manager";
        staff14.salary = 70000;

        Staff staff15 = new Staff();
        staff15.nameofemployee = " Sharada";
        staff15.id = 789;
        staff15.designation = "System operator";
        staff15.salary = 50000;

        AccountHolder accountHolder10 = new AccountHolder();
        accountHolder10.name = " Praneeth reddy";
        accountHolder10.age = 22;
        accountHolder10.acctype = "Savings account";
        accountHolder10.balance = 55500;

        AccountHolder accountHolder11 = new AccountHolder();
        accountHolder11.name = " Sunny reddy";
        accountHolder11.age = 22;
        accountHolder11.acctype = "current account";
        accountHolder11.balance = 33000;

        branch4.staff.add(staff13);
        branch4.staff.add(staff14);
        branch4.staff.add(staff15);

        branch4.accountHolders.add(accountHolder10);
        branch4.accountHolders.add(accountHolder11);

        Branch branch5 = new Branch();
        branch5.Branchname = "UBI kondapur";
        branch5.IDFC = "UNI005236";
        branch5.Address = "Kondapur, Hyderabad";
        branch5.noofEmployee = 23;

        Staff staff16 = new Staff();
        staff16.nameofemployee = "Jaswanth reddy";
        staff16.id = 258;
        staff16.designation = "Manager";
        staff16.salary = 75000;

        Staff staff17 = new Staff();
        staff17.nameofemployee = "Bharath chandra";
        staff17.id = 567;
        staff17.designation = "Assistant manager";
        staff17.salary = 70000;

        Staff staff18 = new Staff();
        staff18.nameofemployee = " Swetha";
        staff18.id = 729;
        staff18.designation = "System operator";
        staff18.salary = 45000;

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

        branch2.staff.add(staff16);
        branch2.staff.add(staff17);
        branch2.staff.add(staff18);

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
                System.out.println("ID: "+ " " + staff.id + " ," +" Name opf the employee:"+ " "+ staff.nameofemployee + " ," +" designation:" + " "+ staff.designation +" ," +" Salary :"+ " "+ staff.salary);
                staffnumber++;
            }

            System.out.println("                  Account holders:");
            int accountholder = 1;
            for(AccountHolder accountHolder : branch2.accountHolders){
                System.out.println("Name:" + " "+ accountHolder.name + " ,"+ " Age: " + " "+ accountHolder.age+ " ,"+ " Accoiunt type:" + " "+ accountHolder.acctype+" ,"+ " Balance:" + " "+ accountHolder.balance);
                accountholder++;
            }
        }
    }
}