public class Exercise5 {
    // [Bài tập] Cài đặt thuật toán sắp xếp chèn
    public static void main(String[] args) {
        int[] arr = RandomNumber.generateArray(200, 0, 500);
        System.out.println("Unsorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        SortingAlgorithms.insertionSort(arr);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
