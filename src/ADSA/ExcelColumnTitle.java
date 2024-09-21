package ADSA;

public class ExcelColumnTitle {

    public  static String convertToTitle(int A) {
        String ans = "";
        while(A>0){
            A = A-1;
            int rem = A%26;

            char ch = (char)(rem+'A');

            ans = ch+ans;

            A = A/26;

        }
        return ans;
    }

    public static void main(String[] args) {
        convertToTitle(35);
    }
}
