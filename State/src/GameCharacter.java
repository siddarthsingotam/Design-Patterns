import java.util.Scanner;

public class GameCharacter {
    private final String name;
    private int level = 0;
    private double health = 1.0;
    private double power = 0.0;

    private static Scanner scanner = new Scanner(System.in);

    private State state;

    public GameCharacter(String name) {
        this.name = name;
        // put our initial State here
        state = new NoviceState(this);
    }

    //Method to operate around states with a while loop to circle around them
    public void play() {
        while (state != null) {
            state.action();
        }
    }

    public void setState(State state) {
        this.state = state;
    }
    // Add or remove stats attributes
    public void addHealth(double amount){
        health += amount;
    }

    public void removeHealth(double amount){
        health -= amount;
    }

    public void addPower(double amount){
        power += amount;
    }


    public void addLevel(int amount){
        level += amount;
    }

    // Getters and Setters
    public void getStats(){
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
        System.out.println("Power: " + power);
    }

    public void clearStats() {
        level = 0;
        power = 0.0;
        health = 1.0;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    // Read user choices
    public int readUserChoice(String[] options) {
        // print options
        System.out.println("\nSelect an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i-1]);
        }
        // read user input
        return scanner.nextInt();
    }

    public void gameOver(){
        System.out.println("Game Over! <you will restart again/>");
    }

}
