package src.main.java;

public class MoveCursorRightCommand implements Command {
    private PixelArtGrid grid;

    public MoveCursorRightCommand(PixelArtGrid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        grid.moveCursorRight();
    }
}

