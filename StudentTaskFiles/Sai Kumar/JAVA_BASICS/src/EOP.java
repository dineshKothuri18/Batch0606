import java.util.Scanner;
public class EOP{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number1");
		int a=scan.nextInt();
		System.out.println("enter a number2");
		int b=scan.nextInt();
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