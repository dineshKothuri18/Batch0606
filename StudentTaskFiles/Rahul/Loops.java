import java.util.Scanner;
public class Loops{
	public static int[] input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number: ");
		int start = sc.nextInt();
		System.out.println("Enter the end number: ");
		int end = sc.nextInt();
		int ar[] = new int[2];
		ar[0] = start;
		ar[1] = end;
		return ar;
	}
	public static void main(String[] args){

		int start = 0,end=-1,count = 0;
		while(start>end){
			if(count++>0){
				System.out.println();
				System.out.println("Start number should be less tham end number");
			}
			int ar[]=input();
			start = ar[0];
			end = ar[1];
		}
		System.out.println("Even Numbers between "+start+" and "+end);
		for(int i=start+1;i<end;i++){
			if(i%2 == 0)
				System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-----------------------------------");


		System.out.println("Odd Numbers between "+start+" and "+end);
		for(int i=start+1;i<end;i++){
			if(i%2!=0)
				System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-----------------------------------");


		System.out.println("Prime Numbers between "+start+" and "+end);
		for(int i=start;i<=end;i++){
			boolean flag = false;
			for(int j=2;j*j<=i;j++){
				if(i%j == 0){
					flag = true;
					break;
				}
			}
			if(flag == false){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("-----------------------------------");
		for(int i=1;i<=end;i++){
			System.out.println(start+"*"+i+"="+start*i);
		}
	}
}