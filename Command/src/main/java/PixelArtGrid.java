package src.main.java;

import javafx.scene.layout.GridPane;

public class PixelArtGrid extends GridPane {
    private final int size;
    private Pixel[][] pixels;
    private int cursorX;
    private int cursorY;

    public PixelArtGrid(int size) {
        this.size = size;
        pixels = new Pixel[size][size];
        cursorX = 0;
        cursorY = 0;

        initializeGrid();
        updateGrid();
    }

    private void initializeGrid() {
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                Pixel pixel = new Pixel();
                pixels[x][y] = pixel;
                add(pixel, x, y);
            }
        }
    }

    public void moveCursorUp() {
        if (cursorY > 0)
            cursorY--;
        updateGrid();
    }

    public void moveCursorDown() {
        if (cursorY < size - 1)
            cursorY++;
        updateGrid();
    }

    public void moveCursorLeft() {
        if (cursorX > 0)
            cursorX--;
        updateGrid();
    }

    public void moveCursorRight() {
        if (cursorX < size - 1)
            cursorX++;
        updateGrid();
    }

    public void togglePixel() {
        pixels[cursorX][cursorY].toggle();
    }

    private void updateGrid() {
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                pixels[x][y].setActive(x == cursorX && y == cursorY);
            }
        }
    }

    public int[][] getGridState() {
        int[][] state = new int[size][size];
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                state[x][y] = pixels[x][y].isActive() ? 1 : 0;
            }
        }
        return state;
    }
}

