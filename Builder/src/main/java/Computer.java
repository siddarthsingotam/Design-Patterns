public class Computer {
    private String processor;
    private int ramGB;
    private String storageGB;
    private String graphicsCard;
    private String operatingSystem;

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public void setStorageGB(String storageGB) {
        this.storageGB = storageGB;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ramGB=" + ramGB +
                ", storageGB='" + storageGB + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}

