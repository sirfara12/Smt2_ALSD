package PT7.Searching;

public class MergeSortMain28 {
    public static void main(String[] args) {
        int data[] ={10,40,30,50,70,20,100,90};
        System.out.println("sorting dengan merge sort");
        MergeSort28 mSort= new MergeSort28();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    }
}
