package src.main.java;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Pixel extends Pane {
    private static final int PIXEL_SIZE = 20;
    private Rectangle square;
    private boolean active;

    public Pixel() {
        square = new Rectangle(PIXEL_SIZE, PIXEL_SIZE);
        square.setFill(Color.WHITE);
        square.setStroke(Color.BLACK);
        getChildren().add(square);
        setActive(false);
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
        square.setFill(active ? Color.BLACK : Color.WHITE);
    }

    public void toggle() {
        setActive(!active);
    }
}


