public class BasicPrinter implements PrinterInterface{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
