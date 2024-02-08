
public class WeatherObserverImpl implements WeatherObserver {
    private String name;

    public WeatherObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println(name + " - Current temperature: " + temperature);
        // Add custom behavior for each observer if needed
    }
}

