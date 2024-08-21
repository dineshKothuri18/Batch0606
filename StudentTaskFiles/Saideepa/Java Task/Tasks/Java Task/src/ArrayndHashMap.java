import java.util.ArrayList;
import java.util.HashMap;

public class ArrayndHashMap {
    public static ArrayList<HashMap<String, String>>students = new ArrayList<>();
    public static void main(String[] args){
        addStudent(1,"Saideepa","19JE1A0468","9876543210","kandrusaideepa9@gmail.com","90","80","70","70");
        addStudent(2,"Suvarchala","19je1a0458","9876543210","suvarchala@gmail.com","98","97","96","95");
        addStudent(3,"siva","19je1a0423","9876543210","siva@gmail.com","91","92","93","94");
        addStudent(4,"saikiran","19je1a0478","908756123","saikiran@gmail.com","90","89","88","87");
        addStudent(5,"Akhila","19je1a0401","908657321","akhila@gmail.com","92","80","81","84");
        addStudent(6,"sathvika","19je1a0488","708956123","sathvika@gmail.com","80","84","81","86");
        addStudent(7,"sumanth","19je1a0489","807965231","sumanth@gmail.com","91","92","93","94");
        addStudent(8,"rahul","19je1a0421","9780564132","rahul@gmail.com","98","97","96","95");
        addStudent(9,"saikumar","19je1a0477","809756123","saikumar@gmail.com","97","96","95","94");
        addStudent(10,"raghu","19je1a0499","7891334052","raghu@gmail.com","90","89","88","87");
        addStudent(11,"kavya","19je1a0454","9780641532","kavya@gmail.com","92","87","89","90");
        addStudent(12,"vijaya","19je1a0455","9780462315","vijaya@gmail.com","92","87","89","90");
        addStudent(13,"aparna","19je1a0467","7983015677","aparna@gmail.com","89","88","87","86");
        addStudent(14,"chaitanya","19je1a0460","7809641532","chaitayna@gmail.com","88","89","86","87");
        addStudent(15,"chaitanya.k","19je1a0479","7998033312","chaitayank@gmail.com","90","90","89","90");
        addStudent(16,"hemanth","19je1a0456","7512389754","hemanth@gmail.com","92","87","89","90");
        addStudent(17,"venkat ramana","19je1a0487","9778809541","ramana@gmail.com","91","92","93","94");
        addStudent(18,"saicharan","19je1a0440","9751096532","saicharan@gmail.com","90","87","89","91");
        addStudent(19,"mohit sai","19je1a0459","7998654532","mohitsai@gmail.com","91","87","90","95");
        addStudent(20,"vamsi","19je1a0451","9660531532","vamsi@gmail.com","91","78","85","92");

        for (HashMap<String, String> student : students){
            System.out.println("Student number : "+student.get("id"));
            System.out.println("Name : "+student.get("name"));
            System.out.println("Roll Number : "+student.get("number"));
            System.out.println("Phone Number : "+student.get("phono"));
            System.out.println("Email ID : "+student.get("mailid"));
            System.out.println("Java Marks : "+student.get("javamarks"));
            System.out.println("HTML Marks : "+student.get("htmlmarks"));
            System.out.println("SQL Marks : "+student.get("sqlmarks"));
            System.out.println("Java Script Marks : "+student.get("jsmarks"));
            System.out.println("******************************************************************");

        }
    }
    public static void addStudent(int id,String name,String number,String phono,String mailid,String javamarks,String htmlmarks,String sqlmarks,String jsmarks){
        HashMap<String, String> student = new HashMap<>();
        student.put("id", String.valueOf(id));
        student.put("name", name);
        student.put("number", number);
        student.put("phono", phono);
        student.put("mailid", mailid);
        student.put("javamarks", javamarks);
        student.put("htmlmarks", htmlmarks);
        student.put("sqlmarks", sqlmarks);
        student.put("jsmarks", jsmarks);
        students.add(student);

    }
}

