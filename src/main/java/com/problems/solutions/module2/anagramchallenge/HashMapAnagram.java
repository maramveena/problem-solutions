package com.problems.solutions.module2.anagramchallenge;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nandigama on 1/5/2019.
 */
public class HashMapAnagram {

    public static boolean areAnagrams(final String s1, final String s2) {
        if ((s1 != null && s2 != null && s1.length() == s2.length())) {
            Map<Character, Integer> charFrequencMap = countCharFrequency(s1);
            return isAnagram(charFrequencMap, s2);
        }
        return false;
    }

    private static Map<Character, Integer> countCharFrequency(String s1) {
        Map<Character , Integer> map = new HashMap<>();
        for (Character c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    private static boolean isAnagram(Map<Character, Integer> map, String s2) {
        for(Character c : s2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
            if(map.get(c) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("veena", "aneev"));
        System.out.println(areAnagrams("", ""));
        System.out.println(areAnagrams("veenareddy", "veenaabccd"));
        System.out.println(areAnagrams("", "aneev"));
        System.out.println(areAnagrams("null", "aneev"));
        System.out.println(areAnagrams(null, "aneev"));
        System.out.println(areAnagrams("veena", ""));
        System.out.println(areAnagrams("veena", "null"));
        System.out.println(areAnagrams("veena", null));
        System.out.println(areAnagrams("", "  "));
        System.out.println(areAnagrams(null, null));
        System.out.println(areAnagrams(null, ""));
        System.out.println(areAnagrams("", null));
    }
}
