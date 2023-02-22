package Cinema.Week2;

public class Screening
{
    private Screen screen;
    private String startTime, date;
    private Movie filmToShow;

    public Screening(Screen screen, String start, String date, Movie film)
    {
        this.screen = screen;
        startTime = start;
        this.date = date;
        filmToShow = film;
    }

    public Screen getScreen()
    {
        return screen;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public Movie getFilmToShow() {
        return filmToShow;
    }

    public String getScreeningInformation()
    {
        String screeningInfo = filmToShow.getMovieTitle() + " will be shown in screen " + screen.getScreenNumber();
        screeningInfo += " on " + date + " at " + startTime;

        return screeningInfo;
    }
}
