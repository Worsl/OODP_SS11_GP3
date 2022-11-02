import models.*;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 * The entry point for the admin portal
 *
 * Written on Wednesday, 19 October 2022.
 */

class Admin {
     public static void main(String[] args) {
         // Key = Cineplex Name, Value = Cineplex
         HashMap<String, Cineplex> cineplexes = DAO.getCineplexes();
         // Key = Cinema Code, Value = Cinema
         HashMap<String, Cinema> cinemas = DAO.getCinemas(cineplexes);
         // Key = Movie Title, Value = movie object
         HashMap<String, Movie> movies = DAO.getMovies();
         // Key = Movie Title, Value = List of corresponding sessions
         HashMap<String, LinkedList<MovieSession>> sessions = DAO.getSessions(cinemas, movies);
         // Key = Movie Title, Value = List of corresponding reviews
         HashMap<String, LinkedList<Review>> reviews = DAO.getReviews(movies);

         Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to MOBLIMA Admin Portal!");
        int in = 0;
        while (in != 7) {
            System.out.println("What would you like to do today?");
            System.out.println("1. Add a new movie");
            System.out.println("2. Update a movie's details");
            System.out.println("3. Delete an existing movie");
            System.out.println("4. Add a new time slot for a movie");
            System.out.println("5. Update a time slot for a movie");
            System.out.println("6. Delete an existing time slot for a movie");
            System.out.println("7. Exit");
            in = sc.nextInt();

            switch(in) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                System.out.println("Thank you for using MOBLIMA Admin Portal!");
                break;
            }
        }
    }
}
