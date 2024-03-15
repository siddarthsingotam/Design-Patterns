import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class FilePrinter extends PrinterDecorator{
    String FILENAME = "output.txt";
    String FILE_PATH = "src/main/java";
    public FilePrinter(PrinterInterface printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        super.print(message);
        String filepath = FILE_PATH + File.separator + FILENAME;
        try (FileWriter writer = new FileWriter(filepath)){
            writer.write(message);
            System.out.println("Successfully created the file in the module.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

//    private void recordMessageToFile(String message) {
//        String filepath2 = FILE_PATH + File.separator + FILENAME;
//        try (FileWriter writer = new FileWriter(filepath2)){
//            writer.write(message);
//            System.out.println("Successfully created the file in the module.");
//        } catch (IOException e) {
//            System.out.println("Error writing to file: " + e.getMessage());
//            throw new RuntimeException(e);
//        }
//    }
}
