// Concrete builder for Office Computer
public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
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
        // Office computers might not have dedicated graphics card
        computer.setGraphicsCard("Integrated Graphics");
    }

    @Override
    public void buildOperatingSystem(String operatingSystem) {
        computer.setOperatingSystem(operatingSystem);
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
