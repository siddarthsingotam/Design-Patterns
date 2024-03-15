public class Main {
    public static void main(String[] args) {
        PrinterInterface printer;

//        // let basic printer print
//        printer = new BasicPrinter();
//        printer.print("Hello Sid!");

        // let basic printer now use file name
        printer = new FilePrinter(new BasicPrinter());
        printer.print("Hello Sid2!");


    }
}
