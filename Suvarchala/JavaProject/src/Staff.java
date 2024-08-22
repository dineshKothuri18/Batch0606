import java.util.ArrayList;

public class Staff {
    ArrayList<String> staffusername = new ArrayList<>();
    ArrayList<String> staffpassword = new ArrayList<>();
    ArrayList<String> staffname = new ArrayList<>();
    ArrayList<String> staffempid = new ArrayList<>();
    ArrayList<String> staffage = new ArrayList<>();
    ArrayList<String> staffgender= new ArrayList<>();
    ArrayList<String> staffphoneno = new ArrayList<>();
    ArrayList<String> staffemail = new ArrayList<>();
    ArrayList<String> staffadress = new ArrayList<>();
    ArrayList<String> staffexperience = new ArrayList<>();
    ArrayList<String> staffsalary = new ArrayList<>();
    ArrayList<String> staffadhno = new ArrayList<>();
    ArrayList<String> staffleaves = new ArrayList<>();

    Allbranch bb;

    public Staff(Allbranch bb) {
        this.bb = bb;
    }

    public void checkLogin() {
        staffusername.add("suvarchala");
        staffpassword.add("suvarchala99");
        staffempid.add("20FE1A0486");
        staffage.add("15");
        staffgender.add("female");
        staffadress.add("kphb\nhyderabad");
        staffemail.add("suvarchala99@gmail.com");
        staffname.add("suvarchala");
        staffphoneno.add("6301605214");
        staffadhno.add("6301605214");
        staffexperience.add("4-years");
        staffsalary.add("3,00,000");
        staffleaves.add("14-days");


        staffusername.add("deepa");
        staffpassword.add("deepa99");
        staffempid.add("20FE1A0487");
        staffage.add("15");
        staffgender.add("female");
        staffadress.add("kphb\nhyderabad");
        staffemail.add("deepa99@gmail.com");
        staffname.add("deepa");
        staffphoneno.add("6301605214");
        staffadhno.add("6301605214");
        staffexperience.add("4-years");
        staffsalary.add("3,00,000");
        staffleaves.add("14-days");

        staffusername.add("sathwika");
        staffpassword.add("sathwika99");
        staffempid.add("20FE1A0486");
        staffage.add("15");
        staffgender.add("female");
        staffadress.add("kphb\nhyderabad");
        staffemail.add("sathwika99@gmail.com");
        staffname.add("suvarchala");
        staffphoneno.add("6301605214");
        staffadhno.add("6301605214");
        staffexperience.add("4-years");
        staffsalary.add("4,00,000");
        staffleaves.add("18-days");

        staffusername.add("akhila");
        staffpassword.add("akhila99");
        staffempid.add("20FE1A0486");
        staffage.add("15");
        staffgender.add("female");
        staffadress.add("kphb\nhyderabad");
        staffemail.add("akhila99@gmail.com");
        staffname.add("akhila");
        staffphoneno.add("6301605214");
        staffadhno.add("6301605214");
        staffexperience.add("4-years");
        staffsalary.add("3,00,000");
        staffleaves.add("19-days");

        String usercheck=bb.getuserna();
        String passcheck=bb.getpassword();

        for (int i = 0; i < staffusername.size(); i++) {
            String staffuser=staffusername.get(i);
            String staffpas=staffpassword.get(i);

            if ((usercheck.equals(staffuser) && passcheck.equals(staffpas)))
            {
                System.out.println("\nLogin successfully\n\n");
                System.out.println("name: "+staffname.get(i)+"\nemployee ID: "+staffempid.get(i)+"\nage: "+staffage.get(i)+"\nphone number: "+staffphoneno.get(i)+"\nemail: "+staffemail.get(i)+"\ngender: "+staffgender.get(i)+"\nAdhar number: "+staffadhno.get(i)+""+"\nexperience: "+staffexperience.get(i)+"\nsalary: "+staffexperience.get(i)+"\nno of leaves: "+staffleaves.get(i));
                break;

            }
            else
            {
                System.out.println("INVALID");
                break;
            }
        }
    }

}