package leetCode;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "([)]";
        System.out.println(isValid2(str));
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

    public static boolean isValid2(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.length() - 1 == i) {
                break;
            }
            char first = s.charAt(i);
            char scope;
            if (first == '(') {
                scope = '(';
            } else if (first == '[') {
                scope = '[';
            } else if (first == '{') {
                scope = '{';
            } else if (s.length() - 1 != i) {
                continue;
            } else {
                return false;
            }
            for (int j = s.length() - 1; j >= i; j--) {
                char last = s.charAt(j);
                if (scope == '(' & last == ')') {
                    break;
                } else if (scope == '[' & last == ']') {
                    break;
                } else if (scope == '{' & last == '}') {
                    break;
                } else if (1 == j) {
                    return false;
                }
            }
        }
        return true;
    }
}
// https://leetcode.com/problems/valid-parentheses/
// I don't want to find a better way to solve this task
// Another one try to solve this task and damn Leetcode give me new one peace of shit...