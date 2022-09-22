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


//    private boolean isPalindrome(String s) {        // slow method
//        StringBuilder sb = new StringBuilder(s);
//        String reverse = sb.reverse().toString();
//        return s.equals(reverse);
//    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
}
