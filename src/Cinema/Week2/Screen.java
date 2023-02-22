package Cinema.Week2;

public class Screen
{
    private int screenNumber;
    private boolean imax;

    public Screen(int number, boolean isIMAX)
    {
        screenNumber = number;
        imax = isIMAX;
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public boolean isImax() {
        return imax;
    }

    public String getScreenInformation()
    {
        String screenInfo = "Screen " + screenNumber;

        if(imax)
            screenInfo += " is an IMAX compatible";
        else
            screenInfo += "is not IMAX compatible";

        return screenInfo;
    }
}
