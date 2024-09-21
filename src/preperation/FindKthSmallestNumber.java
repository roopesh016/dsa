package preperation;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class FindKthSmallestNumber {

   public static int findSmallestElement(ArrayList<Integer> nums, int k){

       PriorityQueue<Integer> x = new PriorityQueue<>();
       x.addAll(nums);

       for(int i=0; i<k-1; i++){
            x.poll();
       }
       return x.peek();
   }


    public static void main(String[] args) {

    }
}
