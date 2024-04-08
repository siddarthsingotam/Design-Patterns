// Main class demonstrating the functionality of the adapter
public class Main {
    public static void main(String[] args) {
        // Creating an instance of CalendarToNewDateAdapter
        CalendarToNewDateAdapter adapter = new CalendarToNewDateAdapter();

        // Setting the date
        adapter.setYear(2024);
        adapter.setMonth(2);
        adapter.setDay(29);

        // Advancing the date by 5 days
        adapter.advanceDays(5);

        // Printing the new date
        // this should print 5th of March 2024
        System.out.println("New Date:");
        System.out.println("Year: " + adapter.getYear());
        System.out.println("Month: " + adapter.getMonth());
        System.out.println("Day: " + adapter.getDay());
    }
}
