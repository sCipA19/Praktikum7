package MergeSortTest;
public class MergeSorting28 {
    public void mergeSort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    private void merge(int data[], int left, int middle, int right) {
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        // membandingkan setiap bagian
        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        // Menyalin sisa elemen dari array temp jika masih ada
        while (a <= middle) {
            data[c] = temp[a];
            a++;
            c++;
        }
    }

    private void sort(int data[], int left, int right ) {
        // membagi jadi 2 bagian dan dibagi lagi sampai tidak bisa dibagi
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
