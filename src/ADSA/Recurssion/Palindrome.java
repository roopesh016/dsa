package ADSA.Recurssion;

public class Palindrome {


    public static int solve(String A) {
        int i =0;
        int n = A.length()-1;
       return check(A,i,n);
    }


    public static int check(String A,int i, int j){
        if(i>=j){
            return 1;
        }

        if(A.charAt(i) != A.charAt(j)){
          return 0;
        }

        return check(A,i+1,j-1);
    }


    public static void main(String[] args){
        System.out.println(solve("xyz"));
    }
}
