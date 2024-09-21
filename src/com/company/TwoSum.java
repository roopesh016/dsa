package com.company;

public class TwoSum {
   //Input: nums = [2,7,11,15], target = 9
    static int arr[] = {3,2,4};
    static int target = 6;

    public static void checkForTheSum(int[] c1, int target){
        //start the iteration
        //check the condition with the indexes sum value
        for(int i=0;i<=c1.length-1;i++){
            if(c1[i]+c1[i+1]==target){
                int secondIndex = i+1;
                System.out.println("this are the following indexes:"+i +","+secondIndex);
                break;
            }
        }
    }


    public static void main(String[] args) {
        checkForTheSum(arr,target);
    }
}
