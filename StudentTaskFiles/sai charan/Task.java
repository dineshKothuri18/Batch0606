
<<<<<<< HEAD

=======
>>>>>>> 98b4a45dabfbb84b82f746f69dbcc92be70e13a9
import java.util.Scanner;
public class Task{
    public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("ENTER NUM1");
int num1 =  sc.nextInt();


System.out.println("ENTER NUM2");
int num2=  sc.nextInt();


//evenodd starts
<<<<<<< HEAD
for(int i=num1;i<=num2;i++){
=======
int i;
for(i=num1;i<=num2;i++){
>>>>>>> 98b4a45dabfbb84b82f746f69dbcc92be70e13a9
    if(i%2==0){
        System.out.println(i + " is even number");
         }
         if(i%2==1){
            System.out.println(i+ " is odd number");
         }
}

//evenodd ends



// // prime starts
// 
        for (int x = num1; x <= num2; x++) {
            if (x <= 1) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(x); j++) {
                if (x % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(x + " is a prime number");
            }
        }




// //multiplaction starts
 


    //    3x1=3
        // num1 "x" i(1..10) "=" num1*i
<<<<<<< HEAD
        for(int k= 1;k<=num2;k++){   
            System.out.println(num1 +"x"+(k) +"="+(num1*(k)));
=======
        for(int i = 1;i<=num2;i++){   
            System.out.println(num1 +"x"+(i) +"="+(num1*(i)));
>>>>>>> 98b4a45dabfbb84b82f746f69dbcc92be70e13a9
        }

    }
    

      }


    


<<<<<<< HEAD
=======




>>>>>>> 98b4a45dabfbb84b82f746f69dbcc92be70e13a9
