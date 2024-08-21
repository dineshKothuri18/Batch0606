public class Person {

    String fName;
    String lName;
    int age;
    char gender;

    String email;


    Person(String fName,String lName,int age, char gender,String email){

        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    Person(String fName,String lName,int age, char gender){

        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    }

    public void printPersonDetails(){
        System.out.println(this.fName);
        System.out.println(this.fName);
    }
}
