package baza.dom3;

//Реализовать алгоритм сортировки слиянием
public class MergeSort {

    public static void mergeSort(int[] arr, int n) {
        if (n < 2) {
            return;
        } else {
            int mid = n / 2;
            int[] leftArr = new int[mid];
            int[] rightArr = new int[n - mid];

            for (int i = 0; i < mid; i++) {
                leftArr[i] = arr[i];
            }
            for (int i = mid; i < n; i++) {
                rightArr[i - mid] = arr[i];
            }
            mergeSort(leftArr, mid);
            mergeSort(rightArr, n - mid);
            merge(arr, leftArr, rightArr, mid, n - mid);
        }
    }

    public static void merge(int[] arr, int[] leftArr, int[] rightArr, int leftLen, int rightLen) {
        int i = 0, j = 0, k = 0;
        while (i < leftLen && j < rightLen) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < leftLen) {
            arr[k++] = leftArr[i++];
        }
        while (j < rightLen) {
            arr[k++] = rightArr[j++];
        }
    }

    public static void maun() {
        int[] arr = {5, 4, 2, 1, 3};
        mergeSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


