import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] test = {1, 5, 2, 7, 3, 11, 10, 3, 8, 0};
        BobbleSort bobbleSort = new BobbleSort();
        System.out.println(Arrays.toString(bobbleSort.sort(test)));
        System.out.println(Arrays.toString(bobbleSort.modifySort(test)));

        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.sort(test)));
    }
}
