package com.company;

public class LongestPalindrome {


    public static void bruteForce(String A){
       int n = A.length();
       int ans =0;

       for(int i=0; i<n; i++){
           String s ="";
           for(int j=i; j<n; j++){
               s +=getSubString(A,i,j);
               if(isPalindrom(A,i,j)==true)
                   ans = Math.max(ans,j-i+1);
           }
           System.out.println(s);
       }

        System.out.println(ans);
    }


    public static String getSubString(String A,int i, int j){
        String s ="";
        for(int k=i;k<=j;k++) {
            s +=A.charAt(k);
        }
        return s;
    }

    public static boolean isPalindrom(String A,int i,int j){
        while(i<j){
            if(A.charAt(i)!=A.charAt(j))
                return false;

                i++;
                j--;
        }
        return true;
    }



    public static void optimisedApproach(String A){
        int ans =0;
        String s="";
        int n = A.length();
        if(n%2==0){
            for(int i=0; i<n-1; i++){
                //centre = i;
                //centre = i+1;
                int p1 = i;
                int p2 = i+1;
                int length = expand(A,p1,p2);
                ans = Math.max(ans,length);
            }
        } else{
            for(int i=0; i<n ;i++){
                //centre =i;
                int p1 = i;
                int p2 = i;
                int length = expand(A,p1,p2);
                ans = Math.max(ans,length);
            }
        }
        System.out.println(s);
        System.out.println(ans);
    }


    static String longestPalindroe(String A){
        int n = A.length(); // calculating size of string
        // if string is empty then size will be 0.
        // if n==1 then, answer will be 1(single
        // character will always palindrome)

        int maxLength = 1, start=0;
        int low, high;
        for (int i = 0; i < n; i++) {
            low = i - 1;
            high = i + 1;
            while ( high < n && A.charAt(high) == A.charAt(i)) //increment 'high'
                high++;

            while ( low >= 0 && A.charAt(low) == A.charAt(i)) // decrement 'low'
                low--;

            while (low >= 0 && high < n && A.charAt(low) == A.charAt(high) ){
                low--;
                high++;
            }

            int length = high - low - 1;
            if (maxLength < length){
                maxLength = length;
                start=low+1;
            }
        }
        return A.substring(start, start + maxLength );
    }

    public static int expand(String A,int p1, int p2){
        int n = A.length();
        while(p1>=0 && p2<n && A.charAt(p1)==A.charAt(p2)){
            p1--;
            p2++;
        }
        return p2-p1-1;
    }


    public static void main(String[] args) {
        String s = "aaaabaaa";
        optimisedApproach(s);
    }
}
