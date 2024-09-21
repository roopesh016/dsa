package probs;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinMaxOfSubarray {

   public static int subArrayMinMax(int[] A){
       //find all the sub arrays and figure out the min and max then do subtraction and add it
       if(A.length == 1)
           return 0;

       int ans =0;
       for(int i=0; i<A.length; i++){
           for(int j=i; j<A.length; j++){
               int st =i; int end = j;
               int maxe =Integer.MIN_VALUE ;
               int mine =Integer.MAX_VALUE ;
               for(int k = st; k <=end; k++){
                     maxe = Math.max(maxe, A[k]);
                     mine = Math.min(mine,A[k]);
               }
               int diff = maxe - mine;
               ans+=diff;
           }
       }
       return ans;
   }



    public static void main(String[] args) {
       int[] A = {2,5,3};
        System.out.println(subArrayMinMax(A));
    }
}
