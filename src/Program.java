import Cinema.Week2.Movie;

public class Program {
    public static void main(String[] args)
    {
        Movie InceptionMovie = new Movie("Inception", 200, "SciFi");
        Movie movie2 = new Movie("Avatar2", 300,"SciFi");

        System.out.println(InceptionMovie.getMovieTitle());

        InceptionMovie.setMovieTitle("Inception Part 2");
        System.out.println(InceptionMovie.getMovieTitle());
        InceptionMovie.PlayMovie();

        System.out.println(movie2.getMovieTitle());
    }
}
