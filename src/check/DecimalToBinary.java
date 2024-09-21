package check;

public class DecimalToBinary {

    public static int dToB(int n){
        int ans =0;
        int mul = 1;
         while(n>0){
          int r = n%2;
          n = n/2;
          ans = ans + r*mul;
          mul = mul*10;
        }
         return ans;
    }

    public static void main(String[] args) {
        System.out.println(dToB(8));
    }
}
