
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class WeatherStation extends Thread {
    private List<WeatherObserver> observers;
    private int temperature;
    private boolean running;
    private final int MAX_TEMPERATURE = 40;
    private final int MIN_TEMPERATURE = -10;

    public WeatherStation() {
        this.observers = new ArrayList<>();
        this.temperature = generateRandomTemperature();
        this.running = false;
    }

    @Override
    public void run() {
        running = true;
        while (running) {
            updateTemperature();
            notifyObservers();
            try {
                TimeUnit.SECONDS.sleep(generateRandomInterval());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;
    }

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }

    private void updateTemperature() {
        // Simulate temperature change
        temperature += new Random().nextBoolean() ? 1 : -1;
        // Ensure temperature stays within bounds
        temperature = Math.min(MAX_TEMPERATURE, Math.max(MIN_TEMPERATURE, temperature));
    }

    private int generateRandomTemperature() {
        return new Random().nextInt(MAX_TEMPERATURE - MIN_TEMPERATURE + 1) + MIN_TEMPERATURE;
    }

    private int generateRandomInterval() {
        return new Random().nextInt(5) + 1; // Random interval between 1 and 5 seconds
    }
}
