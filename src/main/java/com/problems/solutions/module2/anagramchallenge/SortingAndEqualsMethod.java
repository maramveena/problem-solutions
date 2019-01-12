package com.problems.solutions.module2.anagramchallenge;

import java.util.Arrays;

/**
 * Created by nandigama on 12/11/2018.
 */
public class SortingAndEqualsMethod {
    public static void main(String[] args) {
        System.out.println(isAnagram("Mother In Law", "Hitler Woman"));
        System.out.println(isAnagram("veena", "reddy"));
    }

    public static boolean isAnagram(String s1, String s2) {
        String str1 = s1.replaceAll(" ", "");
        String str2 = s2.replaceAll(" ", "");
        if (str1.length() != str2.length()) {
            return false;
        }
        return sortString(str1).equals(sortString(str2));
    }

    private static String sortString(String s) {
        String str = s.replaceAll(" ", "");
        char[] charset = str.toLowerCase().toCharArray();
        Arrays.sort(charset);
        return new String(charset);
    }
}
