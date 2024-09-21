package interview;

public class FindSecondLargestArray {

    //Sort the array in desc order and then fetch the second value
    //can approach count sort if the numbers are smaller like single digits
    //Or can opt in for other sortings

    //first can be approached using count sort if the numbers are small
    //[2, 1, 2]

    //Second can be approached in differnet way where we can reduce the time complexity


    public static int findMax(int[] A){
        int n = A.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(A[i],max);
        }
        return max;
    }

    public static int findSecondLarge(int[] A){
        int max = findMax(A);
        int[] count = new int[max+1];
        for(int i=0; i<A.length; i++){
            count[A[i]]++;
        }

        int index =0;
        for(int i=0; i<A.length; i++){
            while(count[i]-- >0){
                A[index++]=i;
            }
        }

       return A[A.length-2];
    }


    public static void main(String[] args) {
        int [] A = {2,1,2};
        System.out.println(findSecondLarge(A));
    }
}
