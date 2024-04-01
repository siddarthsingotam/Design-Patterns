// File class representing a file with attributes like name and size
public class File implements FileSystemElement {
    private String name;
    private double size; // in megabytes

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}

