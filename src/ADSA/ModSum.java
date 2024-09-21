package ADSA;

import java.util.HashMap;
import java.util.Map;

public class ModSum {


    public static int solve(int[] A) {
        int mod = 1000000007;
        int n = A.length;
        long result = 0;

        Map<Integer, Integer> map = new HashMap<>();

        // Iterate over the array to count occurrences
        for (int i = 0; i < n; i++)
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);


        for (int i = 0; i < n; i++) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                int j = entry.getKey();
                int count = entry.getValue();

                result = (result + ((long) A[i] % j) * count) % mod;
            }
        }

        return (int)result;
    }

    public static void main(String[] args) {


    }
}
