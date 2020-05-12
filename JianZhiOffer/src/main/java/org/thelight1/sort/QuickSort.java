package org.thelight1.sort;

/**
 * 快速排序
 */
public class QuickSort {

    public void sort(int[] arr, int n) {
        mergeSort(arr, 0, n - 1);
    }

    public void mergeSort(int[] arr, int low, int high) {
       if (low < high)  {
           int pivot = partition(arr, low ,high);
           mergeSort(arr, low ,pivot - 1);
           mergeSort(arr, pivot + 1, high);
       }
    }

    private int partition(int[] arr, int low, int high) {
       int pivot = arr[low];

       while (low < high) {
           while (low < high && arr[high] > pivot) {
              high--;
           }
           if (low < high) {
               arr[low++] = arr[high];
           }
           while (low < high && arr[low] < pivot) {
              low++;
           }
           if (low < high) {
               arr[high--] = arr[low];
           }
       }
       arr[low] = pivot;
       return low;
    }
}
