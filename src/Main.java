import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] test = {1, 5, 2, 7, 3, 11, 10, 3, 8, 0};
        BobbleSort bobbleSort = new BobbleSort();
        System.out.println(Arrays.toString(bobbleSort.sort(test)));
        System.out.println(Arrays.toString(bobbleSort.modifySort(test)));

        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.sort(test)));

        int[] testSorted = bobbleSort.sort(test);

        BinarySearch binarySearch = new BinarySearch();

        System.out.println(binarySearch.search(testSorted, 6));

        System.out.println(binarySearch.recursionSearch(testSorted, 10, 0, testSorted.length));
    }
}
