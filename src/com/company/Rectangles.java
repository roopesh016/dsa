package com.company;

import java.util.ArrayList;

public class Rectangles {

    public  void solveCheck(ArrayList<Integer> A, int B) {
        int i = 0;
        int j = A.size()-1;
        long ans =0;
        while(j<=i){
            int area = A.get(i)*A.get(j);
            if(area < B){
                ans = ans + (2 * (j-i) + 1);
                i++;
            }else{
                j--;
            }
        }
//        return(int)(ans % 1000000007);
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int start=0;
        int end=A.size()-1;
        long count=0;
        long area=0;
        while(start<=end)
        {
            area=1l*A.get(start)*A.get(end);
            if(area>=B) end--;
            else
            {
                count=count+(end-start)*2+1;
                start++;
            }
        }
        return (int)(count%1000000007);
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        int B = 5;
        System.out.println(solve(A,B));
    }
}
