import java.util.Iterator;

// Main class demonstrates the functionality of the Fibonacci sequence generator.
public class Main {
    public static void main(String[] args) {
        // Creating a FibonacciSequence object
        FibonacciSequence fibonacciSequence = new FibonacciSequence();

        // Demonstrating the use of the Fibonacci sequence generator
        // For now I'm printing 10 numbers in the sequence.
        Iterator<Integer> iterator = fibonacciSequence.iterator();
        for (int i = 0; i < 10; i++) {
            System.out.print(iterator.next() + " ");
        }
    }
}
