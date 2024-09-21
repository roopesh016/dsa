package ADSA.FirstMissingInt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//Here we have to find the first missing positive natural integer/number
//Zero is a whole number
//if all the numbers are negative then return 1;
public class MissingInteger {

   //By using the below logic we are able to achieve it in o(n) but the space complexity would be o(n);
    public static int firstMissingPositiveUsingHashSet(ArrayList<Integer> A) {
        int ans =0;
        HashSet<Integer> hSet = new HashSet<>();
        for(int i=0; i<A.size(); i++){
            hSet.add(A.get(i));
        }

        for(int i=1;i<=A.size()+1; i++){
            if(hSet.contains(i)==false)
            {
                ans = i;
                break;
            }
        }
        return ans;
    }


    //Now we should return the value without taking any extra space
    //Idea -3 sort the array
        //Ignore the negative elements
        //start searching from 1 and increment the value
        //if we miss the immediate number then assign the missing number to answer and stop the execution
        //Here the time complexity is more hence we are using sorting logic here
   public static int usingSortLogic(ArrayList<Integer> A){
       Collections.sort(A);
       int value =1;
       for(int i=0; i<A.size(); i++){
           if(A.get(i)<1)
               continue;
           else{
               if(A.get(i)==value)
                   value++;
               else if(A.get(i)<value)
                   continue;
               else
                   break;
           }

       }
       return value;
   }


   //Correct answer should be done in o(n) in both space and time complexity
    public static int firstMissingPositive(int[] A) {
        int n = A.length;
        int i = 0;
        while (i < n) {
            if (A[i] >= 1 && A[i] <= n) {
                int correctIndex = A[i] - 1;
                if (A[correctIndex] != A[i]) {
                    int temp = A[correctIndex];
                    A[correctIndex] = A[i];
                    A[i] = temp;
                } else {
                    i++;
                }
            }else{
                i++;
            }
        }

        for(int k=0; k<n; k++){
            if(A[k]!=k+1) return k+1;
        }
        return n+1;
    }



    public static void main(String[] args) {
//        ArrayList<Integer> A = new ArrayList<>();
//        A.add(-8);
//        A.add(-7);
//        A.add(-6);
//        System.out.println(usingSortLogic(A));
        int[] A = {2,4,1,2,-10,7};
        System.out.println(firstMissingPositive(A));
    }

}
