// Interface defining methods for setting and getting day, month, and year, and advancing days
public interface NewDateInterface {
    void setDay(int day);
    void setMonth(int month);
    void setYear(int year);
    int getDay();
    int getMonth();
    int getYear();
    void advanceDays(int days);
}
