package ADSA.Recurssion;

public class Power {

    //2^10 = 2^5*2^5
    //2^15 = 2^7*2^7*2

    public static int power(int x, int n){
        if(n==0)
            return 1;

        if(n%2 ==0){
            return power(x*x,n/2);
        } else {
            return x*power(x*x, n / 2);
        }
    }




    public static void main(String[] args) {
        int x =2;
        int n =10;
        System.out.println(power(x,n));
    }
}
