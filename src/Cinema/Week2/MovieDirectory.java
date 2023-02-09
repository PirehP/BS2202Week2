package Cinema.Week2;

import java.util.ArrayList;
import java.util.Iterator;

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
    public void printAllMoviesintheList()
    {
        for(Movie movie : movieList)
        {
            System.out.println(movie.getMovieTitle());
        }
    }
    public void SearchMovie(String movieName)
    {
        boolean found =false;
        for(Movie movie : movieList)
        {
            if(movie.getMovieTitle() == movieName)
            {
                System.out.println("Found it!");
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Sorry not found!");
        }
    }
    public void SearchMovieusingWhileLoop(String movieName)
    {
        boolean found = false;
        int index = 0;

        while(index < movieList.size() && !found)
        {
            if(movieList.get(index).getMovieTitle() == movieName)
            {
                System.out.println("Found it!");
                found = true;
            }
        }

        if(!found) {
            System.out.println("Sorry not found!");
        }

    }
    public void SearchMovieusingIteration(String movieName)
    {
        boolean found = false;

        Iterator<Movie> it = movieList.iterator();
        while(it.hasNext())
        {
            Movie selectedMovie = it.next();
            if(selectedMovie.getMovieTitle() == movieName)
            {
                System.out.println("Found it!");
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Sorry not found!");
        }

    }
}
