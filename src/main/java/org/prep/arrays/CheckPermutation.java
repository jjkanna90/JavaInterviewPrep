package org.prep.arrays;

public class CheckPermutation {

    /**
     * Checking if str2 is a permutation of str1
     * Assumption : string is made up of alphabets
     * Method : check equal length
     * Method : use HashMap to check count of each character
     * Method : assume case insensitive
     *
     * @param str1
     * @param str2
     * @return
     */
    public boolean checkPermutation(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int str1Len = str1.length();
        int str2Len = str2.length();
        int charCount[] = new int[26];

        if(str1Len != str2Len){
            return false;
        }

        for(int i=0; i<str1Len; i++){
            int offset = str1.charAt(i) - (int)'a';
            charCount[offset]++;
        }

        for(int i=0; i<str2Len; i++){
            int offset = str2.charAt(i) - (int)'a';
            charCount[offset]--;
        }

        for(int i=0 ; i<26 ; i++){
            if(charCount[i]!=0){
                return false;
            }
        }
        
        return true;
    }
}
