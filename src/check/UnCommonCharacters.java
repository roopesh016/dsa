package check;

import java.util.HashSet;
import java.util.Set;

public class UnCommonCharacters {

    public static void main(String[] args) {

        String str1 = "characters";
        String str2 = "alphabets";
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        // Adding characters of str1 to set1
        for (int i = 0; i < str1.length(); i++) {
            set1.add(str1.charAt(i));
        }

        // Adding characters of str2 to set2
        for (int i = 0; i < str2.length(); i++) {
            set2.add(str2.charAt(i));
        }

        // Using symmetric difference operator
        Set<Character> diff = new HashSet<>(set1);
        diff.addAll(set2);
        Set<Character> temp = new HashSet<>(set1);
        temp.retainAll(set2);
        diff.removeAll(temp);

        StringBuilder sb = new StringBuilder();
        for (char ch : diff) {
            sb.append(ch);
        }
        String result = sb.toString();
        System.out.println(result);

    }

}
