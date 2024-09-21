package ADSA.sorting;

public class InversionPairCount {

    public static int bruteForceApproach(int[] A){
        int N = A.length;
        int count =0;
        for(int i = 0; i<N; i++){
            for(int j = i+1; j<N; j++){
                if(A[i]>A[j])
                    count++;
            }
        }
        return count;
    }

    static long value =0;
    public static int[] mergeIng(int[] A, int s,int mid, int e){
        int[] ans = new int[e-s+1];

        int p1=s;
        int p2=mid+1;
        int k =0;

        while(p1<=mid && p2<=e){
            if(A[p1]<=A[p2]){
                ans[k] = A[p1];
                p1++;
                k++;
            }else{
                ans[k] = A[p2];
                p2++;
                k++;
                value+=mid-p1+1;
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
        return ans;
    }

    public static int[] merg(int []A, int s, int e){
        if(s==e) {
            int[] barr = new int[1];
            barr[0] = A[s];
            return barr;
        }

        int mid = (s+e)/2;
        merg(A,s,mid);
        merg(A,mid+1,e);

        return mergeIng(A,s,mid,e);
    }


    public static int inversionPairCount(int[] A){
        int n = A.length;
        merg(A, 0, n - 1);
        return (int) value;
    }

    public static void main(String[] args) {
        int[] A = {10,5,3,8,6,2,17,12,18};
        System.out.println(inversionPairCount(A));
    }
}
