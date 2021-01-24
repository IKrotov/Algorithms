package sort;

public class SelectionSort {

    public int[] sort(int[] inputArr){
        int operationCounter = 0;
        for (int i=0; i<inputArr.length; i++){
            int min = inputArr[i];
            for (int j=i; j<inputArr.length; j++){
                operationCounter++;
                if (inputArr[j] < min){
                    min = inputArr[j];
                }
            }
            inputArr[i] = min;
        }
        System.out.println(operationCounter);
        return inputArr;
    }
}
