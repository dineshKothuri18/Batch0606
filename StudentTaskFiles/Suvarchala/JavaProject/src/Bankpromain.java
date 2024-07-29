import java.util.*;

public class Bankpromain {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n      ******************  welcome to ABC Bank  ************************     \n");
        System.out.println("please select branch that you are related to: ");
        System.out.print(" 1) ABC bank Kukatpalli \n 2) ABC bank JNTU \n 3) ABC bank KPHB \n 4) ABC bank ERRAGADA(chinni)\n Enter the branch no: ");
        int selectbranch=sc.nextInt();

        Allbranch b1=new Allbranch();
        b1.stafforcus();
        if (b1.StaffOrcust) {
            Staff s1=new Staff(b1);
            s1.checkLogin();
        } else {
            Customer c1=new Customer(b1);
            c1.checkcust();
        }
    }
}