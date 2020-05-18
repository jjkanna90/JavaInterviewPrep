package org.prep.arrays;

/**
 * Basic string compression using counts of repeated characters. only uppercase and lowercase letters will be given
 * if the compressed string is longer than the original, return the original
 * aabcccccaaa => a2b1c5a3
 */
public class CountCompression {

    public static void main(String args[]){
        //String str="aaabcccccccccc";
        //String str="ab";
        //String str="";
        String str="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddddddddddddddddasdfasdfasdfasdfasdfasdfasdf";
        System.out.println(compressString(str));
    }

    public static int countCompressionLength(String input){
        int len = input.length();
        if(len==0){
            return 0;
        }
        int compressedLength = 0;
        int repeatCount = 1;
        char repeatChar = input.charAt(0);
        for(int i=1; i<len; i++){
            char currChar = input.charAt(i);
            if(repeatChar != currChar){
                repeatChar = currChar;
                compressedLength = compressedLength +(String.valueOf(repeatCount).length())+1;
                //System.out.println(repeatCount);
                repeatCount=1;
            }
            else{
                repeatCount++;
            }
        }

        //for the last character
        compressedLength = compressedLength +(String.valueOf(repeatCount).length())+1;

        return compressedLength;
    }

    public static String compressString(String input){


        int len = input.length();
        if(len==0){
            return input;
        }
        int compressedLength = countCompressionLength(input);
        System.out.println("compressedLength="+compressedLength);
        if(len <= compressedLength){
            return input;
        }
        StringBuilder builder = new StringBuilder(compressedLength);

        int repeatCount = 1;
        char repeatChar = input.charAt(0);
        for(int i=1; i<len; i++){
            char currChar = input.charAt(i);
            if(repeatChar != currChar){
                builder.append(repeatChar);
                builder.append(repeatCount);
                repeatChar = currChar;
                repeatCount=1;
            }
            else{
                repeatCount++;
            }
        }

        //for the last character
        builder.append(repeatChar);
        builder.append(repeatCount);

        return builder.toString();
    }


}
