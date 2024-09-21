package ADSA;

import java.util.Arrays;

public class SeveOfEratoneses {


    public static void printAllPrimes(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;

        for(int i=2; i<=n; i++){
            if(prime[i]==true){
                for(int j=i*i; j<=n; j+=i){
                    prime[j] = false;
                }
            }
        }

        for(int i=2;i<n; i++){
            if(prime[i]==true)
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printAllPrimes(50);
    }
}
