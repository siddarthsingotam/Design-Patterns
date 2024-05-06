package src.main.java;

public class MoveCursorLeftCommand implements Command {
    private PixelArtGrid grid;

    public MoveCursorLeftCommand(PixelArtGrid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        grid.moveCursorLeft();
    }
}

