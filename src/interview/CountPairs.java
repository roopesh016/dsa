package interview;

public class CountPairs {


    public static int countPair(char[] c){
        int n = c.length;
        int count =0;
        int ans = 0;
        for(int i=0; i<n; i++){
            if(c[i]=='a')
                count++;

            if(c[i]=='g')
                ans = ans+count;
        }

        return ans;
    }

    public static void main(String[] args) {
        char[] c = {'a','d','g','a','g','a','g','f','g'};
        System.out.println(countPair(c));
    }
}
