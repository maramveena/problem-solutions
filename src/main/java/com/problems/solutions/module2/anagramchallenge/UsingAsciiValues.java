package com.edureka.assignments.module2.anagramchallenge;

/**
 * Created by nandigama on 12/11/2018.
 */
public class UsingAsciiValues {

    public static void main(String[] args) {
        System.out.println(isAnagram("Law", "wal"));
    }

    public static boolean isAnagram(String s1, String s2) {
        String str1 = s1.replaceAll(" ", "");
        String str2 = s2.replaceAll(" ", "");

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] str1Chars = str1.toLowerCase().toCharArray();
        char[] str2Chars = str2.toLowerCase().toCharArray();

        int[] letters = new int[26];
        for (char c : str1Chars) {
            letters[c - 'a']++;
        }

        for (char c : str2Chars) {
            letters[c - 'a']--;
            if (letters[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
