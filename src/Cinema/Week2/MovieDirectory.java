package Cinema.Week2;

import java.util.ArrayList;

public class MovieDirectory {
    String Name;
    ArrayList<Movie> movieList;

    public MovieDirectory()
    {
        this.movieList = new ArrayList<Movie>();
    }
    public void addMovietoList(Movie movie){
        this.movieList.add(movie);
    }
    public void removeMovietoList(Movie movie){
        this.movieList.remove(movie);
    }
    public Movie getMoviefromList(int index){
        Movie selectedMovie = this.movieList.get(index);
        return selectedMovie;
    }
    public int getNumberofMoviesintheDirectory(){
       return this.movieList.size();
    }
}
