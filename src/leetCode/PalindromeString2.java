package leetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PalindromeString2 {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        List<Character> list = new LinkedList<>();
        for (char ch :
                s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != (reverseIterator.previous())) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}

