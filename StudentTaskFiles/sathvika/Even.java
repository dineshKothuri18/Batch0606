import java.util.Scanner;
public class Even{
public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
   System.out.println("enter a number:");
    int n = sc.nextInt();
   System.out.println("enter a number2:");
    int n1 =sc.nextInt();
   System.out.print("even numbers"+n +"and"+n1 +"are : ");
   for(int i=n;i<=n1;i++)
if(i%2==0)
System.out.print(" "+i);
System.out.print("\nodd numbers"+n +"and"+n1 +"are : ");
   for(int i=n;i<=n1;i++)
if(i%2!=0)
System.out.print(" "+i);
System.out.print("\nMultilication numbers"+n +"and"+n1 +"are : ");
   for(int i=n;i<=n1;i++)
System.out.println(n+ "*" +i+ "="+(n*i));

}
}


