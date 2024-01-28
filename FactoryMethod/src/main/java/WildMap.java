import java.util.Random;

public class WildMap extends Map{
    private final Tile[][] Tile = new Tile[10][10];

    Tile createTile(){
        Random rand = new Random();
        int randTile = rand.nextInt(3);

        switch (randTile) {
            case 0:
                return new SwampTile();
            case 1:
                return new ForestTile();
            case 2:
                return new WaterTile();
            default:
                return null;
        }
    }

    void display(){
        System.out.println("Wild Map");

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                Tile[i][j] = createTile();
                System.out.print(Tile[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
