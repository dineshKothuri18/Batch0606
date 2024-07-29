import java.util.ArrayList;

public class Banks_Work {
    String nameoftheBank;
    String headoffice;
    ArrayList<Branch>Branch;
    ArrayList<ATM>ATMs;
    ArrayList<Account>Accounts;

    public void bankDetails(){
        System.out.println("Bank Name : "+nameoftheBank);
        System.out.println("Head Office : "+headoffice);
        System.out.println("                         ");

        System.out.println("\nBranches : ");
        for(Branch branch:Branch){
            branch.branchDetails();
        }
        System.out.println("                            ");
        System.out.println("ATMs:");
        for(ATM atm :ATMs){
            atm.AtmDetails();
        }
        System.out.println("                               ");
        System.out.println("Accounts :");
        for(Account account:Accounts){
            account.AccountDetails();
        }
        System.out.println("                               ");
    }

}

