import java.util.Random;

public class CityMap extends Map {
    private final Tile[][] mapGrid = new Tile[10][10];
    Tile createTile() {
        Random rand = new Random();
        int randTile = rand.nextInt(3);

        switch (randTile) {
            case 0:
                return new RoadTile();
            case 1:
                return new ForestTile();
            case 2:
                return new BuildingTile();
            default:
                return null;
        }
    }

    @Override
    void display() {
        System.out.println("City Map");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mapGrid[i][j] = createTile();
                System.out.print(mapGrid[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
