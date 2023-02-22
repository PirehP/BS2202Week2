import Cinema.Week2.Movie;
import Cinema.Week2.MovieDirectory;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args)
    {
        Movie InceptionMovie = new Movie("Inception", 200, "SciFi");
        Movie movie2 = new Movie("Avatar2", 300,"SciFi");

        System.out.println(InceptionMovie.getMovieTitle());
        System.out.println(movie2.getMovieTitle());

//        InceptionMovie.setMovieTitle("Inception Part 2");
//        InceptionMovie.PlayMovie();


        //Array Demo
        String[] studentRegister = {"", "", ""};
        studentRegister[0] = "Alice";
        studentRegister[1] = "Ann";
        System.out.println(studentRegister[0]);

        //Array Lists Demo
        ArrayList<String> listOfStudents = new ArrayList<String>();
        listOfStudents.add("Alice");//0th
        listOfStudents.add("Marry");
        listOfStudents.remove(0);

        //Movie Directory
        MovieDirectory cinemaMovies = new MovieDirectory();
        //add movies to list
        cinemaMovies.addMovietoList(InceptionMovie);
        cinemaMovies.addMovietoList(movie2);

        //removing movie form list
//        cinemaMovies.removeMovietoList(movie2);

        //get number of movies in the list
        System.out.println("Number of movies: " + cinemaMovies.getNumberofMoviesintheDirectory());

        //get a specific movie on a location
        Movie selectedMovie = cinemaMovies.getMoviefromList(0);
//        selectedMovie.PlayMovie();

        //Printing all movies in the list
        System.out.println("Below is the list of movies that are played in this cinema");
        cinemaMovies.printAllMoviesintheList();
        cinemaMovies.SearchMovie("Inception Part 2");

    }
}
