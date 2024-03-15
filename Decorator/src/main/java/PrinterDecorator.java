public class PrinterDecorator implements PrinterInterface{

    private PrinterInterface printer;

    public PrinterDecorator(PrinterInterface printer){
        this.printer = printer;
    }
    @Override
    public void print(String message) {
        printer.print(message);
    }
}
