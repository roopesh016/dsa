package interview;

public class InsertionSort {


    static int[] insertionSort(int arr[]){
        int n = arr.length;

        for(int i=1; i<n; i++){
            int currentElement = arr[i];
            int j = i-1;
            //traverse throw [i-1 .. 0]
            while(j>=0 && arr[j]>currentElement){
                arr[j+1]=arr[j];
                j = j-1;
            }
            arr[j+1] = currentElement;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {13, 12, 18, 2};
        insertionSort(A);
    }
}
