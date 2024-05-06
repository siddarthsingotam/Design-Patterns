package src.main.java;

public class GenerateCodeCommand implements Command {
    private int[][] gridState;

    public GenerateCodeCommand(int[][] gridState) {
        this.gridState = gridState;
    }

    @Override
    public void execute() {
        StringBuilder code = new StringBuilder("int[][] pixelArt = {\n");
        for (int y = 0; y < gridState.length; y++) {
            code.append("    {");
            for (int x = 0; x < gridState[y].length; x++) {
                code.append(gridState[x][y]);
                if (x < gridState[y].length - 1)
                    code.append(", ");
            }
            code.append("}");
            if (y < gridState.length - 1)
                code.append(",\n");
        }
        code.append("\n};\n");
        System.out.println(code.toString());
    }
}
