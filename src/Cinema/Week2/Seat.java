package Cinema.Week2;

public class Seat
{
    private int column;
    private char row;
    private boolean allocated;

    public Seat(int seatColumn, char seatRow)
    {
        column = seatColumn;
        row = seatRow;
        allocated = false;
    }

    public char getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public boolean isAllocated() {
        return allocated;
    }

    public void setAllocated(boolean allocated) {
        this.allocated = allocated;
    }

    public String getSeatNumber()
    {
        return ""+row+column;
    }

    public String getSeatInformation()
    {
        String seatInfo = "Seat: "+row+column;
        if(allocated)
            seatInfo += " is allocated";
        else
            seatInfo += " is not allocated";

        return seatInfo;
    }
}
