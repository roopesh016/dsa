package com.company;

public class FindArrayUsingLinearSearch {

    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int K = 3;

        for(int i=0;i<=arr.length-1;i++){
            if(K==arr[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
