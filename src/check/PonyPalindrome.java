package check;

import java.util.HashMap;
import java.util.Map;

public class PonyPalindrome {

    public static int ifPalindrome(String s){
        HashMap<Character,Integer> hMap = new HashMap<>();
        int n = s.length();
        for(int i=0; i<n;i++){
            if(hMap.containsKey(s.charAt(i))){
                int frequency = hMap.get(s.charAt(i));
                hMap.put(s.charAt(i),frequency+1);
            }else {
                hMap.put(s.charAt(i),1);
            }
        }

        int count =0;
        for(Character c:hMap.keySet()){
            int frequency = hMap.get(c);

            if((frequency%2)!=0){
                count++;
            }
        }

        if(count>1)
           return 0;
         return 1;

    }

    public static void main(String[] args) {
        System.out.println(ifPalindrome("abcdca"));
        System.out.println(ifPalindrome("abccba"));
    }
}
