import search.BinarySearch;
import sort.BobbleSort;
import sort.QuickSort;
import sort.SelectionSort;
import tree.Node;
import tree.Tree;

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

        QuickSort quickSort = new QuickSort();

        System.out.println(Arrays.toString(quickSort.sort(test, 0, test.length - 1)));


        String test1 = "01234567";

        String a = test1.substring(4, 8);
        String b = test1.substring(2, 4);
        System.out.println(a);
        System.out.println(b);


        System.out.println("\n Tree: \n ========");

        Tree tree = new Tree();

        tree.insert(3, "John");
        tree.insert(8, "T1000");
        tree.insert(1, "Sara");
        tree.insert(2, "T800");

        Node node = tree.search(3);

        node.printNode();

        tree.printTree(node);

        tree.printTree();

        System.out.println("privet");

    }
}
