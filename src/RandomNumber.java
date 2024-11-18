public class RandomNumber {
    public static int[] generateArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = min + (int) (Math.random() * (max - min)) + 1;
        }
        return array;
    }
}
