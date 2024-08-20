import java.util.Scanner;
public class sub{
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter the first number");
            int a = sc.nextInt();
            System.out.println("please enter the second number");
            int b = sc.nextInt();
            /*int add;
            int sub;
            int mult;
            float div;
            int mod;
            int square;
            */
            System.out.println("enter requried form");
            String operator = sc.nextLine();
            
            switch(a){
        case 1:
            System.out.println("add of two numbers:" + "a+b");
            break;
            
        case 2:
            System.out.println("sub of two numbers:" + "a-b");
            break;
            
        case 3:
            System.out.println("mult of two numbers:" + "a*b");
            break;
            
        case 4:
            System.out.println("div  of two numbers:" + "a / b");
            break;
            
        case 5:
            System.out.println("mod  of two numbers:" + "a%b");
            break;
            
        case 6:
            System.out.println("square  of two numbers:" + "a*b");
            break;
        default:
            System.out.println("no numbers");
             break;
            
            
        }
        
    
    }
    }
}
