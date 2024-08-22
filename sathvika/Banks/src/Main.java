import java.util.ArrayList;
import java.util.Scanner;

    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            ArrayList<Staffnew> staffDetails = new ArrayList<>();
            ArrayList<Accountholder> customerDetails = new ArrayList<>();

            ArrayList<String> branch=new ArrayList<>();
            branch.add("madhapur");
            branch.add("balanagar");
            branch.add("Jntu");
            branch.add("Gachibowli");
            branch.add("chandanagar");
            branch.add("Hi-Tech City");
            branch.add("kondapur");
            branch.add("Jubilee Hills");
            branch.add("Secunderabad");
            boolean flag = true;
            String branchh;
            while(flag) {

                System.out.println("1.create staff\n2.create accountholder\n3.view all employees\n4.view all account Holders\n5.exit");
                System.out.print("enter your option: ");
                int option = sc.nextInt();
                System.out.println("select the branch name");
                System.out.println("1.SBI\n2.union\n3.ICICI");
                int bankselection = sc.nextInt();
                if(bankselection==1){
                    System.out.println("1.madhapur\n2.balanagar\n3.Jntu");
                } else if (bankselection==2) {
                    System.out.println("1.Gachibowli\n2.chandanagar\n3.Hi-Tech City");
                }
                else{
                    System.out.println("1.kondapur\n2.Jubilee Hills\n3.Secunderabad");
                }
                System.out.println("select your branch: ");
                int branchselection=sc.nextInt();
                switch(option)
                {
                    case 1:
                        if (bankselection == 1) {
                            branchh = branch.get(branchselection-1);
                            System.out.println(branchh);
                            Staffnew staffAccountsbi = new Staffnew("sbi", branchh, "", "", "", 0);
                            staffAccountsbi.staf();
                            staffDetails.add(staffAccountsbi);

                        } else if (bankselection == 2) {
                            branchh = branch.get(branchselection+2);
                            System.out.println(branchh);
                            Staffnew staffAccountsbi = new Staffnew("union", branchh, "", "", "", 0);
                            staffAccountsbi.staf();
                            staffDetails.add(staffAccountsbi);


                        } else {
                            branchh = branch.get(branchselection+5);
                            System.out.println(branchh);
                            Staffnew staffAccountsbi = new Staffnew("icici", branchh, "", "", "", 0);
                            staffAccountsbi.staf();
                            staffDetails.add(staffAccountsbi);


                        }
                        break;
                    case 2:

                        if (bankselection == 1) {

                            branchh = branch.get(branchselection-1);
                            Accountholder customerAccountsbi = new Accountholder("sbi", branchh, "", "", "", 0,"","","","");
                            customerAccountsbi.customer();
                            customerDetails.add(customerAccountsbi);

                        } else if (bankselection == 2) {

                            branchh = branch.get(branchselection+2);
                            Accountholder customerAccountsbi = new Accountholder("union", branchh, "", "", "", 0,"","","","");
                            customerAccountsbi.customer();
                            customerDetails.add(customerAccountsbi);

                        } else if(bankselection==3){
                            branchh = branch.get(branchselection-1);
                            Accountholder customerAccountsbi = new Accountholder("icici", branchh, "", "", "", 0,"","","","");
                            customerAccountsbi.customer();
                            customerDetails.add(customerAccountsbi);

                        }

                        break;
                    case 3:
                        for(Staffnew staff: staffDetails){
                            System.out.println("employee Name: "+staff.name);
                            System.out.println("employeeid"+staff.employeeid);
                            System.out.println("employee Desigantion"+staff.Designation);
                            System.out.println("employee Salary:"+staff.Salary);

                        }
                    case 4:
                        for(Accountholder cust:customerDetails){
                            System.out.println(" Customer Name: "+cust.name);
                            System.out.println("phonenumber:"+cust.phonenumber);
                            System.out.println("age:"+cust.age);
                            System.out.println("gender "+cust.gender);
                            System.out.println("emailid"+cust.emailid);
                            System.out.println("pancard number"+cust.pancard);
                            System.out.println("adharcard number"+cust.adharcardnumber);
                            System.out.println("address"+cust.address);
                        }
                    case 5:
                        flag=false;
                        break;

                }
            }
        }
    }
