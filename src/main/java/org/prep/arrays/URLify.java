package org.prep.arrays;

public class URLify {

    public static void main(String args[]){
        String input = "Mr John Doe    ";
        //"Mr%20John%20Doe"
        System.out.println(URLify(input,11));

    }

    /**
     * Provided a input String with spaces, replace the spaces with %20. you can assume that the
     * true length of the string is provided and that there is enough space in the string to perform the
     * in space substitution
     * @param str
     * @param length
     * @return
     */
    public static String URLify(String str, int length){

        char[] inpStr = str.toCharArray();

        int spaceCount = 0;
        for(int i=0;i<length;i++){
            if(inpStr[i]==' '){
                spaceCount++;
            }
        }

        int fullLength = length+spaceCount*2;
        //To get to last character
        fullLength--;

        for(int i=length-1;i>=0;i--){
            if(inpStr[i]==' '){
                //do replacement
                inpStr[fullLength]='0';
                inpStr[fullLength-1]='2';
                inpStr[fullLength-2]='%';
                fullLength = fullLength-3;
            }
            else{
                inpStr[fullLength] = inpStr[i];
                fullLength--;
            }
        }

        return new String(inpStr);
    }
}
