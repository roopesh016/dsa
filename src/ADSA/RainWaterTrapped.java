package ADSA;

public class RainWaterTrapped {

    //int[] A = {4,2,5,7,4,2,3,6,8,2,3};
//       4,2,5,7,4,2,3,6,8,2,3
//Lmax = 4,4,5,7,7,7,7,7,8,8,8
//Rmax = 8,8,8,8,8,8,8,8,8,3,3
//min  = 4,4,5,7,7,7,7,7,8,3,3
//he   = 4,2,5,7,4,2,3,6,8,2,3
//water= 0+2+0+0+3+5+4+1+0+1+0 =16


    static int[] A = {4,2,5,7,4,2,3,6,8,2,3};
    static int[] leftMaxArray = new int[A.length];
    static int[] rightMaxArray = new int[A.length];
    public static int bruteForceApproach(int[] A){
         int n = A.length;
         findLMax(A);
         findRmax(A);
         int water =0;
          for(int i=1; i<n-1; i++){
             water+=Math.min(findLmaxValueEveryIndex(i),findRmaxValueEveryIndex(i))-A[i];
          }
          return water;
    }


    public static void findLMax(int A[]) {
        leftMaxArray[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            leftMaxArray[i] = Math.max(leftMaxArray[i - 1], A[i]);
        }
    }


    public static void findRmax(int A[]){
        rightMaxArray[A.length-1] = A[A.length-1];
        for(int i=A.length-2; i>=0; i--){
            rightMaxArray[i] = Math.max(rightMaxArray[i+1],A[i]);
        }
    }

    public static int findLmaxValueEveryIndex(int value){
        int leftMax =0;
        leftMax =  leftMaxArray[value];
        return leftMax;
    }

    public static int findRmaxValueEveryIndex(int value){
        int rightMax =0;
        rightMax = rightMaxArray[value];
        return rightMax;
    }


    //Optimised approach



    public static void main(String[] args) {
        System.out.println(bruteForceApproach(A));
    }
}
