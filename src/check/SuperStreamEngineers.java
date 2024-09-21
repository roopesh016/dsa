package check;

public class SuperStreamEngineers {

    public static int findSuperStream(int[] A,int B, int C){
        int n = A.length;
        int sum =0;
        for(int i =0; i<B; i++){
           sum+=A[i];
        }
        int x = sum/B;
        if(x<=C)
            return 1;

        int s = 1;
        int e = B;
        while(e<n){
            sum = sum - A[s-1];
            sum = sum + A[e];
            x = sum/B;
            if(x<=C)
                return 1;
            s++;
            e++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A ={30,25,40,35,55,22,18,15};
        int B = 3;
        int C =30;
        System.out.println(findSuperStream(A,B,C));
    }
}
