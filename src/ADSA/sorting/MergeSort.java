package ADSA.sorting;

public class MergeSort {

    public static int[] mergIng(int[] A, int s, int m,int e){
        int[] ans = new int[e-s+1];

        int p1=s;
        int p2=m+1;
        int k =0;


        while(p1<=m && p2<=e){
            if(A[p1]<A[p2]){
                ans[k] = A[p1];
                p1++;
                k++;
            }else{
                ans[k] = A[p2];
                p2++;
                k++;
            }
        }

        while(p1<=m){
            ans[k]=A[p1];
            p1++;
            k++;
        }

        while(p2<=e){
            ans[k]=A[p2];
            p2++;
            k++;
        }

        for(int i=0; i<ans.length; i++){
            A[i+s] = ans[i];
        }
        return A;
    }


   static void mergeSort(int[] A, int s, int e) {
       if (s == e)
           return;

       int mid = (s + e) / 2;
       mergeSort(A, s, mid);
       mergeSort(A, mid + 1, e);

       int[] x = mergIng(A, s, mid, e);

       for (int i = 0; i < x.length; i++) {
           System.out.println(x[i]);
       }
   }


    public static void main(String[] args) {
        int[] A ={10,15,3,8,6,2,17,12,18};
        int s = 0;
        int e = A.length-1;
        mergeSort(A,s,e);
    }
}
