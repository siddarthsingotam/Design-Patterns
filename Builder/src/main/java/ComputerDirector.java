import java.util.Scanner;

// ComputerDirector class
public class ComputerDirector {
    public void constructComputer(ComputerBuilder builder) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Processor:");
        String processor = scanner.nextLine();
        builder.buildProcessor(processor);

        System.out.println("Enter RAM size in GB:");
        int ramSizeGB = scanner.nextInt();
        builder.buildRAM(ramSizeGB);

        scanner.nextLine(); // Consume newline
        System.out.println("Enter Hard Drive:");
        String hardDrive = scanner.nextLine();
        builder.buildHardDrive(hardDrive);

        System.out.println("Enter Graphics Card:");
        String graphicsCard = scanner.nextLine();
        builder.buildGraphicsCard(graphicsCard);

        System.out.println("Enter Operating System:");
        String operatingSystem = scanner.nextLine();
        builder.buildOperatingSystem(operatingSystem);
    }
}
