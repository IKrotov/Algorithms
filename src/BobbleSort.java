public class BoubbleSort {

    public int[] sort(int[] inputArr){

        for (int i = 0; i<inputArr.length; i++){
            for (int j=i; j<inputArr.length-1; j++){
                if (inputArr[j]<inputArr[j+1]){
                    int temp = inputArr[j];
                    inputArr[j] = inputArr[j+1];
                    inputArr[j+1] = temp;
                }
            }
        }
        return inputArr;
    }
}
