package probs;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallestInteger {

    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> sT = new Stack<>();

        for (int i = 0; i < A.size(); i++) {
            ans.add(-1);
            while (sT.size() > 0 && sT.peek() >= A.get(i)) {
                sT.pop();
            }
            if (sT.size() > 0) {
                ans.add(sT.peek());
            }
            sT.push(A.get(i));
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        System.out.println(prevSmaller(A));
    }
}
