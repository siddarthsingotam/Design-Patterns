
import java.util.ArrayList;
import java.util.List;

// SearchVisitor traverses the file system and accumulates files that match a specified criterion
public class SearchVisitor implements FileSystemVisitor {
    private List<File> foundFiles;
    private String searchCriteria;

    public SearchVisitor(String searchCriteria) {
        this.searchCriteria = searchCriteria;
        foundFiles = new ArrayList<>();
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(searchCriteria)) {
            foundFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        // No action needed for directories in this visitor
    }

    public List<File> getFoundFiles() {
        return foundFiles;
    }
}
