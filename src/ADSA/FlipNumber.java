package ADSA;

public class FlipNumber {


    public static int[] checkMaxFlipNumber(String A){
        int l=0;
        int r=0;
        int sum =0;
        int maxSUm =0;
        int[] ans = new int[2];

        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)=='1'){
                sum -=1;
            }else{
                sum +=1;
            }

            if(sum>maxSUm){
                maxSUm = sum;
                ans[0]=l+1;
                ans[1]=r+1;
            }

            if(sum<0){
                sum=0;
                l = i+1;
                r = i+1;
            }else {
                r = r+1;
            }
        }

        if(maxSUm==0)
            return new int[0];
        else
            return ans;
    }



    public int solve(int A, int B) {
        if((A&1<<B) == 1<<B){
            return 1;
        } else{
            return 0;
        }

    }


    public static int solvePower(int A, int B) {
        int n =0;
        n = (n|(1<<A));
        n = (n|(1<<B));
        return n;
    }


    public static Long check(Long A, int B){
        long ans = A;
        for(int i = 0;i<B;i++){
            if(checkBit(ans,i)==true){
                ans=ans^(1<<i);
            }
        }
        return ans;
    }

    public static boolean checkBit(long A, int i){
        if((A&(1<<i))==0){
            return false;
        }
        else{
            return true;
        }
    }


    public static int singleNumber(final int[] A) {
        int n=A.length;
        int ans=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int j=0;j<n;j++){
                //check if ith bit is set
                if((A[j]&(1<<i)) > 0){
                    count++;
                }
            }
            if(count%3==1){ //count is not a multiple of 3
                //set ith bit in ans
                ans=ans|(1<<i);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] A ={5,7,5,4,7,11,11,9,11,7,5,4,4};
        singleNumber(A);
        System.out.println(check(Long.valueOf(93),4));
//        System.out.println(solvePower(4,4));
//        checkMaxFlipNumber("110000111001");
    }
}
