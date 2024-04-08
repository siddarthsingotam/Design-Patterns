// Concrete builder for Gaming Computer
public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor(String processor) {
        computer.setProcessor(processor);
    }

    @Override
    public void buildRAM(int sizeGB) {
        computer.setRamGB(sizeGB);
    }

    @Override
    public void buildHardDrive(String hardDrive) {
        computer.setStorageGB(hardDrive);
    }

    @Override
    public void buildGraphicsCard(String graphicsCard) {
        computer.setGraphicsCard(graphicsCard);
    }

    @Override
    public void buildOperatingSystem(String operatingSystem) {
        computer.setOperatingSystem(operatingSystem);
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

    // Special features
    public void addRGB(String lights) {

    }
}
