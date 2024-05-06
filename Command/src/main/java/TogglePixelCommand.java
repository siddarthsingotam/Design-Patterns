package src.main.java;

public class TogglePixelCommand implements Command {
    private PixelArtGrid grid;

    public TogglePixelCommand(PixelArtGrid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        grid.togglePixel();
    }
}

