package sort;

public class QuickSort {

    public int[] sort(int[] inputArr, int low, int high){

        if(inputArr.length == 0){
            return inputArr;
        }

        if (low >= high){
            return inputArr;
        }

        int middle = low + (high-low)/2;
        int border = inputArr[middle];

        int i = low;
        int j = high;
        while (i<=j) {

            while (inputArr[i] < border) {
                i++;
            }

            while (inputArr[j] > border){
                j--;
            }

            if (i <= j){
                int temp = inputArr[i];
                inputArr[i] = inputArr[j];
                inputArr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j){
             sort(inputArr, low, j);
        }

        if (high > i){
             sort(inputArr, i, high);
        }

        return inputArr;

    }
}
