package com.problems.solutions.module2.strings;

/**
 * Created by nandigama on 1/10/2019.
 */
public class BinaryString {

    /**
     * this method will count binary substrings start with 1 and ends with 1
     *
     * @param s Given String to find count of substrings of 1
     * @return returns count of substrings 1
     */
    public int countBinarySubStringsOne(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == '1') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int countBinaryStrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
