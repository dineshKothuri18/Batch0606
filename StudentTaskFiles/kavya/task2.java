import java.util.Scanner;
public class Bridge{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("The distance of the train: ");//130m
    int distance=sc.nextInt();
    System.out.println("Travelling speed of a train: ");//45km/hr
    int speed=sc.nextInt();
    System.out.println("Time travelled in seconds: ");//30sec
    int time=sc.nextInt();
    
   // distance=130;
    //speed=45*;
    //time=30;
    //speed =distance/time;
    
    double D =((speed*0.277777778)*30);
    double totaltime=D-distance;
    System.out.println("Time: "+ totaltime);
    
    
   }
}