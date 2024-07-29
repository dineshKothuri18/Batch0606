import java.util.ArrayList;

public class Account {
    String nameoftheAccountHolder;
    ArrayList<Account_Type>accountsTypes;
    String accountBalance;

    public void AccountDetails(){
        System.out.println("Account Holder Name : "+nameoftheAccountHolder);
        System.out.println("Account Balance : "+accountBalance);
//        System.out.println("Account Type :"+accountsTypes);
        for(Account_Type accountType:accountsTypes){
            accountType.AccountTypeDetails();
        }
        System.out.println("                                          ");
    }
}

