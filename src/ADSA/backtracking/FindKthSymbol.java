package ADSA.backtracking;

import java.util.ArrayList;

public class FindKthSymbol {


    //Optimised approach
    public static int findSymbol(int n, int k){
        if(k==0){
            return 0;
        }

        int value = findKthSymbol(n-1, k/2);
        if(k%2==0)
            return value;
        else
            return 1-value;
    }

    public static int findKthSymbol(int n, int k){

        ArrayList<Integer> ans = fetch(n,k);
        return ans.get(k);
    }

    public static ArrayList<Integer> fetch(int n, int k){
        if(n==0){
            ArrayList<Integer> base = new ArrayList<>();
            base.add(0);
            return base;
        }

        ArrayList<Integer> previousRec = fetch(n-1,k);
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<previousRec.size(); i++){
            int value = previousRec.get(i);
            if(value==0){
                ans.add(0);
                ans.add(1);
            }else {
                ans.add(1);
                ans.add(0);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findKthSymbol(4,5));
    }
}
