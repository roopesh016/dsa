package ADSA.sorting;

public class MinAbsDifference {


    public static int[] split(int[] A, int s, int mid, int e){
        int[] ans = new int[e-s+1];
        int p1=s;
        int p2=mid+1;
        int k =0;


        while(p1<=mid && p2<=e){
            if(A[p1]<A[p2]){
                ans[k]=A[p1];
                p1++;
                k++;
            } else{
                ans[k]=A[p2];
                p2++;
                k++;
            }
        }

        while(p1<=mid){
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

    public static int[] mergeSort(int[] A,int s,int e){
        if(s==e) {
            int[] barr = new int[1];
            barr[0] = A[s];
            return barr;
        }

        int mid = (s+e)/2;
        mergeSort(A,s,mid);
        mergeSort(A,mid+1,e);

        return split(A,s,mid,e);
    }

    public static int  solve(int[] A) {
        int ans = Integer.MAX_VALUE;

        int N = A.length-1;

        int[] sortedArray = mergeSort(A,0,N);
        int newArray = sortedArray.length;

        for(int i=0; i<newArray; i++){
            if(i+1==newArray)
                break;
            else {
                int x = A[i+1]-A[i];
                ans = Math.min(x,ans);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {5,17,100,11};
        System.out.println(solve(A));
    }
}
