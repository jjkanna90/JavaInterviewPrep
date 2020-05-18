package org.prep.arrays;

import org.prep.utility.MatrixUtility;

public class MatrixRotation {

    public static void main(String args[]){
        int a[][] = {

                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println("input");
        MatrixUtility.printMatrix(a);

        rotateMatrix(a);
        System.out.println("output");
        MatrixUtility.printMatrix(a);
    }

    public static void rotateMatrix(int a[][]){
        int n = a.length;

        for(int i=0;i<n-1;i++){
            for(int j=i;j<n-i-1;j++){
                int temp = a[i][j];
                a[i][j]=a[n-1-j][i];
                a[n-1-j][i]=a[n-1-i][n-1-j];
                a[n-1-i][n-1-j] = a[j][n-1-i];
                a[j][n-1-i]=temp;
            }
        }


    }
}
