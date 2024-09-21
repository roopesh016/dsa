package probs;

public class FindingFactors {

    public static int findNumberOfFactors(int N){
        int ans =0;
        for(int i =1; i*i <=N ; i++){
            if(N%i==0){

                if(i==N/i)
                    ans = ans+1;
                else
                    ans=ans+2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 9;
        System.out.println("The number of factor's : "+findNumberOfFactors(N));
    }
}
