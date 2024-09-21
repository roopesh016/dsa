package com.company;

public class PlayingWithStrings {


    public static String playWithString(String A) {
        StringBuilder result = new StringBuilder();
        String conc = "";
        conc +=A+A;
        int n = conc.length();
        for (int i = 0; i < n; i++) {
            char c = conc.charAt(i);
            if (Character.isLowerCase(c)) {
                if("aeiou".indexOf(c) != -1){
                    result.append('#');
                } else{
                    result.append(c);
                }
            }
        }

        return result.toString();
    }


    public static void main(String[] args) {
        String s = "AbcaZeoB";
        System.out.println(playWithString(s));
    }

}
