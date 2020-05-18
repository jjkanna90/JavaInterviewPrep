package org.prep.arrays;

public class OneEdit {

    public static boolean checkOneEdit(String str1, String str2){

        int len1 = str1.length();
        int len2 = str2.length();

        if(Math.abs(len1-len2)>1){
            return false;
        }

        if(len1 == len2 && checkOneChange(str1,str2)){
            return true;
        }else if(len1!=len2 && checkOneInsert(str1,str2)){
                return true;
        }
        else{
            return false;
        }


    }

    public static boolean checkOneChange(String str1, String str2){
        int str1Len = str1.length();
        boolean oneChange=false;
        for(int i=0; i<str1Len; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                if(oneChange == false){
                    oneChange = true;
                }else{
                    //more than one change found
                    return false;
                }
            }
        }
        // Return oneChange because there is also a possibility that no change has been detected
        return oneChange;
    }


    public static boolean checkOneInsert(String str1, String str2){
        //This method assumes both str1 and str2 are one length apart
        int str1Len = str1.length();
        int str2Len = str2.length();


        boolean oneIns = false;
        int i1=0, i2=0;

        while(i1<str1Len && i2<str2Len){
            if(str1.charAt(i1) != str2.charAt(i2)){
                if(oneIns == false){
                    oneIns=true;
                    if(str1Len > str2Len){
                        i1++;
                    }
                    else{
                        i2++;
                    }
                }
                //discrepancy already detected
                else{
                    return false;
                }
            }else{
                i1++;
                i2++;
            }
        }
        //need to return true here because if all characters till shorterString
        // length match then there is only one character left in longer string.
        return true;
    }


    public static void main(String args[]){
        System.out.println(checkOneEdit("pale","pal"));
        System.out.println(checkOneEdit("pale","bale"));
        System.out.println(checkOneEdit("pale","bile"));
        System.out.println(checkOneEdit("pale","paler"));
        System.out.println(checkOneEdit("pale","pale"));
        System.out.println(checkOneEdit("pale","piale"));
        System.out.println(checkOneEdit("pale","pialer"));
    }
}
