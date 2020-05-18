package org.prep.arrays;

/**
 * Assume you have a method isSubstring which checks if one word is a substring of another, Given 2 strings s1 and s2 write code to check if s2 is a rotation of s1 using only one call
 * to isSubstring e.g waterbottle is a rotation of erbottlewat
 */
public class StringRotation {

    public static void main(String args[]){

        //the trick here is to concatenate s2 with itself and check if s1 is a substring of s2
        //first to check if both of them have the same length;

        String s1="waterbottle";
        String s2="erbottlewa";
        System.out.println(checkRotatedString(s1,s2));


    }

    public static boolean checkRotatedString(String s1, String s2){
        if(s1.length() == s2.length())
        {
            String concat= s2+s2;
            //contains is similar to isSubstring
            if(concat.contains(s1)){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
