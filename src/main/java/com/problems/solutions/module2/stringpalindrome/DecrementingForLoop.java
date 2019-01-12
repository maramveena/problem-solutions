package com.edureka.assignments.module2.stringpalindrome;

/**
 * Created by nandigama on 1/5/2019.
 */
public class DecrementingForLoop {
    public static boolean isStringPalindrome(String str) {
        if(str == null) {
            return false;
        }
        String s = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        if (s.equals(sb.toString())) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isStringPalindrome("maram"));
        System.out.println(isStringPalindrome("marama"));
        System.out.println(isStringPalindrome("racecar"));
        System.out.println(isStringPalindrome("m"));
        System.out.println(isStringPalindrome(""));
        System.out.println(isStringPalindrome(" "));
        System.out.println(isStringPalindrome(null));
        System.out.println(isStringPalindrome("race car"));
    }
}
