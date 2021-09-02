package fun;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {7, 2, 3, 8, 99, 88, 22, 22};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(" , " + i);
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int part = partition(arr, start, end);
        System.out.println("start : " + start);
        System.out.println("end : " + end);
        System.out.println("part-1 : " + (part-1));
        quickSort(arr, start, part - 1);
        quickSort(arr, part + 1, end);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j<=end-1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, end);
        return i+1;
    }
}
