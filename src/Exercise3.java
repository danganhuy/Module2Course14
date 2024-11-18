import java.util.Arrays;

public class Exercise3 {
    // [Thực hành] Cài đặt thuật toán sắp xếp chọn
    public static void main(String[] args) {
        int[] arr =RandomNumber.generateArray(50, 1, 100);
        System.out.println(Arrays.toString(arr));
        SortingAlgorithms.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
