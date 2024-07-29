import java.util.ArrayList;

public class Main_For_Bank {
    public static void main(String[] args){
        System.out.println("Bank Details...........");
        Banks_Work bank = new Banks_Work();
        bank.nameoftheBank = "Union Bank of India";
        bank.headoffice = "Delhi";
        bank.Branch = new ArrayList<>();

        Branch branch1 = new Branch(); //branch1
        branch1.branchname = "Chilakaluripet";
        branch1.IFSCcode = "UBIN459085";
        branch1.address = "Near to Eagle restaurant";

        branch1.staffs = new ArrayList<>();//staff arraylist
        Staff staff1 = new Staff();//staff1 of bracnh1
        staff1.name = "Srinivasu";
        staff1.idnumber = 361844;
        staff1.designation = "Branch Manager";
        staff1.salary = 90000;
        branch1.staffs.add(staff1);

        Staff staff2 = new Staff(); //staff2
        staff2.name = "Ramu";
        staff2.idnumber = 487233;
        staff2.designation = "Lone Officer";
        staff2.salary = 75000;
        branch1.staffs.add(staff2);

        Staff staff3 = new Staff();//staff3
        staff3.name = "Phani";
        staff3.idnumber= 322900;
        staff3.designation = "Lone Processor";
        staff3.salary = 79000;
        branch1.staffs.add(staff3);

        Staff staff4 = new Staff(); //staff4
        staff4.name = "Vasu";
        staff4.idnumber = 178904;
        staff4.designation = "Assistant Manager";
        staff4.salary = 80000;
        branch1.staffs.add(staff4);
        bank.Branch.add(branch1);

        Branch branch2  =  new Branch(); //branch2
        branch2.branchname = "Narsaropet";
        branch2.IFSCcode = "UBIN476531";
        branch2.address = "Opposite to Eswar College of Engineering";
        branch2.staffs = new ArrayList<>();

        Staff staffn1 = new Staff();//staffn1;
        staffn1.name = "Krishna";
        staffn1.idnumber = 798023;
        staffn1.designation = "Lone Officer";
        staffn1.salary = 65000;
        branch2.staffs.add(staffn1);

        Staff staffn2 = new Staff();//staffn2
        staffn2.name = "Murali";
        staffn2.idnumber=679231;
        staffn2.designation = "Branch Manager";
        staffn2.salary = 89000;
        branch2.staffs.add(staffn2);

        Staff staffn3 = new Staff();//staffn3
        staffn3.name = "Bhavani";
        staffn3.idnumber = 890981;
        staffn3.designation ="Assistant Manager";
        staffn3.salary = 88000;
        branch2.staffs.add(staff3);

        Staff staffn4 = new Staff();//staffn4
        staffn4.name = "Gowtham";
        staffn4.idnumber =231323;
        staffn4.designation ="Lone processor";
        branch2.staffs.add(staffn4);
        bank.Branch.add(branch2);

        bank.ATMs = new ArrayList<>();//atms arraylist
        ATM atm1 = new ATM(); //atm1 details
        atm1.nameofATMCard = "Visa Debit Card";
        atm1.accountnumber = 861348746;
        atm1.pin = "****";
        atm1.enterrequiredmoney = 6500;
        bank.ATMs.add(atm1);

        ATM atm2 = new ATM();//atm2 details
        atm2.nameofATMCard = "Visa Credit Card";
        atm2.accountnumber = 676464512;
        atm2.pin = "****";
        atm2.enterrequiredmoney = 8745;
        bank.ATMs.add(atm2);

        bank.Accounts = new ArrayList<>();
        Account account1 = new Account();//account1 details
        account1.nameoftheAccountHolder = "Sri";
        account1.accountBalance = "50000";

        account1.accountsTypes = new ArrayList<>();
        Account_Type accountType1 = new Account_Type();
        accountType1.Typeofaccount = "Savings Account";
//        accountType1.accountHolderName = "Honey";
        accountType1.accountnumber = 741852948;
        accountType1.IFCScode = "UBIN784898";
        accountType1.mobilenumber ="9876543210";
        accountType1.purpose = "For Saving Money";
        account1.accountsTypes.add(accountType1);
        bank.Accounts.add(account1);

        Account account2 = new Account();//account2 details
        account2.nameoftheAccountHolder = "Divya";
        account2.accountBalance = "700000";
        bank.Accounts.add(account2);
        account2.accountsTypes = new ArrayList<>();

        Account_Type accountType2 = new Account_Type();
        accountType2.Typeofaccount = "Business Account";
//        accountType2.accountHolderName = "Raju";
        accountType2.accountnumber = 589652782;
        accountType2.IFCScode = "UBIN784898";
        accountType2.mobilenumber = "7990862341";
        accountType2.purpose = "Business Funds Saving";
        account2.accountsTypes.add(accountType2);
        bank.Accounts.add(account2);

        System.out.println("Salary of " + bank.Branch.get(1).staffs.get(0).name + ": " + bank.Branch.get(1).staffs.get(0).salary);
        System.out.println("I want to know the type of account : "+bank.Accounts.get(0).accountsTypes.get(0).Typeofaccount);
        System.out.println("Names of the Card : "+bank.ATMs.get(0).nameofATMCard);
        System.out.println("Name of the Bank there in Branch 1 : "+bank.Branch.get(0).branchname);

        bank.bankDetails();
    }
}

