import java.util.Scanner;
public class Functions{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int y=1;
		while(y>0){
		System.out.println("----------------------------------------------------------");
		System.out.println("PLease choose the services below and give input as number");
		System.out.println("Arthematic calculation - 1");
		System.out.println("Check whether prime or not prime - 2");
		System.out.println("Factorization of a number - 3");
		System.out.println("letter count of a string - 4");
		System.out.println("END - 5");
		int a=scan.nextInt();
			if (a==1){
				Arthematic();
			}
			else if (a==2){
				Prime();
			}
			else if (a==3) {
				Factors();
			}
			else if (a==4){
				StringLen();
			}
			else if (a==5){
				y=0;
			}


		
			}	
	}
	public static void Arthematic(){
		Scanner scan = new Scanner(System.in);
		System.out.println("-------welecome to Arthematic operations---------------------");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulus");
		System.out.println("6.Exit");
		System.out.println("Enter the first number");
		int e=scan.nextInt();
		System.out.println("Enter the second number");
		int f=scan.nextInt();
		int b=scan.nextInt();
		switch(b){
					case 1:

						System.out.println("Addition of two numbers is "+(e+f));
						break;
					case 2:

						System.out.println("Subtraction of two numbers is "+(e-f));
						break;

					case 3:

						System.out.println("Multiplication of two numbers is "+(e*f));
						break;

					case 4:

						System.out.println("Division of two numbers is "+(e/f));
						break;
					case 5:

						System.out.println("Modulus of two numbers is "+(e%f));
						break;
					case 6:
						break;
		}
				
	}

	public static void Prime(){
		System.out.println("-------welecome to Prime /Non Prime---------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int c=scan.nextInt();
		for (int i=3;i<=c;i++){
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
	}

	public 	static void Factors(){
		System.out.println("-------welecome to Factors finder---------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int d=scan.nextInt();
		System.out.println("Factors:");
		for (int i=1;i<=d;i++){
			if (d%i==0){
				System.out.print(i+",");
			}

		}
		System.out.println();	
	}

	public static void StringLen(){
		System.out.println("-------welecome to String charc lenth finder---------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s=scan.nextLine();
				s=s.toLowerCase();
		int[] arr=new int[127];
		for (int i=0;i<s.length();i++){
			int asciii=s.charAt(i);
			arr[asciii]++;
}

		for (int i=0;i<s.length();i++){
			int asciii=s.charAt(i);
			if (arr[asciii]>0){
			char w=(char)(asciii);
			System.out.println(w+"-"+arr[asciii]);
arr[asciii]=0;
}
}
}
}
