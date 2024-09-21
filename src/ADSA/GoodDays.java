package ADSA;

public class GoodDays {

    public static int solve(int A){
        int[] result = new int[A];
        int rowIndex =0;
        int n = result.length;
        int B = A;
        for(int i=0; i<n; i++){
            result[rowIndex] = (int) Math.pow(2,A-B);
            rowIndex++;
            B--;
            if(B==0)
                break;
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            if(A==result[i]){
                ans =1;
                break;
            }else{
                for(int k=0; k<n; k++) {
                    if(result[k]<A){

                    }
                }
            }
        }
        return ans;
    }


    public static int solveBinary(int A) {
        int cnt=0;
        while(A>0){
            if((A&1)==1){
                cnt++;
            }
            A=A>>1;
        }
        return cnt;
    }

    public static void main(String[] args) {int A = 8;
        System.out.println(solveBinary(A));
    }
}
