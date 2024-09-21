package com.company;

public class IsAlnum {


    public static int solve(char[] A) {
       int n = A.length;
       int count =0;
        for(int i=0; i<n; i++){
            if ((A[i] >= 'A' && A[i]<='Z') || (A[i] >= 'a'&& A[i] <= 'z') || (A[i]>='0' && A[i]<='9')) {
                count = 1;
            } else{
                count =0;
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[] a = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        System.out.println(solve(a));
    }
}
