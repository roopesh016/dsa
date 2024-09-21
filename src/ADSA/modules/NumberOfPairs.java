package ADSA.modules;

public class NumberOfPairs {

   public static int checkWithForLoop(int[] A, int m){
       int count =0;
       int n = A.length;
       for(int i =0; i<n ; i++){
           for(int j=i+1; j<n ; j++){
               int x = pair(A[i],A[j],m);
               int y = pair(A[j],A[i],m);
               if(x==0 && y==0){
                   count++;
               }
           }
       }
       return count;
   }

    public static int pair(int i,int j,int m){
        int ans = (i%m + j%m)%m;
        return ans;
    }


    //Using Reminder Logic
    public static int remainderLogic(int[] A, int m){
       //populate the count array
        int[] cnt = new int[m];
        int n = A.length;
        for( int i=0; i<n; i++){
            int rem = A[i]%m;
            cnt[rem]++;
        }

        int ans =0;
        int x = cnt[0];
        ans = ans+x*(x-1)/2;

        if(m%2==0){
            int half = cnt[m/2];
            ans = ans+half*(half-1)/2;
        }

        //get all the remaining pairs
        int i =1;
        int j = m-1;

        while(i<j){
            ans = ans +cnt[i]*cnt[j];
            i++;
            j--;
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] A = {29,11,21,17,2,5,4,6,23,13,26,14,18,15,30,35,50,20,40,9};
        int m = 10;
        System.out.println("the count of pairs:" +remainderLogic(A,m));
    }
}
