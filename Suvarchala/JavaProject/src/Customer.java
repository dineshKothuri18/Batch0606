import java.util.ArrayList;

public class Customer {
    ArrayList<String> custname = new ArrayList<>();
    ArrayList<String> accountnum = new ArrayList<>();

    ArrayList<String> fathername = new ArrayList<>();
    ArrayList<String> totalbalance = new ArrayList<>();
    ArrayList<String> accifsccode = new ArrayList<>();
    ArrayList<String> custage = new ArrayList<>();
    ArrayList<String> custgender = new ArrayList<>();
    ArrayList<String> custphoneno = new ArrayList<>();
    ArrayList<String> custemail = new ArrayList<>();
    ArrayList<String> custadress = new ArrayList<>();

    ArrayList<String> custadhno = new ArrayList<>();
    ArrayList<String> custtrans = new ArrayList<>();

    Allbranch bb1;


    public Customer(Allbranch bb1) {
        this.bb1 = bb1;
    }

    public void checkcust() {
        custname.add("sri");
        accountnum.add("9999999999");
        fathername.add("vasu");
        totalbalance.add("1");
        accifsccode.add("SBI0022");
        custage.add("12");
        custgender.add("Female");
        custphoneno.add("6301605214");
        custemail.add("sri99@gmail.com");
        custadress.add("kphb\nhyderabad");
        custadhno.add("2233322333");

        custname.add("siva");
        accountnum.add("9999999999");
        fathername.add("srinivas");
        totalbalance.add("2");
        accifsccode.add("SBI0023");
        custage.add("16");
        custgender.add("male");
        custphoneno.add("6301605214");
        custemail.add("siva99@gmail.com");
        custadress.add("kphb\nhyderabad");
        custadhno.add("2233322333");

        custname.add("sai");
        accountnum.add("9999999999");
        fathername.add("venkat");
        totalbalance.add("3");
        accifsccode.add("SBI0022");
        custage.add("25");
        custgender.add("male");
        custphoneno.add("6301605214");
        custemail.add("sai99@gmail.com");
        custadress.add("kphb\nhyderabad");
        custadhno.add("2233322333");






        String cuscheck = bb1.getcustname();
        String acccheck = bb1.getAccountnum();

        for (int i = 0; i < custname.size(); i++) {
            String cusdet = custname.get(i);
            String acccdet = accountnum.get(i);

            if ((cuscheck.equals(cusdet) && acccheck.equals(acccdet))) {
                System.out.println("\n\n");
                System.out.println("name: " + custname.get(i) + "\nacount number : " + accountnum.get(i) + "\nFather name: " + fathername.get(i) + "\ntotal balance: " + totalbalance.get(i) + "\naccount ifsc code:: " + accifsccode.get(i) + "\nage: " + custage.get(i) + "\ngender: " + custgender.get(i) + "" +
                        "\nphone number: " + custphoneno.get(i) + "\nEmail: " + custemail.get(i) + "\nAddress: " + custadress.get(i) + "\ncustomer adhar number: " + custadhno.get(i));
                break;

            } else {
                System.out.println("INVALID");
                break;
            }
        }
    }
}
