public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.bankName = "HDFC";
        bank.branchCount = 1;

        Branches branch1 = new Branches();
        branch1.branchName = "kphp HDFC bank";
        branch1.address = "kphp Hyderabad";
        branch1.ifscCode = "wydb46hj";
        branch1.totalNoOfEmployes = 4;

        AccountHolder accHolder1 = new AccountHolder();
        accHolder1.name = "sai charan";
        accHolder1.age = 60;
        accHolder1.accountType = "Savings account";
        accHolder1.balance = 0.098765;

        AccountHolder accHolder2 = new AccountHolder();
        accHolder2.name = "sai ";
        accHolder2.age = 40;
        accHolder2.accountType = "Current account";
        accHolder2.balance = 98765;

        AccountHolder accHolder3 = new AccountHolder();
        accHolder3.name = "charan ";
        accHolder3.age = 70;
        accHolder3.accountType = "Savings account";
        accHolder3.balance = 765;

        Staff staff1 = new Staff();
        staff1.id = 1;
        staff1.nameOfEmploye = "raj";
        staff1.designation = "Manager";
        staff1.salary = 800000;

        Staff staff2 = new Staff();
        staff2.id = 11;
        staff2.nameOfEmploye = "Sham";
        staff2.designation = "Assistant manager";
        staff2.salary = 600000;

        Staff staff3 = new Staff();
        staff3.id = 111;
        staff3.nameOfEmploye = "chaitu";
        staff3.designation = "System operator";
        staff3.salary = 300000;

        Staff staff4 = new Staff();
        staff4.id = 1111;
        staff4.nameOfEmploye = "Ravi";
        staff4.designation = "Clerk";
        staff4.salary = 200000;

        branch1.staff.add(staff1);
        branch1.staff.add(staff2);
        branch1.staff.add(staff3);
        branch1.staff.add(staff4);

        branch1.AccountHolders.add(accHolder1);
        branch1.AccountHolders.add(accHolder2);
        branch1.AccountHolders.add(accHolder3);

        Branches branch2 = new Branches();
        branch2.branchName = "JNTU HDFC bank";
        branch2.address = "NEAR JNTU Hyderabad";
        branch2.ifscCode = "sdfgh46hj";
        branch2.totalNoOfEmployes = 4;

        AccountHolder accHolder21 = new AccountHolder();
        accHolder21.name = "sai charan bokada";
        accHolder21.age = 60;
        accHolder21.accountType = "Savings account";
        accHolder21.balance = 0.098765;

        AccountHolder accHolder22 = new AccountHolder();
        accHolder22.name = "sai ";
        accHolder22.age = 40;
        accHolder22.accountType = "Current account";
        accHolder22.balance = 98765;

        AccountHolder accHolder23 = new AccountHolder();
        accHolder23.name = "charan ";
        accHolder23.age = 70;
        accHolder23.accountType = "Savings account";
        accHolder23.balance = 765;

        Staff staff21 = new Staff();
        staff21.id = 2;
        staff21.nameOfEmploye = "Manoj";
        staff21.designation = "Manager";
        staff21.salary = 600000;

        Staff staff22 = new Staff();
        staff22.id = 22;
        staff22.nameOfEmploye = "Krishna";
        staff22.designation = "Assistant manager";
        staff22.salary = 400000;

        Staff staff23 = new Staff();
        staff23.id = 222;
        staff23.nameOfEmploye = "chaitu";
        staff23.designation = "System operator";
        staff23.salary = 300000;

        Staff staff24 = new Staff();
        staff24.id = 2222;
        staff24.nameOfEmploye = "Ramu";
        staff24.designation = "Clerk";
        staff24.salary = 200000;

        branch2.staff.add(staff21);
        branch2.staff.add(staff22);
        branch2.staff.add(staff23);
        branch2.staff.add(staff24);

        branch2.AccountHolders.add(accHolder21);
        branch2.AccountHolders.add(accHolder22);
        branch2.AccountHolders.add(accHolder23);

        Atm atm1 = new Atm();
        atm1.atmAddress = "kphp";
        atm1.nearBranch = "kphp branch";
        atm1.openTime = "05:00 AM";
        atm1.closeTime = "11:00 PM";

        Atm atm2 = new Atm();
        atm2.atmAddress = "JNTU";
        atm2.nearBranch = " JNTU branch";
        atm2.openTime = "04:00 AM";
        atm2.closeTime = "12:00 AM";

        bank.atm.add(atm1);
        bank.atm.add(atm2);
        System.out.println("                                            ");
        System.out.println("Name of the bank is " + " " + bank.bankName);
       // System.out.println("                                            ");
        for (Branches branch : bank.branches) {
            System.out.println(" Branchname :" + " " + branch.branchName);
            System.out.println("Branch IFSC code :" + " " + branch.ifscCode);
            System.out.println("Branch Address: " + " " + branch.address);
            System.out.println("Branches employeees: " + " " + branch.totalNoOfEmployes);
            System.out.println("    " + " Staff:");
        }
        System.out.println("                                                     ");
        System.out.println("               Staff details of branch1");
        for (Staff staff : branch1.staff) {
            System.out.println("Staff{" +
                    "" +
                    "id=" + staff.id +
                    ", nameOfEmployee='" + staff.nameOfEmploye + '\'' +
                    ", designation='" + staff.designation + '\'' +
                    ", salary=" + staff.salary +
                    '}');
        }
        System.out.println("                                                            ");
        System.out.println("       Account holders details of branch1 ");
        int accountHolder = 1;
        for (AccountHolder AccountHolders : branch1.AccountHolders) {
            System.out.println("Name:" + " " + AccountHolders.name + " ," + " Age: " + " " + AccountHolders.age + " ," + " Account type:" + " " + AccountHolders.accountType + " ," + " Balance:" + " " + accHolder1.balance);
            accountHolder ++;
        }
        System.out.println("                                                       ");
        //System.out.println(bank.atm.get(0));
