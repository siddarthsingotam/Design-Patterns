// Main.java
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Create and register observers
        WeatherObserver observer1 = new WeatherObserverImpl("Observer 1");
        WeatherObserver observer2 = new WeatherObserverImpl("Observer 2");
        weatherStation.registerObserver(observer1);
        weatherStation.registerObserver(observer2);

        // Start the weather station thread
        weatherStation.start();

        // Let the simulation run for a certain period
        try {
            TimeUnit.SECONDS.sleep(10); // Adjust the time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Remove one of the observers
        weatherStation.removeObserver(observer1);

        // Let the simulation continue
        try {
            TimeUnit.SECONDS.sleep(10); // Adjust the time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the weather station thread
        weatherStation.shutdown();
    }
}

