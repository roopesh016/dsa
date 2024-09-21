package com.company;

public class RemoveElements {

//    Input: nums = [3,2,2,3], val = 3
//    Output: 2, nums = [2,2,_,_]
//    Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//    It does not matter what you leave beyond the returned k (hence they are underscores).

    static int arr[] = {3,2,2,3};
    static int remove = 3;
    static int newArr[] = new int[arr.length-1];

    public static void removeElements(int[] c1, int remove){
       for(int i=0;i<=c1.length-1;i++){
           if(arr[i]!=remove){
               newArr[i]=arr[i];
           }
       }
        for(int j=0;j<= newArr.length-1;j++){
            System.out.println(newArr[j]);
        }
    }
    public static void main(String[] args) {
        removeElements(arr,remove);
    }
}
