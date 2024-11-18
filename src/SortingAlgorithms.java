public class SortingAlgorithms {
    public static void bubbleSort(int[] array) {
        boolean needNextPass = true;
        for (int i = 0; i < array.length - 1 && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
