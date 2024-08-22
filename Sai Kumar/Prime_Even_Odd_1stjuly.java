import java.util.Scanner;
public class EOP{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int a=0;
		int b=0;
		while (a>=b){
		System.out.println("Please  enter numbers whrere number1 is greater than number2");

		System.out.println("enter a number1");
		a=scan.nextInt();
		System.out.println("enter a number2");
		b=scan.nextInt();
		if (a>=b){
			System.out.println("please enter valid numbers");
System.out.println("--------------------");
	

	

			
			
		}
		
		}
		System.out.println("even numbers between "+a+"and"+b);

		for(int i=a+1 ;i<b;i++){
				if (i%2==0){
					System.out.println(i);
                                 }
                        }

		System.out.println("_________________________________");
		System.out.println("odd numbers between "+a+"and"+b);
		
		for (int i=a+1;i<b;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
		System.out.println("_________________________________");
		System.out.println("prime numbers between "+a+"and"+b);

		for (int i=a+1;i<b;i++){
			int z=0;
			for (int j=2;j<i;j++){
				if (i%j==0){
                                    z=1;
				}
			}
			if (z==1){
			   System.out.println("not prime"+i);
		
			}
			else{
				System.out.println("prime"+i);
			}

		}
		System.out.println("_________________________________");
		System.out.println("table is");
		for (int i=1;i<=b;i++){
			System.out.println(a+"*"+i+"="+a*i);
		}




		


}

}