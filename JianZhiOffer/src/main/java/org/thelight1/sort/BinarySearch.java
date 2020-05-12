package org.thelight1.sort;

/**
 * 二分查找
 */
public class BinarySearch {

    public int binarySearch(int[] arr, int target) {
        if (arr == null) {
            return -1;
        }
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
               high = mid -1;
            } else {
               low = mid + 1;
            }
        }
        return -1;
    }
}
