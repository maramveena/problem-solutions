package com.edureka.assignments.module2.functions;

/**
 * Created by nandigama on 1/8/2019.
 */
public class StringPalindrome {
    /**
     * checking given string is palindrome or not
     * @param s Given String to find palindrome or not
     * @return returns true if string is palindrome or false  if it is not a palindrome
     */
    public  boolean isStringPalindromeOrNot(String s) {
        if(s == null || s.length() == 0) {
            return false;
        }
        char [] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        if(s.equalsIgnoreCase(sb.toString())) {
            return true;
        }
        return false;
    }
}