//        for (Atm atm : bank.atm) {
         System.out.println("Atm{" + "" +
                    "ATM address-" +atm1.atmAddress +
                    " ,near branch-" + atm1.nearBranch + '\'' +
                    ",ATM opening time-" + atm1.openTime + '\'' +
                    ",ATM closing time-" + atm1.closeTime +
                   '}');

      System.out.println("                                                             ");
            System.out.println("**********************************************************");

            System.out.println("Name of the bank is:" + " " + bank.bankName);
            for (Branches branch12 : bank.branches) {
                System.out.println(" Branchname :" + " " + branch12.branchName);
                System.out.println("Branch IFSC code:" + " " + branch12.ifscCode);
                System.out.println("Branch Address: " + " " + branch12.address);
                System.out.println("Branches employees: " + " " + branch12.totalNoOfEmployes);
                System.out.println("    " + " Staff:");
            }
        System.out.println("                                                       ");
        System.out.println("                  Staff details of branch2");
            for (Staff staff : branch2.staff) {
                System.out.println("Staff{" +
                        "id=" + staff.id +
                        ", nameOfEmployee='" + staff.nameOfEmploye + '\'' +
                        ", designation='" + staff.designation + '\'' +
                        ", salary=" + staff.salary +
                        '}');
            }
        System.out.println("                                                           ");
        System.out.println("           Account holders details of branch2 ");
        int accountHolders = 1;
        for (AccountHolder AccountHolders : branch2.AccountHolders) {
            System.out.println("Name:" + " " + AccountHolders.name + " ," + " Age: " + " " + AccountHolders.age + " ," + " Account type:" + " " + AccountHolders.accountType + " ," + " Balance:" + " " + accHolder1.balance);
            accountHolders ++;
        }
        System.out.println("                                                           ");
        System.out.println("Atm{" + "" +
                "ATM address-" +atm2.atmAddress +
                " ,near branch-" + atm2.nearBranch + '\'' +
                ",ATM opening time-" + atm2.openTime + '\'' +
                ",ATM closing time-" + atm2.closeTime +
                '}');

        }
    }
