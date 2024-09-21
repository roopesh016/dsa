package check;

public class ConsecutiveOnce {
   //Voting algorithm

    public static int solve(String A){
       int n= A.length();
       int count =0;
       int ans = 0;

       for(int i=0; i<n ; i++){
           if(A.charAt(i) == '1'){
               count ++;
           }
       }

       if(count  == n){
           ans = n;
           return ans;
       }

       if(count ==0){
           ans =0;
           return ans;
       }

       int value =0;

       for(int imp=0; imp<n; imp++){
           if(A.charAt(imp)=='0'){
               //left sum
               int leftSum =0;
               for(int lSum = imp-1; lSum>=0; lSum--){
                    if(A.charAt(lSum)=='1'){
                        leftSum++;
                    } else{
                        break;
                    }
               }
               // Right sum
               int rightSum = 0;
               for(int rSum = imp+1; rSum<n; rSum++){
                   if(A.charAt(rSum) == '1'){
                       rightSum++;
                   } else {
                       break;
                   }
               }

              if(leftSum+rightSum == count){
                 value = leftSum+rightSum;
              } else {
                  value = leftSum+rightSum+1;
              }
           }
           if(value>ans){
               ans = value;
           }
       }
       return ans;
    }

    public static void main(String[] args) {
//        System.out.println(solve("111000"));
        System.out.println(solve("000000000000000"));

    }
}
