package src.main.java;


public class MoveCursorDownCommand implements Command {
    private PixelArtGrid grid;

    public MoveCursorDownCommand(PixelArtGrid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        grid.moveCursorDown();
    }
}

