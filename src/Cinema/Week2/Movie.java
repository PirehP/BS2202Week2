package Cinema.Week2;

public class Movie {
    //feild
    private String MovieTitle;
    private int runningTime;
    private String Genre;

    //constructor
    public Movie(String MovieTitle, int runningTime, String Genre){
        this.MovieTitle = MovieTitle;
        this.runningTime = runningTime;
        this.Genre = Genre;
    }
    public String getMovieTitle(){
        if(MovieTitle == null)
        {
            return "Please assign a movie name. ";
        }
        return this.MovieTitle;
    }
    public void setMovieTitle(String updateMovieName){
        MovieTitle = updateMovieName;
    }
    //methods
    public void PlayMovie()
    {
        System.out.println("Movie has started..");
    }
}
