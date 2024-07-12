import java.util.Scanner;
import java.util.ArrayList;

public class FunctionsTopic {

    public static void main(String[] args){

        String[] names = {"Sai","Rahul","Sumanth","Siva"};
        names[0]="Saikumar";

        String myName = "Dinesh";
        String fName = "dineshsdfdsff";
        boolean isEqal = myName.equalsIgnoreCase(fName);
        
        System.out.println(isEqal);
        ArrayList<String> stuNames = new ArrayList<String>();

        stuNames.add("Suvarchala");
        stuNames.add("Raghu");
        stuNames.add("Shiva");
        stuNames.add("Chaitanya");
        stuNames.add("Mohit");
        System.out.println(stuNames);

        stuNames.add(1,"Saikumar");
        System.out.println(stuNames);

        stuNames.remove("Chaitanya");

        System.out.println(stuNames);


    }


    public static void sampleFunction(int a,int b){

    }

    public static int sampleFunction(int a,int b,int c){

        return  0;
    }


}

