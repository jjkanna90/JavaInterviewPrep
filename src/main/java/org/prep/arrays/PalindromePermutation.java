package org.prep.arrays;

public class PalindromePermutation {

    /**
     * Check if a given string is a permutation of a palindrome.
     * Example : Tact Coa
     * Output : true
     * Assumptino : case insensitive
     * Permutations : taco cat or atco cta
     * @param str
     * @return
     */
    public static boolean checkPalindromePermutation(String str){
        str = str.trim();
        if(str.length()==1){
            return true;
        }
        if(str.length()==0){
            return false;
        }

        //Using the bit vector method
        String strInput = str.toLowerCase();
        char[] cInput = strInput.toCharArray();
        int bitVector = 0;
        int refChar = (int)'a';
        for(int i=0; i<cInput.length; i++){
                //skip non alphabet characters

                if(cInput[i]<'a' || cInput[i]>'z'){

                   continue;
               }
               // System.out.println(cInput[i]+" : "+(int)cInput[i]);
               int offset = cInput[i] - refChar;

               //toggling bit vector
               bitVector = toggleBitVector(bitVector,offset);
        }

        //if there are equal amounts of characters then bitVector will be all -s
        if(bitVector == 0){
            return true;
        }

        //Now to check if there is atleast one 1 in the bit vector
        // This can be done by subracting 1 from bit vector and "AND" it with the bitVector.
        int bitVectorMinus1 = bitVector - 1;

        // If this is equal to 0 then there is only one 1
        if((bitVector & bitVectorMinus1) == 0){
            //There is only one 1
            return true;
        }
        return false;
    }

    private static int toggleBitVector(int bitVector, int offset){
        int leftShiftMask = 1 << offset;
        //Check if the bit at offset is already 1
        if((leftShiftMask & bitVector) != 0){
            //the bit at offset is 1
            bitVector = bitVector & (~leftShiftMask);
        }else{
            //the bit at offset is 0
            bitVector = bitVector | leftShiftMask;
        }
        return bitVector;
    }

    public static void main(String args[]){

        System.out.println(checkPalindromePermutation("taco cat"));
        System.out.println(checkPalindromePermutation("tacodcat"));
    }
}
