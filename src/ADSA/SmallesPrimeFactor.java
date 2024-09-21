package ADSA;

public class SmallesPrimeFactor {

    //Every Number is smallestPrimeFactor of itself

    public static void check(int A){
        int[] value = new int[A+1];

        value[0]=0;
        value[1] = 1;

        for(int i=2;i<=A; i++){
            value[i]= i;
        }

        for(int i=2; i*i<=A; i++){
            if(value[i]==i){
                for(int j=i*i; j<=A; j+=i){
                    if(value[j]==j){
                        value[j] = i;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {

    }
}
