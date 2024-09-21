package ADSA;

import com.company.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class ContinusSubArray {

    public static int[] solve(int[] A, int B) {
        HashMap<Long,Integer> hMap = new HashMap<>();
        int N = A.length;
        long sum =0;
        hMap.put(0L,-1);
        int startIndex = -1;
        int endIndex = -1;
        for(int i =0; i<N ;i++){
            sum +=A[i];
            long y = sum-B;
            if(hMap.containsKey(y)){
                startIndex = hMap.get(y)+1;
                endIndex = i;
                break;
            }
                hMap.put(y,i);
        }


        if(startIndex==-1){
            int[] ans = {-1};
            return ans;
        }

        int[] ans = new int [endIndex-startIndex+1];
        int k = 0;
        for(int l=0; l<ans.length; l++){
            ans[k] = A[l];
            k++;
        }

        return ans;
    }


         public static int[] solveTwo(int[] A, int B) {
         int n=A.length, s=-1,e=-1;
         long sum=0;
         HashMap<Long,Integer> hm=new HashMap<>();
         hm.put(0l, -1);
         for(int i=0;i<n;i++){
             sum=sum+A[i];
             long target=sum-B;
             if(hm.containsKey(target)== true){
                 s=hm.get(target)+1;
                 e=i;
                 break;
             }
             else{
                 hm.put(sum,i);
             }
         }
         if(s==-1){
             int[] res={-1};
             return res;
         }
         int[] ans=new int[e-s+1];
         int index=0;
         for(int i=s;i<=e;i++){
             ans[index]=A[i];
             index++;
         }
         return ans;
 }


    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        solveTwo(A,5);
    }

}
