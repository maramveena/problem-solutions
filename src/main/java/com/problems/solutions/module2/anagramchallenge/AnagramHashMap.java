package com.problems.solutions.module2.anagramchallenge;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nandigama on 1/5/2019.
 */
public class AnagramHashMap {
    public static boolean isAnagram(final String str1, final String str2) {

        if (str1 != null && str2 != null) {
            String s1 = str1.replaceAll(" ", "").toLowerCase();
            String s2 = str2.replaceAll(" ", "").toLowerCase();
            if (s1.length() != s2.length()) {
                return false;
            }
            Map<Character, Integer> map = new HashMap<>();
            for (Character c : s1.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for (Character c : s2.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) - 1);
                if (map.get(c) < 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
