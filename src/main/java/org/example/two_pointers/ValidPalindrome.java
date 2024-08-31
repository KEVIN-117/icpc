package org.example.two_pointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome.isPalindrome(s));
        System.out.println(validPalindrome.isPalindrome("race a car"));
        System.out.println(validPalindrome.isPalindrome(" "));
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\p{Punct}|\\s", "").toLowerCase();
        int p1 = 0;
        int p2 = s.length() - 1;
        while (p1 < p2){
            if (s.charAt(p1++) != s.charAt(p2--)) return false;
        }
        return true;
    }
}
