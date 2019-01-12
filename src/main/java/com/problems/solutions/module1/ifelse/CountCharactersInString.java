package com.edureka.assignments.module1.ifelse;

/**
 * Created by nandigama on 1/10/2019.
 */
public class CountCharactersInString {

    /**
     * counting given character in string
     * @param str String
     * @param ch character
     * @return returns count of given characters in string
     */
    public int countCharacters(String str , char ch) {
        if(str == null || str.length() == 0) {
            return -1;
        }
        int count = 0;
        for (int i = 0 ; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
