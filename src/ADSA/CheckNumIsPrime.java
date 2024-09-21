package ADSA;

public class CheckNumIsPrime {

    public static boolean checkPrime(int N){
        boolean ans = false;
        if(N>=2){
            int count =0;
           for(int i=1;i<=N; i++){
              if(N%i==0){
                  count++;
              }
           }
           if(count==2){
               ans = true;
           } else {
               ans = false;
           }
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 3;
        System.out.println(checkPrime(N));
    }
}
