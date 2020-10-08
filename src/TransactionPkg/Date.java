package TransactionPkg;

public class Date implements Comparable<Date> {
    private int year;
    private int month;
    private int day;

    int MAX_VALID_YR = 2021;
    int MIN_VALID_YR = 2009;

    public Date (int y, int m, int d)
    {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    /**
     *
     * @param date
     * @return
     */
    public int compareTo(Date date){
        if(date.day == this.day && date.year == this.year && date.month == this.month){
            return 0;
        }else if(date.day < this.day && date.year < this.year && date.month < this.month){
            return -1;
        }else{
            return 1;
        }
    } //return 0, 1, or -1


    /**
     * Changes data for data to String "mm/dd/yyyy"
     * @return String - represents the data
     */
    public String toString()
    {
        return (month + "/" + day + "/" + year);
    }

    /**
     * Check if data is valid given the day, month, and year
     * @return boolean - data is valid
     */
    public boolean isLeap(int year)
    {
        // Return true if year is
        // a multiple of 4 and not
        // multiple of 100.
        // OR year is multiple of 400.
        return (((year % 4 == 0) &&
                (year % 100 != 0)) ||
                (year % 400 == 0));
    }
    public boolean isValid() {
        // check if date is valid
        int y = this.year;
        int m = this.month;
        int d = this.day;
        System.out.println(this.month + " " + this.year);
        // check if year is valid
        if (y > MAX_VALID_YR || y < MIN_VALID_YR)
            return false;
        if (m < 1 || m > 12)
            return false;
        if (d < 1 || d > 31)
            return false;

        // Handle February month
        // with leap year
        if (m == 2)
        {
            if (isLeap(y))
                return (d <= 29);
            else
                return (d <= 28);
        }


        if (m == 4 || m == 6 || m == 9 || m == 11)
            return (d <= 30);

        return true;

    }
}
