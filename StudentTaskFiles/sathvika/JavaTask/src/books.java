import java.util.ArrayList;
import java.util.Scanner;

public class books {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<books>Books1 = new ArrayList<>();
        Story book = new Story();
        System.out.println("Please enter your book name : ");
        book.bookName = sc.nextLine();
        System.out.println("Please enter the author of your specified book : ");
        book.author = sc.nextLine();
        System.out.println("Please enter your book number : ");
        book.isbno = sc.nextLine();
        System.out.println("Please enter the cost of your book : ");
        book.price = sc.nextLine();
        System.out.println("Please mention your review of the book while reading : ");
        book.review = sc.nextLine();
        System.out.println("__________________________________________________________________");


        System.out.println("Name of the book : "+book.bookName);
        System.out.println("Author of the book : "+book.author);
        System.out.println("ISB NUmber of the book : "+book.isbno);
        System.out.println("Price of the book : "+book.price);
        System.out.println("Review of the book : "+book.review);
        System.out.println("###############################################");

        book.readingbook();
        book.writingbook();
        book.buyingbook();
        book.sellingbook();

    }
}
