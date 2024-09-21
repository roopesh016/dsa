package com.company;

public class PrefixArray {

    //with this logic the time complexity is O(Q+N)
    public static int fetchSum(int[] arr, int startPosition,int endPosition) {
        int sum =0;
       for(int i=startPosition; i <=endPosition; i++){
          sum += arr[i];
       }
       return sum;
    }

    //To over come the above part let's do the prefix sum
    //{-3,6,2,4,5,2,8,-9,3,1}
    //{-3,3,5,9,14,16,24,15,18,19}
    //  0,1,2,3,4,5,6,7,8,9
    public static int fetchPrefixSum(int[] arr, int startPosition,int endPosition){
        int sum =0;
        //prefix logic;
        //arrLong[0] = arr[0];
        //arrLong[1] = arrLong[0]+arr[1];
        //arrLong[2] = arrLong[1]+arr[2];
        //arrLong[3] = arrLong[2]+arr[3];

        long[] arrLong = new long[arr.length];

        for(int i=0;i<=arr.length-1;i++){
            if(i==0){
                arrLong[i] = arr[i];
            } else {
                arrLong[i] = arrLong[i-1]+arr[i];
            }
        }

        if(startPosition ==0){
            sum+=arrLong[endPosition];
        }else{
            sum+= arrLong[endPosition]-arrLong[startPosition-1];
        }
        return sum;
    }

    //here the sapce complexity is o(n)
    //{-3,6,2,4,5,2,8,-9,3,1}
    //{-3,3,5,9,14,16,24,15,18,19}
    public static void fetchPrefixSumWithMinSpace(int[] arr,int[][] sE) {

        //prefix logic;
        //arr[1] -> 6 -> 3
  

        for(int i=1;i<=arr.length-1;i++){
            arr[i] = arr[i-1]+arr[i];
        }

        for(int i=0;i<=sE.length-1; i++){
            int sum =0;
            int L = sE[i][0];
            int R = sE[i][1];
            if(L ==0){
                sum+=arr[R];
                System.out.println(sum);
            }else{
                sum+= arr[R]-arr[L-1];
                System.out.println(sum);
            }
        }
    }






    public static void main(String[] args) {
       int[] arr={-3,6,2,4,5,2,8,-9,3,1};

       int[][] sE = new int[5][2];
       sE[0][0] = 4;
       sE[0][1] = 8;
       sE[1][0] = 3;
       sE[1][1] = 7;
       sE[2][0] = 1;
       sE[2][1] = 3;
       sE[3][0] = 0;
       sE[3][1] = 4;
       sE[4][0] = 7;
       sE[4][1] = 7;
//        for(int i=0;i<=sE.length-1;i++){
//            System.out.println("The sum of first index: "+i+" ="+fetchSum(arr,sE[i][0],sE[i][1]));
//        }

//        for(int i=0;i<=sE.length-1;i++) {
//            System.out.println("The sum of first index: "+i+" ="+fetchPrefixSum(arr,sE[i][0],sE[i][1]));
//        }
//
        fetchPrefixSumWithMinSpace(arr,sE);


    }
}
