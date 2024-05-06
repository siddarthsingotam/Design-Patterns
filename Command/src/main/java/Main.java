package src.main.java;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    private final int GRID_SIZE = 8;
    private PixelArtGrid grid;
    private CommandInvoker invoker;

    @Override
    public void start(Stage primaryStage) {
        grid = new PixelArtGrid(GRID_SIZE);
        invoker = new CommandInvoker();

        GridPane root = new GridPane();
        root.add(grid, 0, 0);

        Button createCodeButton = new Button("Create Code");
        createCodeButton.setOnAction(event -> {
            GenerateCodeCommand command = new GenerateCodeCommand(grid.getGridState());
            invoker.execute(command);
        });
        root.add(createCodeButton, 0, 1);

        Scene scene = new Scene(root);
        primaryStage.setTitle("Pixel Art Editor");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Bind keyboard events to commands
        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case UP:
                    invoker.execute(new MoveCursorUpCommand(grid));
                    break;
                case DOWN:
                    invoker.execute(new MoveCursorDownCommand(grid));
                    break;
                case LEFT:
                    invoker.execute(new MoveCursorLeftCommand(grid));
                    break;
                case RIGHT:
                    invoker.execute(new MoveCursorRightCommand(grid));
                    break;
                case SPACE:
                    invoker.execute(new TogglePixelCommand(grid));
                    break;
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}

