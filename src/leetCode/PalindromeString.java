package leetCode;

public class PalindromeString {
    public static void main(String[] args) {
        PalindromeString palindromeString = new PalindromeString();
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        String result = palindromeString.firstPalindrome(words);
        System.out.println(result);
    }

    public String firstPalindrome(String[] words) {
        for (String w :
                words) {
            if (isPalindrome(w)) {
                return w;
            }
        }
        return "";
    }

    private boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        return s.equals(reverse);
    }
}
