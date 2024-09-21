package check;

public class BinaryToDecimal {


    //(1000) base 2 -> () base 10
    //2^0*0+ 2^1*0+ 2^2*0+ 2^3*1
    //0+0+0+8
    //Here we have to extract and get the reminder and, then assign the new number and then,
    // multiply with the base number

    public static int bToD(int n){
        int ans =0;
        int mul =1;
        while (n>0){
            int r = n%10;
            n = n/10;
            ans = ans + r*mul;
            mul = mul*2;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(bToD(1000));
    }
}
