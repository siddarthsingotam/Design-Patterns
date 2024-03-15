public class CapitalizePrinter extends PrinterDecorator{
    public CapitalizePrinter(PrinterInterface printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        super.print(message.toUpperCase());
    }
}
