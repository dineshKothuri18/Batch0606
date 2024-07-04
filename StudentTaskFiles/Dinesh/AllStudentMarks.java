import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private String name;
    private Map<String, Integer> marks;

    public Student(String name, Map<String, Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public double getAverageMarks() {
        int total = 0;
        for (int mark : marks.values()) {
            total += mark;
        }
        return total / (double) marks.size();
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Adding students to the list
        students.add(new Student("Narasimha A", createMarks(85, 78, 88, 92, 80, 76, 81, 79, 84)));
        students.add(new Student("Hemanth Ch", createMarks(90, 82, 86, 89, 84, 77, 83, 78, 85)));
        students.add(new Student("Sumanth M", createMarks(75, 80, 79, 85, 88, 82, 77, 80, 79)));
        students.add(new Student("Mohith Sai K", createMarks(82, 77, 83, 87, 81, 78, 80, 85, 82)));
        students.add(new Student("Vijaya Lakshmi P", createMarks(88, 84, 85, 90, 89, 81, 82, 87, 86)));
        students.add(new Student("Kavya Sri K", createMarks(79, 75, 80, 82, 83, 79, 78, 81, 80)));
        students.add(new Student("Akhila D", createMarks(84, 79, 82, 85, 86, 80, 79, 83, 81)));
        students.add(new Student("Sai Charan P", createMarks(76, 81, 77, 84, 80, 82, 78, 79, 80)));
        students.add(new Student("Sathvika A", createMarks(89, 85, 87, 90, 84, 88, 83, 86, 87)));
        students.add(new Student("Karishma Md", createMarks(77, 80, 78, 83, 81, 79, 76, 80, 78)));
        students.add(new Student("Aparna K", createMarks(83, 79, 82, 88, 80, 85, 81, 84, 83)));
        students.add(new Student("Lakshmi Chaitanya L", createMarks(85, 81, 84, 89, 82, 86, 83, 87, 85)));
        students.add(new Student("Rahul R", createMarks(78, 76, 79, 81, 80, 77, 76, 78, 79)));
        students.add(new Student("Saikumar J", createMarks(80, 82, 81, 83, 84, 80, 79, 82, 81)));

        // Print student details
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Marks: " + student.getMarks());
            System.out.println("Average Marks: " + student.getAverageMarks());
            System.out.println();
        }
    }

    private static Map<String, Integer> createMarks(int computers, int drawing, int m1, int m2, int m3, int m4, int physics, int chemistry, int english) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("computers", computers);
        marks.put("drawing", drawing);
        marks.put("m1", m1);
        marks.put("m2", m2);
        marks.put("m3", m3);
        marks.put("m4", m4);
        marks.put("physics", physics);
        marks.put("chemistry", chemistry);
        marks.put("english", english);
        return marks;
    }
}
