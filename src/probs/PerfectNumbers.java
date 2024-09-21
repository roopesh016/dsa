package probs;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumbers {

    public static String solve(int A) {
        Queue<String> qS = new LinkedList<>();
        qS.add("1");
        qS.add("2");
        int count =0;
        String front = "";
        while(count!=A){
            front = qS.remove();
            count++;
            qS.add(front+'1');
            qS.add(front+'2');
        }
        StringBuilder sb = new StringBuilder(front).reverse();
        return front+ (sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(solve(5));
    }
}
