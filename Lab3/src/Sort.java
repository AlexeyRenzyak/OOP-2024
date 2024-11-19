import java.sql.Array;

;

public class Sort {

    public static <E> void swap(E [] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static <E extends Comparable<E>> void bubbleSort(E[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }


    public static <E extends Comparable<E>> void insertionSort(E[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            E key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
