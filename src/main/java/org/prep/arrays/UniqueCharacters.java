package org.prep.arrays;

public class UniqueCharacters {

    /* Check if String has unique characters
    * Assumption : Unicode set of characters
    * Assumption : case sensitive*/
    public boolean checkUnique(String str){

        boolean[] charMask = new boolean[65536];
        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
            if(charMask[c] == false){
                charMask[c]=true;
            }
            else{
                System.out.println("false");
                return false;
            }
        }

        return true;
    }

    /* Check if String has unique characters
     * Assumption : ASCII set of characters
     * Assumption : String has only lower case letters
     * Assumption : case insensitive
     * Method : can use int as int has 32 bits and we are concerned with only last 26 bits
     * */
    public boolean checkUniqueUsingBitVector(String str){
        int checker = 0;
        int len = str.length();
        for(int i=0; i<len;i++){
            int offset = str.charAt(i) - (int)'a';
            int onebitoffset = 1 << offset;
            if( (checker & onebitoffset) != 0){
              return false;
            }
            checker = checker | onebitoffset;
        }
        return true;
    }

    public static void main(String args[]){

    }

}
