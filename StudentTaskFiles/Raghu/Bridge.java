import java.util.Scanner;
public class Bridge {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("The distance of train: ");
        int distance = sc.nextInt();
        System.out.println("Travelling speed of train: ");
        int speed = sc.nextInt();
        System.out.println("time travelling in seconds: ");
        int time = sc.nextInt();
        
        
        double D = ((speed*0.27777778)*30);
        double totaltime=D-distance;
        System.out.println("time: "+totaltime);
    }
}