import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        HashMap<String,String>l2=new HashMap<>();
        l2.put("name","Aparna");
        l2.put("phone","7013128460");
        l2.put("java","99");
        l2.put("sQL","89");
        l2.put("jS","80");
        l2.put("roll Number","20KE1A0501");
        l2.put("mail","aparna@gmail.com");


        HashMap<String,String>l3=new HashMap<>();
        l3.put("name","chaitanya");
        l3.put("phone","8790542981");
        l3.put("java","78");
        l3.put("sQL","77");
        l3.put("jS","76");
        l3.put("roll Number","20KE1A0502");
        l3.put("mail","chaitanya@gmail.com");

        HashMap<String,String>l4=new HashMap<>();
        l4.put("name","kavya");
        l4.put("phone","9876543256");
        l4.put("java","67");
        l4.put("sQL","79");
        l4.put("jS","87");
        l4.put("roll Number","20KE1A0503");
        l4.put("mail","kavya@gmail.com");

        HashMap<String,String>l5=new HashMap<>();
        l5.put("name","vijaya");
        l5.put("phone","9564579876");
        l5.put("java","89");
        l5.put("sQL","78");
        l5.put("jS","96");
        l5.put("roll Number","20KE1A0504");
        l5.put("mail","vijaya@gmail.com");

        HashMap<String,String>l6=new HashMap<>();
        l6.put("name","Karishma");
        l6.put("phone","7896543789");
        l6.put("java","56");
        l6.put("sQL","78");
        l6.put("jS","67");
        l6.put("roll Number","20KE1A0505");
        l6.put("mail","karishma@gmail.com");

        HashMap<String,String>l7=new HashMap<>();
        l7.put("name","Suvarchala");
        l7.put("phone","7569567658");
        l7.put("java","99");
        l7.put("sQL","98");
        l7.put("jS","87");
        l7.put("roll Number","20KE1A0506");
        l7.put("mail","suvarchala@gmail.com");

        HashMap<String,String>l8=new HashMap<>();
        l8.put("name","Sathiwika");
        l8.put("phone","7569318996");
        l8.put("java","66");
        l8.put("sQL","68");
        l8.put("jS","99");
        l8.put("roll Number","20KE1A0507");
        l8.put("mail","sathiwika@gmail.com");

        HashMap<String,String>l9=new HashMap<>();
        l9.put("name","Deepa");
        l9.put("phone","796574326");
        l9.put("java","67");
        l9.put("sQL","95");
        l9.put("jS","79");
        l9.put("roll Number","20KE1A0508");
        l9.put("mail","deepa@gmail.com");

        HashMap<String,String>l10=new HashMap<>();
        l10.put("name","Ramana");
        l10.put("phone","7569318996");
        l10.put("java","96");
        l10.put("sQL","57");
        l10.put("jS","85");
        l10.put("roll Number","20KE1A0509");
        l10.put("mail","ramana@gmail.com");

        HashMap<String,String>l11=new HashMap<>();
        l11.put("name","Raghu");
        l11.put("phone","7556897696");
        l11.put("java","69");
        l11.put("sQL","83");
        l11.put("jS","45");
        l11.put("roll Number","20KE1A05010");
        l11.put("mail","raghu@gmail.com");

        HashMap<String,String>l12=new HashMap<>();
        l12.put("name","Akhila");
        l12.put("phone","7453288996");
        l12.put("java","99");
        l12.put("sQL","56");
        l12.put("jS","89");
        l12.put("roll Number","20KE1A0511");
        l12.put("mail","ahkila@gmail.com");

        HashMap<String,String>l13=new HashMap<>();
        l13.put("name","Sai kiran");
        l13.put("phone","756234596");
        l13.put("java","92");
        l13.put("sQL","78");
        l13.put("jS","75");
        l13.put("roll Number","20KE1A0512");
        l13.put("mail","sai kiran@gmail.com");

        HashMap<String,String>l14=new HashMap<>();
        l14.put("name","siva");
        l14.put("phone","7664433296");
        l14.put("java","56");
        l14.put("sQL","88");
        l14.put("jS","65");
        l14.put("roll Number","20KE1A0513");
        l14.put("mail","shiva@gmail.com");

        HashMap<String,String>l15=new HashMap<>();
        l15.put("name","Hemanth");
        l15.put("phone","7568877696");
        l15.put("java","96");
        l15.put("sQL","87");
        l15.put("jS","75");
        l15.put("roll Number","20KE1A0514");
        l15.put("mail","hemanth@gmail.com");

        HashMap<String,String>l16=new HashMap<>();
        l16.put("name","Sai kumar");
        l16.put("phone","7566655496");
        l16.put("java","93");
        l16.put("sQL","89");
        l16.put("jS","76");
        l16.put("roll Number","20KE1A0515");
        l16.put("mail","saikumar@gmail.com");

        HashMap<String,String>l17=new HashMap<>();
        l17.put("name","Rahul");
        l17.put("phone","9553377696");
        l17.put("java","92");
        l17.put("sQL","88");
        l17.put("jS","72");
        l17.put("roll Number","20KE1A0516");
        l17.put("mail","Rahul@gmail.com");

        HashMap<String,String>l18=new HashMap<>();
        l18.put("name","Sumanth");
        l18.put("phone","9869318996");
        l18.put("java","50");
        l18.put("sQL","60");
        l18.put("jS","70");
        l18.put("roll Number","20KE1A0517");
        l18.put("mail","sumanth@gmail.com");

        HashMap<String,String>l19=new HashMap<>();
        l19.put("name","Mohith");
        l19.put("phone","9988318996");
        l19.put("java","90");
        l19.put("sQL","85");
        l19.put("jS","75");
        l19.put("roll Number","20KE1A0518");
        l19.put("mail","mohith@gmail.com");

        HashMap<String,String>l20= new HashMap<>();
        l20.put("name","Sai Charan");
        l20.put("phone","9876318996");
        l20.put("java","55");
        l20.put("sQL","92");
        l20.put("jS","88");
        l20.put("roll Number","20KE1A0519");
        l20.put("mail","saicharan@gmail.com");

        HashMap<String,String>l21=new HashMap<>();
        l21.put("name","Vamshi");
        l21.put("phone","8976318996");
        l21.put("java","58");
        l21.put("sQL","60");
        l21.put("jS","70");
        l21.put("roll Number","20KE1A0520");
        l21.put("mail","vamshi@gmail.com");

        ArrayList<HashMap<String,String>>studinfo=new ArrayList<>();
        studinfo.add (l2);
        studinfo.add (l3);
        studinfo.add (l4);
        studinfo.add (l5);
        studinfo.add (l6);
        studinfo.add (l7);
        studinfo.add (l8);
        studinfo.add (l9);
        studinfo.add (l10);
        studinfo.add (l11);
        studinfo.add (l12);
        studinfo.add (l13);
        studinfo.add (l14);
        studinfo.add (l15);
        studinfo.add (l16);
        studinfo.add (l17);
        studinfo.add (l18);
        studinfo.add (l19);
        studinfo.add (l20);
        studinfo.add (l21);


        for(HashMap<String,String> student : studinfo) {
            System.out.println("name : " + student.get("name"));
            System.out.println("phone : " + student.get("phone"));
            System.out.println("java Marks : " + student.get("java"));
            System.out.println("sQL Marks : " + student.get("sQL"));
            System.out.println("jS Marks : " + student.get("jS"));
            System.out.println("roll Number : " + student.get("roll Number"));
            System.out.println("email : " + student.get("mail"));
            System.out.println("-------------------------------------------------");


        }


    }
}
