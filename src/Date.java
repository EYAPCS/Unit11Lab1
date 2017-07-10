/**
 * Created by emma on 7/8/17.
 */
public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int newDay, int newMonth, int newYear) {
        setDay(newDay);
        setMonth(newMonth);
        setYear(newYear);
    }

    public void setDay(int newDay) {
        day = newDay;
    }

    public void setMonth(int newMonth) {
        month = newMonth;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

}
