package src.main.java;

public class MoveCursorUpCommand implements Command {
    private PixelArtGrid grid;

    public MoveCursorUpCommand(PixelArtGrid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        grid.moveCursorUp();
    }
}

