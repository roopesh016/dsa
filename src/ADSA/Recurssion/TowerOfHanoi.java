package ADSA.Recurssion;

import java.util.ArrayList;

public class TowerOfHanoi {


    public static ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        towerReplacement(A,1,2,3,ans);
        return ans;
    }


    public static void towerReplacement(int A,int source, int tower2, int destination,ArrayList<ArrayList<Integer>> ans){
        if(A==0){
            return;
        }

        towerReplacement(A-1,source,destination,tower2,ans);
        ArrayList<Integer> value = new ArrayList<>();
        value.add(A);
        value.add(source);
        value.add(destination);
        ans.add(value);
        towerReplacement(A-1,tower2,source,destination,ans);
    }

    public static void main(String[] args) {
        System.out.println(towerOfHanoi(5));
    }
}
