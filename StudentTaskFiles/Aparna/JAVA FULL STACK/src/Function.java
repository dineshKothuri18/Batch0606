import java.util.*;
public class Function{
public static void main(String[] args){
    addition();
    factors();
    prime();
    count();
 }
public static void addition()
{ 
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first number:");
       int f1=sc.nextInt();
       System.out.println("enter the second number:");
       int f2=sc.nextInt();
       System.out.println("addition: "+(f1+f2));
       System.out.println("subtraction: "+(f1-f2));
       System.out.println("multiplication:"+(f1*f2));
       System.out.println("Division:"+(f1%f2));
       System.out.println("modulus:"+(f1/f2));
   }
   public static void factors(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to factors");
	int n1 = sc.nextInt();
	 
	for(int i=1;i<=n1;i++){
	   if(n1%i==0){
        System.out.print(i+"  ");
	   }
        }
    }
 public static void prime()
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number to prime");
  int m1 = sc.nextInt();
  int count=0;
  for(int i=1;i<=m1;i++){
     if(m1%i==0)
      {
       count++;
      }
    }
     System.out.println(count);
     if(count==2)
      {
       System.out.println("prime");
       }else{
           System.out.println("Is not a prime");
       }
     }
public static void count()
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Word");
  String m1 = sc.nextLine();
  
        
        String[] temp=m1.split("\\ ");
         
        for(String t: temp)
        {
            
            if(t.length()>0)
            System.out.println(t+" -> "+t.length());
        }

    }
}