import java.util.InputMismatchException;

public class Person {

    public String name;
    private int age;
    private String aadhar;

    private String phone;

    Person(String name, int age, String aadhar){
        this.name = name;
        this.setAge(age);
        this.aadhar = aadhar;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAge(int age){
        if(age > 0) {
            this.age = age;
        }else {
            throw new InputMismatchException("Invalid Input");
        }
    }
    public int getAge(){
        return  this.age;
    }

    public String getPhone() {
        return "91 " + phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
