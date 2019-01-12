package com.edureka.assignments.module2.stringpalindrome;

/**
 * Created by nandigama on 1/5/2019.
 */
public class Recursive {
    public static boolean isStringPalindrome(String s) {
        if (s == null || s.length() <= 1)
            return true;

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isStringPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isStringPalindrome("maram"));
        System.out.println(isStringPalindrome("maRam"));
        System.out.println(isStringPalindrome("marram"));
        System.out.println(isStringPalindrome("racecar"));
        System.out.println(isStringPalindrome(null));
        System.out.println(isStringPalindrome("m"));
        System.out.println(isStringPalindrome(""));
        System.out.println(isStringPalindrome(" "));

        System.out.println(isStringPalindrome("marama"));
        System.out.println(isStringPalindrome("race car"));

        System.out.println(isStringPalindrome("MaRam"));
    }
}
