package sort;

public class BobbleSort{

    public int[] sort(int[] inputArr){

        int operationCounter = 0;

        for (int i = 0; i<inputArr.length; i++){
            for (int j=inputArr.length-1; j>i; j--){
                operationCounter++;
                if (inputArr[j]<inputArr[j-1]){
                    int temp = inputArr[j];
                    inputArr[j] = inputArr[j-1];
                    inputArr[j-1] = temp;
                }
            }
        }
        System.out.println(operationCounter);
        return inputArr;
    }

    public int[] modifySort(int[] inputArr){

        boolean isSorted = false;
        int index = 0;
        int operationCounter = 0;
        while (!isSorted){
            isSorted = true;
            for (int i=inputArr.length-1; i>index; i--){
                operationCounter++;
                if (inputArr[i] < inputArr[i-1]) {
                    isSorted = false;
                    int temp = inputArr[i];
                    inputArr[i] = inputArr[i-1];
                    inputArr[i-1] = temp;
                }

            }
        }
        System.out.println(operationCounter);
        return inputArr;
    }

}
