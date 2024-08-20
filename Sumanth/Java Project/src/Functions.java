import java.util.Scanner;
public class Functions{
    public static void main(String[] args){
        int sel=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a  number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter a number 2 : ");
        int n2=sc.nextInt();
        System.out.println("--------------------------------------------");
        while(sel!=7){
            System .out.println("Enter the following "+"\n"+"1.Addition"+"\n"+"2.Substraction"+"\n"+"3.Multiplication"+"\n"+"4.Check a number is Prime/not"+"\n"+"5.Factors of a number"+"\n"+"6.Letters count of a string"+"\n"+"7.Exit");
            System.out.println("--------------------------------------------");
            sel = sc.nextInt();
            switch(sel){
                case 1 :
                    int add =n1+n2;
                    add(add);
                    break;
                case 2 :
                    int sub=n1-n2;
                    sub(sub);
                    break;
                case 3 :
                    int mul = n1*n2;
                    mul(mul);
                    break;

                case 4 :
                    isprime();
                    break;
                case 5:
                    fact(n1);
                    break;
                case 6:
                    name();
                    break;
                case 7:
                    System.out.println();
                    break;
                default :
                    System.out.println("Please enter valid number");
                    break;

            }
            if(sel<=7)
                break;
        }

    }
    public static void add(int a){
        System.out.println("Addition of two numbers : "+a);
        System.out.println("--------------------------------------------");

    }

    public static void sub(int a){
        System.out.println("Substarction of two numbers : "+a);
        System.out.println("--------------------------------------------");
    }

    public static void mul(int a){
        System.out.println("Multiplication of two numbers : "+a);
        System.out.println("--------------------------------------------");
    }


    public static void isprime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number* : ");
        int p = sc.nextInt();
        boolean flag=true;
        for(int i=2; i<p; i++){
            if(p%i==0){
                flag=false;
                System.out.println("The given Number is Not a Prime");
                System.out.println("--------------------------------------------");
                break;
            }
        }
        if(flag==true){
            System.out.println("The given Number is a Prime");
            System.out.println("--------------------------------------------");
        }


    }
    public static void fact(int n){
        System.out.print("The factors are: ");
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+ "  ");
            }
        }
        System.out.println();
        System.out.println("--------------------------------------------");
    }

    public static void name(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        System.out.println("Length of a String is : "+ name.length());
        System.out.println("--------------------------------------------");

    }
}

