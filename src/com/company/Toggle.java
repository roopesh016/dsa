package com.company;

public class Toggle {


    public static void toggle(char[] ch){
        int n = ch.length;

        for(int i=0;i<n;i++){
            char c = ch[i];
            if(c>='A' && c<='Z'){
                ch[i] = (char)(ch[i] + 'a' - 'A') ;
                System.out.println(ch[i]);
            } else if(c>='a' && c<='z'){
                ch[i] = (char)(ch[i] + 'A'-'a');
                System.out.println(ch[i]);
            }
        }
    }


    public static StringBuilder toggle(String A){
        StringBuilder s1 = new StringBuilder();
        int n = A.length();
        char[] ch = A.toCharArray();
//        int n = ch.length;
//        for(int i =0; i<n ;i++){
//            char c = ch[i];
//            if(ch[i]>='A' && ch[i]<='Z'){
//                ch[i]+=(char)('a'+ c - 'A');
//                s1.append(ch[i]);
//            } else if(ch[i]>='a' && ch[i]<='z'){
//                ch[i]+=(char)('A'+ c - 'a');
//                s1.append(ch[i]);
//            }
//        }


        for( int i=0; i<n; i++){
            if(A.charAt(i)>='A' && A.charAt(i)<='Z'){
                s1.append((char)('a' + A.charAt(i) -'A'));
            } else if(A.charAt(i)>='a' && A.charAt(i)<='z'){
                s1.append((char)('A' + A.charAt(i) - 'a'));
            }
        }

        return s1;
    }




    public static void main(String[] args) {
//       char[] c = new char[1];
//       c[0]='c';
//        toggle(c);
        String s = "tHiSiSaStRiNg";
        System.out.println(toggle(s));
    }
}
