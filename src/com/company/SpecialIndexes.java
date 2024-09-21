package com.company;

public class SpecialIndexes {

    public static int solve(int[] a){
        int count =0;
        int n = a.length;
        long[] prefixEven = new long[n];
        long[] prefixOdd = new long[n];

        prefixEven[0]=a[0];
        for (int i = 1; i <= n-1; i++) {
            if(i%2==0){
                prefixEven[i] = prefixEven[i - 1] + a[i];
            } else {
                prefixEven[i]=prefixEven[i-1];
            }
        }
//        2, 1, 6, 4
        //2, 2, 8, 8


        prefixOdd[0] = 0;
        for (int i = 1; i <= n-1; i++) {
            if(i%2!=0){
                prefixOdd[i] = prefixOdd[i - 1] + a[i];
            } else {
                prefixOdd[i]=prefixOdd[i-1];
            }
        }

        //2, 3 ,3 , 7

        //sum of even integers = sum of even index values from L->0to R->n-1 + sum of od index values from L->n+1 to R->n-1
        //sum of odd integers = sum of odd index values from L->0to R->n-1 + sum of even index values from L->n+1 to R->n-1

        for(int i=0;i<=n-1;i++){

            //for every ith index the sum off odd would be prefixOdd[0->i-1] + prefixEven[i+1->n-1]
           long sumOfOddIntegers =  prefixEven[n-1] - prefixEven[i];
           if(i>0) {
               sumOfOddIntegers = sumOfOddIntegers + prefixOdd[i-1];
           }

            //for every ith index the sum off odd would be prefixEven[0->i-1] + prefixOdd[i+1->n-1]
           long sumOfEvenIntegers =  prefixOdd[n-1] - prefixOdd[i];
           if(i>0) {
               sumOfEvenIntegers = sumOfEvenIntegers+prefixEven[i-1];
           }

          if(sumOfEvenIntegers == sumOfOddIntegers){
              count++;
          }
        }
    return count;
    }


    public static void main(String[] args) {

//        int[] a ={2, 1, 6, 4};
        int[] a ={4 ,3, 2, 7, 6 , -2};
        System.out.println(solve(a));

    }




}
