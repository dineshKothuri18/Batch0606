import java.util.ArrayList;
import java.util.HashMap;

public class Hashmaps{
    public static void main(String[] args){
        HashMap<String,String>s1 = new HashMap<>();
        s1.put("name:","ABD");
        s1.put("phone:","123456789");
        s1.put("java:","24");
        s1.put("sql:","30");
        s1.put("js:","26");
        s1.put("roll:","18");
        s1.put("email:","abd.rsacrickeet@email.com");
        HashMap<String,String>s2 = new HashMap<>();
        s2.put("name:","Bairstow");
        s2.put("phone:","123456789");
        s2.put("java:","25");
        s2.put("sql:","31");
        s2.put("js:","26");
        s2.put("roll:","18");
        s2.put("email:","bairstow41.engcrickeet@email.com");
        HashMap<String,String>s3 = new HashMap<>();
        s3.put("name:","Corie Andreson");
        s3.put("phone:","123456789");
        s3.put("java:","24");
        s3.put("sql:","30");
        s3.put("js:","26");
        s3.put("roll:","18");
        s3.put("email:","corie.exnzcrickeet@email.com");
        ArrayList<HashMap<String,String>> studentsdetails =new ArrayList<>();
        studentsdetails.add(s1);
        studentsdetails.add(s2);
        studentsdetails.add(s3);
        System.out.println(studentsdetails);
        for(HashMap<String,String> student : studentsdetails){

            System.out.println("************************************************************");
            System.out.println("Name: " +student.get("name:"));
            System.out.println("phonenumber: " +student.get("phone:"));
            System.out.println("java: " +student.get("java:"));
            System.out.println("sql: "+student.get("sql:"));
            System.out.println("js: " +student.get("js:"));
            System.out.println("roll :"+student.get("roll:"));
            System.out.println("email :"+student.get("email:"));
        }

    }

}