package probs;

import java.util.ArrayList;
import java.util.Stack;

public class Histogram {
    //for every index find the nearest smaller on the right
    //for every index find the nearest smaller on the left

    public static ArrayList<Integer> findNearestSmallerOnTheRight(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> sT = new Stack<>();
        int n = A.size();

        for(int k=0; k<A.size(); k++){
            ans.add(n);
        }

        for(int i=A.size()-1; i>=0; i--){
           while(sT.size()>0 && A.get(sT.peek())>=A.get(i)){
               sT.pop();
           }
            if(sT.size()==0){
                ans.set(i,n);
                sT.push(i);
            }else{
                ans.set(i,sT.peek());
                sT.push(i);
            }
        }
        return ans;
    }

    public static ArrayList<Integer> findNearestSmallerOnTheLeft(ArrayList<Integer> A){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> sT = new Stack<>();
        int n = A.size();
        for(int i=0; i<A.size(); i++){
            while(sT.size()>0 && A.get(sT.peek())>=A.get(i)){
                sT.pop();
            }

            if(sT.size()==0){
                ans.add(n);
                sT.push(i);
            }else{
                ans.add(sT.peek());
                sT.push(i);
            }
        }
        return ans;
    }

    public static int largestRectangleArea(ArrayList<Integer> A) {
        if(A.size()==1)
            return A.get(0);

        ArrayList<Integer> nearestSmallOnLeft =  findNearestSmallerOnTheLeft(A);
        ArrayList<Integer> nearestSmallOnRight=  findNearestSmallerOnTheRight(A);
        int ans = Integer.MIN_VALUE;
        for(int i=0 ; i<A.size(); i++){
            int height = A.get(i);
            int p1 = nearestSmallOnLeft.get(i);
            int p2 = nearestSmallOnRight.get(i);
            int area = height*(p2-p1-1);
            ans = Math.max(ans,area);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(2);
//        A.add(1);
//        A.add(5);
//        A.add(6);
//        A.add(2);
//        A.add(3);
//        System.out.println(findNearestSmallerOnTheLeft(A));
//        System.out.println(findNearestSmallerOnTheRight(A));

        System.out.println(largestRectangleArea(A));
    }
}
