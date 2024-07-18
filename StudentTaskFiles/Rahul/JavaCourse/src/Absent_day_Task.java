import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Absent_day_Task {
    public static void main(String []args){
        HashMap<String, String> Rahul = new HashMap<>(); // 1
        Rahul.put("Name", "Rahul");
        Rahul.put("Mail", "rahul@gmail.com");
        Rahul.put("Java Marks", "98");
        Rahul.put("SQL Marks", "99");
        Rahul.put("HTML Marks", "96");
        Rahul.put("JS Marks", "97");

        HashMap<String, String> Saikumar = new HashMap<>(); // 2
        Saikumar.put("Name", "Saikumar");
        Saikumar.put("Mail", "saikumar@gmail.com");
        Saikumar.put("Java Marks", "90");
        Saikumar.put("SQL Marks", "86");
        Saikumar.put("HTML Marks", "69");
        Saikumar.put("JS Marks", "95");

        HashMap<String, String> Sathvika = new HashMap<>(); // 3
        Sathvika.put("Name", "Sathvika");
        Sathvika.put("Mail", "sathvika@gmail.com");
        Sathvika.put("Java Marks", "96");
        Sathvika.put("SQL Marks", "90");
        Sathvika.put("HTML Marks", "95");
        Sathvika.put("JS Marks", "88");

        HashMap<String, String> Kavya = new HashMap<>(); // 4
        Kavya.put("Name", "Kavya");
        Kavya.put("Mail", "kavya@gmail.com");
        Kavya.put("Java Marks", "90");
        Kavya.put("SQL Marks", "89");
        Kavya.put("HTML Marks", "96");
        Kavya.put("JS Marks", "85");

        HashMap<String, String> Sumanth = new HashMap<>(); // 5
        Sumanth.put("Name", "Sumanth");
        Sumanth.put("Mail", "sumanth@gmail.com");
        Sumanth.put("Java Marks", "80");
        Sumanth.put("SQL Marks", "86");
        Sumanth.put("HTML Marks", "95");
        Sumanth.put("JS Marks", "92");

        HashMap<String, String> Vijaya = new HashMap<>(); // 6
        Vijaya.put("Name", "Vijaya");
        Vijaya.put("Mail", "vijaya@gmail.com");
        Vijaya.put("Java Marks", "93");
        Vijaya.put("SQL Marks", "87");
        Vijaya.put("HTML Marks", "95");
        Vijaya.put("JS Marks", "81");

        HashMap<String, String> Mohit = new HashMap<>(); // 7
        Mohit.put("Name", "Mohit");
        Mohit.put("Mail", "mohit@gmail.com");
        Mohit.put("Java Marks", "86");
        Mohit.put("SQL Marks", "77");
        Mohit.put("HTML Marks", "99");
        Mohit.put("JS Marks", "42");

        HashMap<String, String> Narasimha = new HashMap<>(); // 8
        Narasimha.put("Name", "Narasimha");
        Narasimha.put("Mail", "narasimha@gmail.com");
        Narasimha.put("Java Marks", "60");
        Narasimha.put("SQL Marks", "69");
        Narasimha.put("HTML Marks", "63");
        Narasimha.put("JS Marks", "50");

        HashMap<String, String> Hemanth = new HashMap<>(); // 9
        Hemanth.put("Name", "Hemanth");
        Hemanth.put("Mail", "hemanth@gmail.com");
        Hemanth.put("Java Marks", "79");
        Hemanth.put("SQL Marks", "59");
        Hemanth.put("HTML Marks", "89");
        Hemanth.put("JS Marks", "35");

        HashMap<String, String> Akhila = new HashMap<>(); // 10
        Akhila.put("Name", "Akhila");
        Akhila.put("Mail", "akhila@gmail.com");
        Akhila.put("Java Marks", "28");
        Akhila.put("SQL Marks", "39");
        Akhila.put("HTML Marks", "60");
        Akhila.put("JS Marks", "48");

        HashMap<String, String> Charan = new HashMap<>(); // 11
        Charan.put("Name", "Charan");
        Charan.put("Mail", "charan@gmail.com");
        Charan.put("Java Marks", "35");
        Charan.put("SQL Marks", "43");
        Charan.put("HTML Marks", "66");
        Charan.put("JS Marks", "59");

        HashMap<String, String> Karishma = new HashMap<>(); // 12
        Karishma.put("Name", "Karishma");
        Karishma.put("Mail", "karishma@gmail.com");
        Karishma.put("Java Marks", "62");
        Karishma.put("SQL Marks", "72");
        Karishma.put("HTML Marks", "29");
        Karishma.put("JS Marks", "63");

        HashMap<String, String> Aparna = new HashMap<>(); // 13
        Aparna.put("Name", "Aparna");
        Aparna.put("Mail", "aparna@gmail.com");
        Aparna.put("Java Marks", "55");
        Aparna.put("SQL Marks", "61");
        Aparna.put("HTML Marks", "24");
        Aparna.put("JS Marks", "48");

        HashMap<String, String> Lakshmi = new HashMap<>(); // 14
        Lakshmi.put("Name", "Lakshmi");
        Lakshmi.put("Mail", "lakshmi@gmail.com");
        Lakshmi.put("Java Marks", "67");
        Lakshmi.put("SQL Marks", "88");
        Lakshmi.put("HTML Marks", "36");
        Lakshmi.put("JS Marks", "23");

        HashMap<String, String> Raghu = new HashMap<>(); // 15
        Raghu.put("Name", "Raghu");
        Raghu.put("Mail", "raghu@gmail.com");
        Raghu.put("Java Marks", "26");
        Raghu.put("SQL Marks", "34");
        Raghu.put("HTML Marks", "48");
        Raghu.put("JS Marks", "60");

        HashMap<String, String> Suvarchala = new HashMap<>(); // 16
        Suvarchala.put("Name", "Suvarchala");
        Suvarchala.put("Mail", "suvarchala@gmail.com");
        Suvarchala.put("Java Marks", "65");
        Suvarchala.put("SQL Marks", "52");
        Suvarchala.put("HTML Marks", "39");
        Suvarchala.put("JS Marks", "26");

        HashMap<String, String> Saideepa = new HashMap<>(); // 17
        Saideepa.put("Name", "Saideepa");
        Saideepa.put("Mail", "saideepa@gmail.com");
        Saideepa.put("Java Marks", "92");
        Saideepa.put("SQL Marks", "89");
        Saideepa.put("HTML Marks", "96");
        Saideepa.put("JS Marks", "81");

        HashMap<String, String> Nageswararao = new HashMap<>(); // 18
        Nageswararao.put("Name", "Nageswararao");
        Nageswararao.put("Mail", "nageswararao@gmail.com");
        Nageswararao.put("Java Marks", "80");
        Nageswararao.put("SQL Marks", "79");
        Nageswararao.put("HTML Marks", "78");
        Nageswararao.put("JS Marks", "76");

        HashMap<String, String> Saikiran = new HashMap<>(); // 19
        Saikiran.put("Name", "Saikiran");
        Saikiran.put("Mail", "saikiran@gmail.com");
        Saikiran.put("Java Marks", "67");
        Saikiran.put("SQL Marks", "72");
        Saikiran.put("HTML Marks", "18");
        Saikiran.put("JS Marks", "81");

        HashMap<String, String> Vamsi = new HashMap<>(); // 20
        Vamsi.put("Name", "Vamsi");
        Vamsi.put("Mail", "vamsi@gmail.com");
        Vamsi.put("Java Marks", "53");
        Vamsi.put("SQL Marks", "60");
        Vamsi.put("HTML Marks", "89");
        Vamsi.put("JS Marks", "70");

        HashMap<String, String> Ramana = new HashMap<>(); // 21
        Ramana.put("Name", "Ramana");
        Ramana.put("Mail", "ramana@gmail.com");
        Ramana.put("Java Marks", "13");
        Ramana.put("SQL Marks", "63");
        Ramana.put("HTML Marks", "50");
        Ramana.put("JS Marks", "29");

        HashMap<String, String> Chaitanya = new HashMap<>(); // 22
        Chaitanya.put("Name", "Chaitanya");
        Chaitanya.put("Mail", "chaitanya@gmail.com");
        Chaitanya.put("Java Marks", "36");
        Chaitanya.put("SQL Marks", "45");
        Chaitanya.put("HTML Marks", "54");
        Chaitanya.put("JS Marks", "63");

        ArrayList<HashMap<String, String>> studentInfo = new ArrayList<>();
        studentInfo.add(Rahul);
        studentInfo.add(Saikumar);
        studentInfo.add(Sathvika);
        studentInfo.add(Kavya);
        studentInfo.add(Sumanth);
        studentInfo.add(Vijaya);
        studentInfo.add(Mohit);
        studentInfo.add(Narasimha);
        studentInfo.add(Hemanth);
        studentInfo.add(Akhila);
        studentInfo.add(Charan);
        studentInfo.add(Karishma);
        studentInfo.add(Aparna);
        studentInfo.add(Lakshmi);
        studentInfo.add(Raghu);
        studentInfo.add(Suvarchala);
        studentInfo.add(Saideepa);
        studentInfo.add(Nageswararao);
        studentInfo.add(Saikiran);
        studentInfo.add(Vamsi);
        studentInfo.add(Ramana);
        studentInfo.add(Chaitanya);
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.format("|%-5s|%-15s|%-30s|%-10s|%-10s|%-10s|%-10s|\n","S.No","Name","Mail Id","Java Marks","SQL Marks","HTML Marks","JS Marks");
        System.out.println("--------------------------------------------------------------------------------------------------");
        int i = 1;
        for (HashMap<String, String> map : studentInfo) {
            System.out.format("|%-5d|%-15s|%-30s|%-10s|%-10s|%-10s|%-10s|\n", (i++),map.get("Name"), map.get("Mail"),map.get("Java Marks"),map.get("SQL Marks"),map.get("HTML Marks"),map.get("JS Marks"));
        }
        System.out.println("--------------------------------------------------------------------------------------------------");
    }
}