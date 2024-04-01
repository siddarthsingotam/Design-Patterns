
// FileSystemVisitor interface with visit methods for files and directories
public interface FileSystemVisitor {
    void visit(File file);
    void visit(Directory directory);
}
