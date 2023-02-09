package Cinema.Week2;

public class Movie {
    //feild
    private String MovieTitle;
    private int runningTime;
    private String Genre;

    //constructor
    public Movie(String title, int runningTime, String Genre){
        MovieTitle = title;
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
