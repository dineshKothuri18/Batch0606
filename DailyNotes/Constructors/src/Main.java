// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Sai","Mohit",10,'M',"sai.mohit@gmail.com");
        System.out.println(person1.email);


        Person p2 = new Person("Akhila","D",12,'F');
        p2.email = "akhila@gmail.com";
    }
}