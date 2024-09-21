package ADSA;

public class RankOfCharacter {


    public static int findRank(String A) {
        int ans = 0;
        int n = A.length();
        int mod = 1000003;
        if(n==1)
        {
            ans = 1;
            ans = ans%mod;
        }else {
            for(int i=0; i<n-1; i++){ //Iterate the string from left to right
                int count =0;

                for(int j= i+1; j<n; j++){ // For every single character iterate on the right side
                    if(A.charAt(j)<A.charAt(i)){
                        count ++;
                    }
                    ans += (count* fact(n-i-1))%mod;
                }
            }
            ans = (ans+1)%mod;
        }

        return ans;
    }


    public static int fact(int k){
        int fact =1;
        for(int i=1; i<=k;i++){
            fact = fact*i;
        }
        return fact;
    }



    public static void main(String[] args) {
       int ans = findRank("VIEW");
        System.out.println(ans);
    }
}
