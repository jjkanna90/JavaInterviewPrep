package org.prep.arrays;

import org.prep.utility.MatrixUtility;

/**
 * Write an algorithm such that if an element in an M*N matrix is 0 its entire row and column are set to 0
 */
public class ZeroMatrix {

    public static void main(String args[]){

        int a[][] = { {1,0,0,4},{1,3,0,5},{3,4,5,6}};
        MatrixUtility.printMatrix(a);
        //makeZeroMatrix(a);
        makeZeroMatrixUsingFirstRowColumn(a);
        System.out.println("After conversion");
        MatrixUtility.printMatrix(a);
    }

    public static void makeZeroMatrix(int a[][]){

        int rowCount = a.length;
        int colCount = a[0].length;

        boolean rowMask[] = new boolean[rowCount];
        boolean colMask[] = new boolean[colCount];


        for(int i=0; i<rowCount; i++){
            for(int j=0;j<colCount; j++){
                if(a[i][j] == 0){
                    rowMask[i] = true;
                    colMask[j] = true;
                }
            }
        }


        for(int i=0; i<rowCount; i++){
            for(int j=0;j<colCount; j++){
                if(rowMask[i] == true || colMask[j] == true){
                    a[i][j] = 0;
                }
            }
        }


    }


    public static void makeZeroMatrixUsingFirstRowColumn(int a[][]){

        int rowCount = a.length;
        int colCount = a[0].length;

        boolean rowMask[] = new boolean[rowCount];
        boolean colMask[] = new boolean[colCount];

        boolean firstrowzero = false;
        boolean firstcolzero = false;

        for(int j=0;j<colCount;j++){
            if(a[0][j]==0){
                firstrowzero=true;
                break;
            }
        }

        for(int i=0;i<rowCount;i++){
            if(a[i][0]==0){
                firstcolzero=true;
                break;
            }
        }


        for(int i=1; i<rowCount; i++){
            for(int j=1;j<colCount; j++){
                if(a[i][j] == 0){
                    a[i][0] = 0;
                    a[0][j] = 0;
                }
            }
        }

        //nullify rows
        for(int i=1; i<rowCount; i++){
            if(a[i][0]==0){
                for(int j=1;j<colCount;j++){
                    a[i][j]=0;
                }
            }
        }

        //nullify cols
        for(int j=1; j<colCount; j++){
            if(a[0][j]==0){
                for(int i=1;i<rowCount;i++){
                    a[i][j]=0;
                }
            }
        }


        if(firstrowzero){
            for(int j=0;j<colCount;j++){
                a[0][j]=0;
            }
        }
        if(firstcolzero){
            for(int i=0;i<rowCount;i++){
                a[i][0]=0;
            }
        }
    }
}
