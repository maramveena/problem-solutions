package com.problems.solutions.module2.anagramchallenge;

import java.util.Arrays;

/**
 * Created by nandigama on 12/11/2018.
 */
public class SortAndLooping {
    public static void main(String[] args) {
        // System.out.println(isAnagram("Mother In Law", "Hitler Woman"));
        System.out.println(isAnagram("Toss", "ssot"));
        //System.out.println(isAnagram("joy", "enjoy"));
    }

    //USING FOR LOOP
    public static boolean isAnagram(String s1, String s2) {
        if (s1 != null && s2 != null) {
            String str1 = s1.replaceAll("\\s", "");
            String str2 = s2.replaceAll("\\s", "");
            if (str1.length() != str2.length()) {
                return false;
            } else {
                char[] str1Chars = str1.toLowerCase().toCharArray();
                char[] str2Chars = str2.toLowerCase().toCharArray();
                Arrays.sort(str1Chars);
                Arrays.sort(str2Chars);
                for (int i = 0; i < str1Chars.length; i++) {
                    if (str1Chars[i] != str2Chars[i]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}


