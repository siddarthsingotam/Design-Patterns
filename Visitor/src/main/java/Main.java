import java.util.List;

// Main class demonstrating the usage scenario
public class Main {
    public static void main(String[] args) {
        // Create a directory structure
        Directory root = new Directory("Root");
        Directory documents = new Directory("Documents");
        Directory pictures = new Directory("Pictures");

        File file1 = new File("document1.txt", 5.0);
        File file2 = new File("document2.txt", 3.0);
        File file3 = new File("image1.jpg", 2.5);
        File file4 = new File("image2.png", 1.5);

        documents.addElement(file1);
        documents.addElement(file2);
        pictures.addElement(file3);
        pictures.addElement(file4);

        root.addElement(documents);
        root.addElement(pictures);

        // Apply visitors to the directory structure
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);

        // Printing the sizes of all the files in sizeVisitor
        System.out.println("Total size of all files: " + sizeVisitor.getTotalSize() + " MB");

        // searchVisitor1 finds only files with .txt extension for example.
        SearchVisitor searchVisitor1 = new SearchVisitor(".txt");
        root.accept(searchVisitor1);

        List<File> txtFiles = searchVisitor1.getFoundFiles();
        System.out.println("Files with '.txt' extension:");
        for (File file : txtFiles) {
            System.out.println(file.getName());
        }

        // OR we can print all file in the directory
        System.out.println();
        System.out.println("Files in the root directory:");
        PrintFilesVisitor printFilesVisitor = new PrintFilesVisitor();
        root.accept(printFilesVisitor);

    }
}
