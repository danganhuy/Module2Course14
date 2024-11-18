import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr =RandomNumber.generateArray(50, 1, 100);
        System.out.println(Arrays.toString(arr));
        SortingAlgorithms.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
