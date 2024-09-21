package com.company;

import java.util.Arrays;
import java.util.Scanner;
//Input:
//        N = 5
//        A[] = {1,2,3,5}
//        Output: 4
public class MissingNumber {

    public static void missingNumbers(){
        int[] i = {8,12,25,16,36,99};

      for(int x=0;x<=i.length-1;x++){
        for(int c=1;c<=100;c++){
                if(c!=i[x]) {
                    System.out.println(c);
                }
            }
        }

    }

    public static void missingSeqNumbers(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];

        for(int i =0;i<=size-1; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        for(int j=1;j<=a.length-1;j++){
            if(a[0]+a[j] != a[j+1]){
                int missingNumber  = a[0]+a[j];
                System.out.println("missing number is:"+ missingNumber);
                break;
            }
        }
    }

    public static void findDuplicateValue(){
        int [] x={1, 2, 3, 4, 2, 7, 8, 8, 3};
        for(int i=0;i<=x.length-1;i++){
            for(int j=i+1;j<=x.length-1;j++){
                if(x[i]==x[j]){
                    System.out.println("This is the duplicate number:"+x[i]);
                }
            }
        }
    }


    public static void sumEqual(){
        int [] x={ 1, 5, 7, -1, 5 };
        int K = 6;
        int count = 0;

        for(int i=0;i<=x.length-1;i++){
            for(int j=i+1; j<=x.length-1; j++){
                if(x[i]+x[j]==K){
                    count++;
                }
            }
        }
        System.out.println(count);
    }



    public static void main(String[] args) {
//        missingNumbers();
        sumEqual();

//        int[] a={1, 2, 3, 4, 6, 7, 9, 8, 10};
//
//        Arrays.sort(a);
//        int firstIndex = a[0];
//        for(int k=1;k<=a.length-1;k++) {
//            if(firstIndex+a[k]!=a[k+1]){
//                int missingNumber = firstIndex+a[k];
//                System.out.println("The Missing number is:"+missingNumber);
//                break;
//            }
//        }
 }
}
