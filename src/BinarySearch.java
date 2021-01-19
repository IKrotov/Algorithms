public class BinarySearch {

    public int search(int[] inputArr, int x){
        int left =0;
        int right = inputArr.length-1;

        while (left<=right) {
            int index = (right + left) / 2;
            if (x > inputArr[index])
                left = index+1;
            else if(x < inputArr[index])
                right = index-1;
            else
                return index;
        }
        return -1;
    }

    public int recursionSearch(int[] inputArr, int x, int low, int high){

        if (low>=high){
            return -1;
        }
        int mid = (low + high) / 2;
        if (inputArr[mid] == x){
            return mid;
        }
        if (inputArr[mid] < x){
            return recursionSearch(inputArr, x, mid+1, high);
        }
        else {
            return recursionSearch(inputArr, x, low, mid - 1);
        }

    }
}
