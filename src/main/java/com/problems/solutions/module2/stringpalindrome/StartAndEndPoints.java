package com.problems.solutions.module2.stringpalindrome;

/**
 * Created by nandigama on 1/5/2019.
 */
public class StartAndEndPoints {
    public static boolean isStringPalindrome(String str) {
        if (str == null) {
          return false;
        }
        String s = str.toLowerCase();
        int i = 0;
        int j = s.length() -1;
        while (i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
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
        System.out.println(isStringPalindrome("maRam"));
    }
}
