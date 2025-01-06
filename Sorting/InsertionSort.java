package Sorting;

public class InsertionSort {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sorting(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 5, 3, 2, 7, 9, 1, 6 };
        System.out.println("Before Sorting:");
        print(arr);
        sorting(arr);
        System.out.println("After Sorting:");
        print(arr);
    }
}
