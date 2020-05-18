package org.prep.utility;

public class ArrayUtility {

    public static boolean compareArray(int[] arr1, int[] arr2, boolean considerPosition) {
        if (!considerPosition) {
            int len1 = arr1.length;
            int len2 = arr2.length;
            if (len1 != len2) {
                return false;
            }
            for (int i = 0; i < len1; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void printArray(int[] arr1) {
        int len1 = arr1.length;


        for (int i = 0; i < len1; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

    }

}
