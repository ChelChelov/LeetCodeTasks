package leetCode;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "{[]}";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);

            if ((first == '(' & second == ')') |
                    (first == '[' & second == ']') |
                    (first == '{' & second == '}')) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}
// https://leetcode.com/problems/valid-parentheses/
// I don't want to find a better way to solve this task