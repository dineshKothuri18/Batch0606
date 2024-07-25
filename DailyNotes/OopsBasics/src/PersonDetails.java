public class PersonDetails {
    public String fName;
    public String lName;
    public int age;
    public String address;
    public char gender;
    public String email;

    public void getFullName(){
        System.out.println(this.fName +  " " + this.lName);
    }

    public void getNameCount(){
        int count = this.fName.length() + this.lName.length();
        System.out.println("Total Length " + count);
    }
}
