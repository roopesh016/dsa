package com.company;

import java.util.Scanner;

//Input: array[] = {10, 20, 15, 2, 23, 90, 67}
//        Output: 20 or 90
           //a[0]
//        Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.

public class PeakValue {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int a[] = new int[size];

        for(int i=0;i<=size-1;i++){
            a[i] = sc.nextInt();
        }

        for(int j=0;j<=a.length-1;j++){
            if((a[j]<a[j+1])&&(a[j+1]>a[j+2])){
                System.out.println("The peak value:"+a[j+1]);
                if (j+2 == a.length-1)
                break;
            }
        }
    }
}
