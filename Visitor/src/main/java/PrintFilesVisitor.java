import java.util.HashSet;
import java.util.List;
import java.util.Set;

// PrintFilesVisitor.java
public class PrintFilesVisitor implements FileSystemVisitor {
    private Set<String> visitedFiles = new HashSet<>();

    @Override
    public void visit(File file) {
        String fileName = file.getName();
        if (!visitedFiles.contains(fileName)) {
            System.out.println(fileName);
            visitedFiles.add(fileName);
        }
    }

    @Override
    public void visit(Directory directory) {
        List<FileSystemElement> elements = directory.getElements();
        for (FileSystemElement element : elements) {
            element.accept(this);
        }
    }
}
