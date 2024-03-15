public class EncryptedPrinter extends PrinterDecorator{
    public EncryptedPrinter(PrinterInterface printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        String encryptedMessage = encrypt(message);
        System.out.println("Printing encrypted message " + encryptedMessage);
        super.print(encryptedMessage);
    }

    private String encrypt(String message) {
        // Simple encryption algorithm (for demonstration purposes)
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            encrypted.append((char) (c + 1));
        }
        return encrypted.toString();
    }
}
