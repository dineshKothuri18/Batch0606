import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Student {
    //public static HashMap<String,String>stuinfo;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String,String>s0=new HashMap<>();
        s0.put("Name","Sumanth");
        s0.put("Phone","7569318996");
        s0.put("Java","50");
        s0.put("SQL","60");
        s0.put("JS","70");
        s0.put("Roll Number","24R21A0601");
        s0.put("Mail","menasumanth@gmail.com");
        /*System.out.println(stuinfo.keySet()+"-"+stuinfo.values());
        for(String s : stuinfo.keySet())
            System.out.println(s+"-"+stuinfo.get(s));*/

        HashMap<String,String>s1=new HashMap<>();
        s1.put("Name","Mohith");
        s1.put("Phone","7569318996");
        s1.put("Java","90");
        s1.put("SQL","85");
        s1.put("JS","75");
        s1.put("Roll Number","24R21A0602");
        s1.put("Mail","mohith@gmail.com");

        HashMap<String,String>s2 = new HashMap<>();
        s2.put("Name","Sai Charan");
        s2.put("Phone","7569318996");
        s2.put("Java","55");
        s2.put("SQL","92");
        s2.put("JS","88");
        s2.put("Roll Number","24R21A0603");
        s2.put("Mail","saicharan@gmail.com");

        HashMap<String,String>s3=new HashMap<>();
        s3.put("Name","Vamshi");
        s3.put("Phone","7569318996");
        s3.put("Java","58");
        s3.put("SQL","60");
        s3.put("JS","70");
        s3.put("Roll Number","24R21A0204");
        s3.put("Mail","vamshi@gmail.com");

        HashMap<String,String>s4=new HashMap<>();
        s4.put("Name","Rahul");
        s4.put("Phone","7569318996");
        s4.put("Java","92");
        s4.put("SQL","88");
        s4.put("JS","72");
        s4.put("Roll Number","24R21A0605");
        s4.put("Mail","Rahul@gmail.com");

        HashMap<String,String>s5=new HashMap<>();
        s5.put("Name","Sai kumar");
        s5.put("Phone","7569318996");
        s5.put("Java","93");
        s5.put("SQL","89");
        s5.put("JS","76");
        s5.put("Roll Number","24R21A0606");
        s5.put("Mail","saikumar@gmail.com");

        HashMap<String,String>s6=new HashMap<>();
        s6.put("Name","Hemanth");
        s6.put("Phone","7569318996");
        s6.put("Java","96");
        s6.put("SQL","87");
        s6.put("JS","75");
        s6.put("Roll Number","24R21A0607");
        s6.put("Mail","hemanth@gmail.com");

        HashMap<String,String>s7=new HashMap<>();
        s7.put("Name","siva");
        s7.put("Phone","7569318996");
        s7.put("Java","56");
        s7.put("SQL","88");
        s7.put("JS","65");
        s7.put("Roll Number","24R21A0608");
        s7.put("Mail","shiva@gmail.com");

        HashMap<String,String>s8=new HashMap<>();
        s8.put("Name","Sai kiran");
        s8.put("Phone","7569318996");
        s8.put("Java","92");
        s8.put("SQL","78");
        s8.put("JS","75");
        s8.put("Roll Number","24R21A0609");
        s8.put("Mail","hemanth@gmail.com");

        HashMap<String,String>s9=new HashMap<>();
        s9.put("Name","Akhila");
        s9.put("Phone","7569318996");
        s9.put("Java","99");
        s9.put("SQL","56");
        s9.put("JS","89");
        s9.put("Roll Number","24R21A0610");
        s9.put("Mail","hemanth@gmail.com");

        HashMap<String,String>s10=new HashMap<>();
        s10.put("Name","Deepa");
        s10.put("Phone","7569318996");
        s10.put("Java","99");
        s10.put("SQL","99");
        s10.put("JS","99");
        s10.put("Roll Number","24R21A0611");
        s10.put("Mail","deepa@gmail.com");

        HashMap<String,String>s11=new HashMap<>();
        s11.put("Name","Sathiwika");
        s11.put("Phone","7569318996");
        s11.put("Java","66");
        s11.put("SQL","68");
        s11.put("JS","99");
        s11.put("Roll Number","24R21A0612");
        s11.put("Mail","hemanth@gmail.com");

        HashMap<String,String>s12=new HashMap<>();
        s12.put("Name","Suvarchala");
        s12.put("Phone","7569318996");
        s12.put("Java","99");
        s12.put("SQL","89");
        s12.put("JS","79");
        s12.put("Roll Number","24R21A0613");
        s12.put("Mail","suvarchala@gmail.com");

        HashMap<String,String>s13=new HashMap<>();
        s13.put("Name","Raghu");
        s13.put("Phone","7569318996");
        s13.put("Java","69");
        s13.put("SQL","83");
        s13.put("JS","45");
        s13.put("Roll Number","24R21A0614");
        s13.put("Mail","raghu@gmail.com");

        HashMap<String,String>s14=new HashMap<>();
        s14.put("Name","kavya");
        s14.put("Phone","7569318996");
        s14.put("Java","78");
        s14.put("SQL","75");
        s14.put("JS","97");
        s14.put("Roll Number","24R21A0615");
        s14.put("Mail","kavya@gmail.com");

        HashMap<String,String>s15=new HashMap<>();
        s15.put("Name","vijaya");
        s15.put("Phone","7569318996");
        s15.put("Java","79");
        s15.put("SQL","86");
        s15.put("JS","96");
        s15.put("Roll Number","24R21A0616");
        s15.put("Mail","vijaya@gmail.com");

        HashMap<String,String>s16=new HashMap<>();
        s16.put("Name","Aparna");
        s16.put("Phone","7569318996");
        s16.put("Java","69");
        s16.put("SQL","87");
        s16.put("JS","77");
        s16.put("Roll Number","24R21A0617");
        s16.put("Mail","aparna@gmail.com");

        HashMap<String,String>s17=new HashMap<>();
        s17.put("Name","chaitanya");
        s17.put("Phone","7569318996");
        s17.put("Java","58");
        s17.put("SQL","67");
        s17.put("JS","75");
        s17.put("Roll Number","24R21A0618");
        s17.put("Mail","chaitanya@gmail.com");

        HashMap<String,String>s18=new HashMap<>();
        s18.put("Name","Ramana");
        s18.put("Phone","7569318996");
        s18.put("Java","96");
        s18.put("SQL","57");
        s18.put("JS","85");
        s18.put("Roll Number","24R21A0619");
        s18.put("Mail","ramana@gmail.com");

        HashMap<String,String>s19=new HashMap<>();
        s19.put("Name","Karishma");
        s19.put("Phone","7569318996");
        s19.put("Java","74");
        s19.put("SQL","83");
        s19.put("JS","89");
        s19.put("Roll Number","24R21A0620");
        s19.put("Mail","karishma@gmail.com");


        ArrayList<HashMap<String,String>>studinfo=new ArrayList<>();
        studinfo.add (s0);
        studinfo.add (s1);
        studinfo.add (s2);
        studinfo.add (s3);
        studinfo.add (s4);
        studinfo.add (s5);
        studinfo.add (s6);
        studinfo.add (s7);
        studinfo.add (s8);
        studinfo.add (s9);
        studinfo.add (s10);
        studinfo.add (s11);
        studinfo.add (s12);
        studinfo.add (s13);
        studinfo.add (s14);
        studinfo.add (s15);
        studinfo.add (s16);
        studinfo.add (s17);
        studinfo.add (s18);
        studinfo.add (s19);

        for(HashMap<String,String> student : studinfo) {
            System.out.println("Name : " + student.get("Name"));
            System.out.println("Phone : " + student.get("Phone"));
            System.out.println("Java Marks : " + student.get("Java"));
            System.out.println("SQL Marks : " + student.get("SQL"));
            System.out.println("JS Marks : " + student.get("JS"));
            System.out.println("Roll Number : " + student.get("Roll Number"));
            System.out.println("Email : " + student.get("Mail"));
            System.out.println("-------------------------------------------------");
        }
    }
}
