import java.util.ArrayList;
import java.util.Scanner;

public class Mainclasss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Staffnew> staffDetails = new ArrayList<>();
        ArrayList<Accountholder> customerDetails = new ArrayList<>();
        ArrayList<String> bank=new ArrayList<>();
        bank.add("SBI");
        bank.add("union");
        bank.add("ICICI");
        ArrayList<String> branch=new ArrayList<>();
        branch.add("ameerpet");
        branch.add("Kphb");
        branch.add("Jntu");
        branch.add("Gachibowli");
        branch.add("Shamshabad");
        branch.add("Hi-Tech City");
        branch.add("Habsiguda");
        branch.add("Jubilee Hills");
        branch.add("Secunderabad");
        boolean flag = true;
        String branchh;
        String searchempname;
        String searchcustname;
        while(flag) {
            System.out.println("1.create staff\n2.create accountholder\n3.view all employees\n4.view all account Holders\n5.All managers details\n6.exit");
            System.out.print("enter your option: ");
            int option = sc.nextInt();
            System.out.println("select the branch name");
            System.out.println("1.SBI\n2.union\n3.ICICI");
            int bankselection = sc.nextInt();
            if(option>=1 && option<=4) {
                if (bankselection == 1) {
                    System.out.println("1.ameerpet\n2.Kphb\n3.Jntu");
                } else if (bankselection == 2) {
                    System.out.println("1.Gachibowli\n2.Shamshabad\n3.Hi-Tech City");
                } else {
                    System.out.println("1.Habsiguda\n2.Jubilee Hills\n3.Secunderabad");
                }

            }
            switch(option)
            {
                case 1:
                    System.out.println("select your branch: ");
                    int branchselection = sc.nextInt();
                        if (bankselection == 1) {
                                branchh = branch.get(branchselection-1);
                                System.out.println(branchh);
                                Staffnew staffAccountsbi = new Staffnew("sbi", branchh, "", "", "", 0,0);
                                staffAccountsbi.staf();
                                staffDetails.add(staffAccountsbi);
                        } else if (bankselection == 2) {
                                branchh = branch.get(branchselection+2);
                                System.out.println(branchh);
                                Staffnew staffAccountsbi = new Staffnew("union", branchh, "", "", "", 0,0);
                                staffAccountsbi.staf();
                                staffDetails.add(staffAccountsbi);
                        } else {
                                branchh = branch.get(branchselection+5);
                                System.out.println(branchh);
                                Staffnew staffAccountsbi = new Staffnew("icici", branchh, "", "", "", 0,0);
                                staffAccountsbi.staf();
                                staffDetails.add(staffAccountsbi);
                    }
                    break;
                case 2:
                    System.out.println("select your branch: ");
                    int branchselection1 = sc.nextInt();
                        if (bankselection == 1) {
                                branchh = branch.get(branchselection1-1);
                                Accountholder customerAccountsbi = new Accountholder("sbi", branchh, "", "", "", 0,"","","","",0);
                                customerAccountsbi.customer();
                                customerDetails.add(customerAccountsbi);
                        } else if (bankselection == 2) {
                                branchh = branch.get(branchselection1+2);
                                Accountholder customerAccountsbi = new Accountholder("union", branchh, "", "", "", 0,"","","","",0);
                                customerAccountsbi.customer();
                                customerDetails.add(customerAccountsbi);
                        } else if(bankselection==3){
                                branchh = branch.get(branchselection1-1);
                                Accountholder customerAccountsbi = new Accountholder("icici", branchh, "", "", "", 0,"","","","",0);
                                customerAccountsbi.customer();
                                customerDetails.add(customerAccountsbi);
                        }
                    break;
                case 3:
                    System.out.println("select your branch: ");
                    int branchselection2 = sc.nextInt();
                            for (Staffnew staff : staffDetails) {
                                System.out.println(" employee Name: " + staff.employeename);
                                System.out.println("employeeid: " +staff.count);
                                System.out.println("employee Desigantion:" + staff.Designation);
                                System.out.println("employee Salary:" + staff.Salary);
                                System.out.println("name of the bank: " + staff.bankname);
                                System.out.println("name of the branch:" + staff.branchname);
                            }
                case 4:
                    System.out.println("select your branch: ");
                    int branchselection3 = sc.nextInt();
                    for(Accountholder custt:customerDetails) {
                        String accountnumberstart="20fe1a0";
                        System.out.println("Customer Name: " + custt.customername);
                        System.out.println("phonenumber:" + custt.phonenumber);
                        System.out.println("age:" + custt.age);
                        System.out.println("gender " + custt.gender);
                        System.out.println("emailid" + custt.emailid);
                        System.out.println("pancard number" + custt.pancard);
                        System.out.println("adharcard number" + custt.adharcardnumber);
                        System.out.println("address" + custt.address);
                        System.out.println("name of the bank:" + custt.bank);
                        System.out.println("account number:"+accountnumberstart+custt.count);
                    }
                case 5:
                    for (Staffnew staff : staffDetails) {
                        String manager=staff.Designation;
                        if(manager.equals("manager")){
                        System.out.println(" employee Name: " + staff.employeename);
                        System.out.println("employeeid: " + staff.count);
                        System.out.println("employee Desigantion:" + staff.Designation);
                        System.out.println("employee Salary:" + staff.Salary);
                        System.out.println("name of the bank: " + staff.bankname);
                        System.out.println("name of the branch:" + staff.branchname);
                        }
                    }

                case 6:
                    flag = false;
                    break;
            }
        }
    }
}




