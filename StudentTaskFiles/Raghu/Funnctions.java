import java.util.Scanner;
import java.util.ArrayList;

public class FunctionsTopic {

    public static void main(String[] args){

        String[] names = {"Narasimha","Siva","VijayaLakshmi","Raghu"};
        names[0]="Siva";

        String myName = "Raghu";
        String fName = "Raghusdfdsff";
        boolean isEqal = myName.equalsIgnoreCase(fName);
        
        System.out.println(isEqal);
        ArrayList<String> stuNames = new ArrayList<String>();

        stuNames.add("Narasimha");
        stuNames.add("Siva");
        stuNames.add("VijayaLakshmi");
        stuNames.add("Raghu");
        stuNames.add("HemanthChowdary");
        System.out.println(stuNames);

        stuNames.add(1,"Siva");
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