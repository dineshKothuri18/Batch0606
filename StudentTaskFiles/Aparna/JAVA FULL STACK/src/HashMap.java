import java.util.*;
public class HashMap {
    public static ArrayList<HashMap<Integer,String>> arr=new ArrayList<>();
    public static HashMap<Integer,String> name=new HashMap<>();
    public static HashMap<Integer,String> rollno=new HashMap<>();
    public static HashMap<Integer,String> phoneno=new HashMap<>();
    public static HashMap<Integer,String> emailid=new HashMap<>();
    public static HashMap<Integer,String> javamarks=new HashMap<>();
    public static HashMap<Integer,String> htmlmarks=new HashMap<>();
    public static HashMap<Integer,String> cssmarks=new HashMap<>();
    public static HashMap<Integer,String> sqlmarks=new HashMap<>();
    public static void main(String[] args){

        studentdetails(1,"suvarchala","20KE1A1234","6306301616","lakshmisuvarchala99@gmail.com","99","98","99","98");
        studentdetails(2,"siva","20KE1A1123","6306301613","sivasiva99@gmail.com","97","97","99","98");
        studentdetails(3,"sai kiran","20KE1A4488","6306301614","saikiransai99@gmail.com","95","98","97","99");
        studentdetails(4,"akhila","20KE1A3489","6306301615","akhilaakhila99@gmail.com","99","98","99","98");
        studentdetails(5,"deepa","20KE1A0490","6306301666","deepadeepa99@gmail.com","99","98","99","98");
        studentdetails(6,"sathiwika","20FE1A0491","6306301677","sathiwika1299@gmail.com","97","97","99","98");
        studentdetails(7,"sumanth","20FE1A0492","6306301699","sumanthsumanth99@gmail.com","99","98","99","98");
        studentdetails(8,"rahul","20FE1A0493","6306301688","rahulrahuul99@gmail.com","99","98","99","98");
        studentdetails(9,"sai kumar","20FE1A0494","6306601616","saikumarkumarr99@gmail.com","99","98","99","98");
        studentdetails(10,"raghu","20FE1A0495","6304401616","raghuraghuu99@gmail.com","99","98","99","98");
        studentdetails(11,"kavya","20FE1A0496","6305501616","kavyakavyaa99@gmail.com","99","98","99","98");
        studentdetails(12,"vijaya","20FE1A0497","6322301616","vijayaaaa99@gmail.com","99","98","99","98");
        studentdetails(13,"aparna","20FE1A0498","6321301616","aparanaaaa99@gmail.com","99","98","99","98");
        studentdetails(14,"chaitanya1","20FE1A0499","7306301616","chaitanyaahj99@gmail.com","99","98","99","98");
        studentdetails(15,"chaitanya2","20FE1A04A0","9306301616","chaichaii99@gmail.com","99","98","99","98");
        studentdetails(16,"hemanth","20FE1A04A1","9876301616","hemanthhemanth99@gmail.com","99","98","99","98");
        studentdetails(17,"sai charan","20FE1A04A2","6606301616","saicharansai99@gmail.com","99","98","99","98");
        studentdetails(18,"ramana","20FE1A04A3","6506301616","ramanaaa99@gmail.com","99","98","99","98");
        studentdetails(19,"karishma","20FE1A04A4","6406301616","karishmaaa99@gmail.com","99","98","99","98");

        arr.add(name);
        arr.add(rollno);
        arr.add(phoneno);
        arr.add(emailid);
        arr.add(javamarks);
        arr.add(htmlmarks);
        arr.add(cssmarks);
        arr.add(sqlmarks);

        for (Integer keyy : name.keySet()) {
            System.out.println("*");
            System.out.println("Student number: " + keyy);
            System.out.println("Name: " + name.get(keyy));
            System.out.println("Roll No: " + rollno.get(keyy));
            System.out.println("Phone No: " + phoneno.get(keyy));
            System.out.println("Email ID: " + emailid.get(keyy));
            System.out.println("Java Marks: " + javamarks.get(keyy));
            System.out.println("HTML Marks: " + htmlmarks.get(keyy));
            System.out.println("CSS Marks: " + cssmarks.get(keyy));
            System.out.println("SQL Marks: " + sqlmarks.get(keyy));
            System.out.println("*");
            System.out.println();
        }



    }
    public static void studentdetails(int no,String name1,String rollno1,String phoneno1,String emailid1,String javamarks1,String htmlmarks1,String cssmarks1,String sqlmarks1){
        name.put(no,name1);
        rollno.put(no,rollno1);
        phoneno.put(no,phoneno1);
        emailid.put(no,emailid1);
        javamarks.put(no,javamarks1);
        htmlmarks.put(no,htmlmarks1);
        cssmarks.put(no,cssmarks1);
        sqlmarks.put(no,sqlmarks1);

    }
}