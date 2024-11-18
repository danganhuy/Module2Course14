import java.util.Scanner;

public class Exercise4 {
    // [Bài tập] Minh hoạ thuật toán sắp xếp chèn
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Unsorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("=== Begin Insertion Sort ===");
        insertionSort(arr);
        System.out.println("=== End Insertion Sort ===");

        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j-1] > arr[j]) {
                    System.out.println("Switch " + arr[j-1] + " with " + arr[j]);
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print("Array after " + i + " sort: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
