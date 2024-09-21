package binarysearch;

public class FindMinTimeRequire {

    static Painters painters = new Painters();

    public static int minTime(int[] A, int p,int units){
         int totalLengthOfBoards = sumOfAllTheBoards(A);
         int hi = totalLengthOfBoards*units;
         int maxSizeOfTheBoard = fetchMaxOfAllTheBoards(A);
         int low = maxSizeOfTheBoard*units;
         int ans = -1;
         while(low<=hi){
             int mid = (low+hi)/2;

             int numOfPaintersRequired = painters.requiredNumberOfPainters(A,units,mid);

             if(numOfPaintersRequired<=p){
                 ans = mid;
                 hi = mid-1;
             }else{
                 low =mid+1;
             }
         }
         return ans;
    }

    public static int sumOfAllTheBoards(int[] A){
        int sum =0;
        for(int i=0; i<A.length; i++){
            sum+=A[i];
        }
        return sum;
    }

    public static int fetchMaxOfAllTheBoards(int[] A){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<A.length; i++){
            if(A[i]>max)
                max = A[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = {1000000,1000000};
        System.out.println(minTime(A,1,1000000));
    }
}
