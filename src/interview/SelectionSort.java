package interview;

public class SelectionSort {

   //It traverses the entire array
   //First index is set to minIndex
   //Compares with i+1 to n-1 and update the min index if the i+1 < minIndex
    //Traverse the entire array then swap the elements
    //TC: O(n^2)
   static int[] selectionSort(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n; i++){
            int minIndex = i;
            for(int j = i+1; j<n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

                //once the entire array is traversal is done then swap the elements by updating the array
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {5,6,4,2};
        int[] ans = selectionSort(A);
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
