package Sorting;

public class BubbleSort {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sorting(int[] arr) {
        int temp;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
