package ADSA.sorting;

public class DivideAndConqurQuickSort {


    public static void quickSort(int[] A,int s, int e){
       if(s>=e)
        return;
       int pivot = fetchPosition(A,s,e);

       quickSort(A,s,pivot-1);

       quickSort(A,pivot+1,e);
    }

    public static int fetchPosition(int[] A, int lo,int hi){
       int pivotPosition = A[hi];
       int i=lo;
       int j=lo;
       while(j<hi){
           if(A[j]<pivotPosition){
               swap(A,i,j);
               i++;
           }
           j++;
       }
       swap(A,i,hi);
       return i;
    }


    //Using 2 pointer technique

    public static int[] towPointer(int[] A, int pivot){
        int N = A.length;
        int j=0;
        int i=0;
        while(j<N){
            if(A[j]<pivot){
                swap(A,i,j);
                i++;
            }
            j++;
        }
        return A;
    }

    public static void swap(int A[], int X,int y){
        int temp = A[X];
        A[X] = A[y];
        A[y] = temp;
    }

    public static void display(int[] A) {
        for(int i=0; i<A.length; i++){
            System.out.println(A[i]);
        }
    }

    public static void main(String[] args) {
        int[] A ={7,3,2,5,1,6,4};
//        towPointer(A,4);
        int e = A.length-1;
        quickSort(A,0,e);
        display(A);
    }


}
