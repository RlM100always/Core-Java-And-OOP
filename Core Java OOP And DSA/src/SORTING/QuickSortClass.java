package SORTING;

import java.util.Scanner;

public class QuickSortClass {

    public static int partition(int arr[], int l, int r) {
        int pivot = arr[l];
        int i = l, j = r;

        while (i < j) {
            while (arr[i] <= pivot ) {
                i++;
            }
            while (arr[j] > pivot ) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[l] = arr[j];
        arr[j] = pivot;
        return j;
    }

    public static void quickSort(int arr[], int l, int r) {
        if (l < r) {
            int pivotIdx = partition(arr, l, r);
            quickSort(arr, l, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, r);
        }
    }

    public static void printArray(int arr[], int size) {
        System.out.println("After quick sorting:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        quickSort(arr, 0, size - 1);
        printArray(arr, size);
    }
}
