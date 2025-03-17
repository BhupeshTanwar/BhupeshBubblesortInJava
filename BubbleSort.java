package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        // process of the bubble sort is to compare the adjacent elements and swap them if they are in the wrong order.
        // The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        // time complexity of bubble sort is O(n^2)
        // space complexity of bubble sort is O(1)
        
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
