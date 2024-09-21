package ADSA;

public class ExcelColumn {

    public static int titleToNumber(String A) {
        int N = A.length();
        int ans = 0;
        int mul =1;
        for(int i=N-1; i>=0; i--){
            ans+=mul*(A.charAt(i)-'A'+1);
            mul*=26;
        }
        return ans;
    }


    public static String columnTitle(int N){
        String ans ="";
        while(N>0){
            N = N-1;
            int rem = N%26;
            char ch = (char)(rem+'A');
            ans +=ch;
            N=N/26;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AAC"));
    }
}
