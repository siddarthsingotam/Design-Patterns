
// FileSystemElement interface acting as a base for files and directories
public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}
