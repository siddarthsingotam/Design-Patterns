import java.util.Random;

public class Game {
    Map createMap() {
        Random rand = new Random();
        int randMap = rand.nextInt(2);

        switch (randMap) {
            case 0:
                return new CityMap();
            case 1:
                return new WildMap();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        Map map = game.createMap();
        map.display();
    }

}
