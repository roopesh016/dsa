package check;

public class NonleadingZeros {

        public static int countWaysToReplaceQuestionMarks(String s) {
            return countWays(s, 0);
        }

        private static int countWays(String s, int index) {
            if (index == s.length()) {
                return 1;
            }

            int ways = 0;

            if (s.charAt(index) == '?') {
                // If the current character is a question mark, we can replace it with any digit
                for (int digit = 0; digit <= 9; digit++) {
                    if ((index == 0 && digit != 0) || (index > 0)) {
                        ways += countWays(s.substring(0, index) + digit + s.substring(index + 1), index + 1);
                    }
                }
            } else {
                // If the current character is not a question mark, just move to the next character
                ways += countWays(s, index + 1);
            }

            return ways;
        }

        public static void main(String[] args) {
            String s = "? 1";
            int result = countWaysToReplaceQuestionMarks(s);
            System.out.println(result); // Output will be the count of ways
        }
    }

