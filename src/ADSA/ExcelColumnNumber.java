package ADSA;

public class ExcelColumnNumber {

    public  static int convertToTitle(String X) {
        int ans =0;
        int mul =1;

        for(int i = X.length()-1 ; i>=0; i--){
            ans+= mul*(X.charAt(i)-'A'+1);
            mul *= 26;
        }
        return ans;
    }

    public static void main(String[] args) {
       String X = "C";
        System.out.println(convertToTitle(X));
    }
}
