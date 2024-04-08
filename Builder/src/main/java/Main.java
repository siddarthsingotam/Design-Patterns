import java.util.Scanner;

// Main class to demonstrate building different types of computers with UI
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComputerDirector director = new ComputerDirector();

        System.out.println("Select Computer Type:");
        System.out.println("1. Gaming Computer");
        System.out.println("2. Office Computer");
        int choice = scanner.nextInt();

        ComputerBuilder builder = null;
        if (choice == 1) {
            builder = new GamingComputerBuilder();
        } else if (choice == 2) {
            builder = new OfficeComputerBuilder();
        }

        if (builder != null) {
            director.constructComputer(builder);
            Computer computer = builder.getComputer();
            System.out.println("Final Computer Configuration:");
            System.out.println(computer);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}

