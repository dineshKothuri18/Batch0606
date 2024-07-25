package Shiva1328;

import java.util.Scanner;

public class MovieDetails {

   public static void main(String[]args) {
       Scanner sc = new Scanner(System.in);
       int noofmovies = sc.nextInt();
       MovieBluePrint[]movies = new MovieBluePrint[noofmovies];

       for(int i = 0; i<noofmovies; i++) {
           System.out.println("Enter The Movie Name :");
           movies[i].movieName = sc.nextLine();
           System.out.println("Enter The Hero Name :");
           movies[i].heroName = sc.nextLine();
           System.out.println("Enter The Heroine Name :");
           movies[i].heroineName = sc.nextLine();
           System.out.println("Enter The Director Name :");
           movies[i].directorName = sc.nextLine();
           System.out.println("Enter The Movie Budget :");
           movies[i].budget = sc.nextInt();

           System.out.println(movies[i].movieName);
           System.out.println(movies[i].heroName);
           System.out.println(movies[i].heroineName);
           System.out.println(movies[i].directorName);
           System.out.println(movies[i].budget);

           movies[i].setBudget();
           movies[i].setMovieTime();


       }
   }

}
