// Main.java
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] smallArray = generateRandomArray(30);
        int[] largeArray = generateRandomArray(100000);

        SortingStrategy bubbleSort = new BubbleSort();
        SortingStrategy insertionSort = new InsertionSort();
        SortingStrategy quickSort = new QuickSort();

        SortingContext context = new SortingContext(bubbleSort);

        long startTime = System.nanoTime();
        context.sortArray(smallArray);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Bubble Sort on small array: " + duration + " ms");

        context.setStrategy(insertionSort);
        startTime = System.nanoTime();
        context.sortArray(smallArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Insertion Sort on small array: " + duration + " ms");

        context.setStrategy(quickSort);
        startTime = System.nanoTime();
        context.sortArray(smallArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Quick Sort on small array: " + duration + " ms");

        context.setStrategy(bubbleSort);
        startTime = System.nanoTime();
        context.sortArray(largeArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Bubble Sort on large array: " + duration + " ms");

        context.setStrategy(insertionSort);
        startTime = System.nanoTime();
        context.sortArray(largeArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Insertion Sort on large array: " + duration + " ms");

        context.setStrategy(quickSort);
        startTime = System.nanoTime();
        context.sortArray(largeArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Quick Sort on large array: " + duration + " ms");
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }
}

