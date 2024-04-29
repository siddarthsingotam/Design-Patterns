import java.util.Iterator;

// FibonacciSequence class implements the Sequence interface
// and generates Fibonacci numbers on demand.
public class FibonacciSequence implements Sequence {
    // FibonacciIterator class handles the logic for iterating over the Fibonacci sequence.
    private class FibonacciIterator implements Iterator<Integer> {
        private int previous = 0;
        private int current = 1;
        private int count = 0;

        // Checks if there are more elements in the sequence.
        public boolean hasNext() {
            return true; // Infinite sequence
        }

        // Generates the next Fibonacci number in the sequence.
        public Integer next() {
            int next = previous + current;
            previous = current;
            current = next;
            count++;
            return previous;
        }
    }

    // Generates a FibonacciIterator when requested.
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }
}

