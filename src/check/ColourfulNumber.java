package check;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ColourfulNumber {

    public static int fetchColourFulNumber(int n){
        List<Integer> l1 = new ArrayList<>();
        while(n!=0){
            int v1 = n%10;
            l1.add(v1);
            n = n/10;
        }


        HashSet<Integer> hashSet = new HashSet<>();
        for(int i =0; i<l1.size(); i++){
            int prod = 1;
            for(int j=i; j<l1.size(); j++) {
                prod*=l1.get(j);
                if (hashSet.contains(prod)) {
                    return 0;
                } else {
                   hashSet.add(prod * l1.get(j));
                }
            }

        }
       return 1;
    }

    public static void main(String[] args) {
        int n =236 ;
        System.out.println(fetchColourFulNumber(n));
    }
}
