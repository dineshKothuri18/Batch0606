public class Account_Type {
    String Typeofaccount;
    long accountnumber;
    String purpose;
    String mobilenumber;
    String  accountHolderName;
    String IFCScode;

    public void AccountTypeDetails(){
        System.out.println("Account Type : "+Typeofaccount);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountnumber);
        System.out.println("IFSC Code: " + IFCScode);
        System.out.println("Mobile Number: " + mobilenumber);
        System.out.println("Purpose: " + purpose);
        System.out.println("                             ");
    }


}

