public class BubbleSort implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1; j++){
                if (array[j] > array[j+1]){
                    int bigger = array[j];
                    array[j+1] = bigger; // Swapping the values here, basically bigger value gets shifted to right.
                    array[j] = array[j+1];
                }
            }
        }
    }
}
