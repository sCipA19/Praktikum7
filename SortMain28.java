package MergeSortTest;

public class SortMain28 {
    public static void main(String[] args) {
        int data[] ={10, 40,30, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan merge sort");
        MergeSorting28 mSort= new MergeSorting28();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah diurutkan");
        mSort.printArray(data);
    }
    
}
