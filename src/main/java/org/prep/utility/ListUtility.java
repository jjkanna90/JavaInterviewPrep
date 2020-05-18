package org.prep.utility;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListUtility {

    public static void printLinkedList(SListNode node){
        SListNode ptr = node;
        while(ptr!=null){
            System.out.print(" "+ptr.value);
            ptr=ptr.next;
            if(ptr!=null){
                System.out.print("->");
            }
        }
        System.out.println("");
    }


    public static SListNode convArrayToSList(int[] arrInp){
        SListNode head = null;

        SListNode tail = null;

        for(int i =0;i<arrInp.length; i++){
            if(i==0){
                head = new SListNode(arrInp[i],null);
                tail = head;
            }
            else{
                tail.next = new SListNode(arrInp[i],null);
                tail = tail.next;
            }
        }

        return head;
    }

    public static SListNode convArrayToSList(char[] arrInp){
        SListNode head = null;

        SListNode tail = null;

        for(int i =0;i<arrInp.length; i++){
            if(i==0){
                head = new SListNode(arrInp[i],null);
                tail = head;
            }
            else{
                tail.next = new SListNode(arrInp[i],null);
                tail = tail.next;
            }
        }

        return head;
    }

    public static int[] convSListToIntArray(SListNode head){

        int length = 0;
        SListNode ptr = head;
        while(ptr != null){
            length++;
            ptr = ptr.next;
        }

        int[] arr = new int[length];

        ptr = head;
        for(int i =0;i<length; i++){
            arr[i] = ptr.ch;
            ptr = ptr.next;
        }

        return arr;
    }

    public static char[] convSListToCharArray(SListNode head){

        int length = 0;
        SListNode ptr = head;
        while(ptr != null){
            length++;
            ptr = ptr.next;
        }

        char[] arr = new char[length];

        ptr = head;
        for(int i =0;i<length; i++){
            arr[i] = ptr.ch;
            ptr = ptr.next;
        }

        return arr;
    }




    public static <T> void printLinkedList(GListNode<T> node){
        GListNode<T> ptr = node;
        while(ptr!=null){
            System.out.print(" "+ptr.data);
            ptr=ptr.next;
            if(ptr!=null){
                System.out.print("->");
            }
        }
        System.out.println("");
    }



    public static <T> GListNode<T> convArrayToGList(T[] arrInp){
        GListNode<T> head = null;

        GListNode<T> tail = null;

        for(int i =0;i<arrInp.length; i++){
            if(i==0){
                head = new GListNode<T>(arrInp[i],null);
                tail = head;
            }
            else{
                tail.next = new GListNode<T>(arrInp[i],null);
                tail = tail.next;
            }
        }

        return head;
    }


    public static <T> T[] convGListToArray(GListNode<T> head){

        int length = 0;
        GListNode<T> ptr = head;
        while(ptr != null){
            length++;
            ptr = ptr.next;
        }

        Object[] arr = new Object[length];

        ptr = head;
        for(int i =0;i<length; i++){
            arr[i] = ptr.data;
            ptr = ptr.next;
        }

        return (T[])arr;
    }
}
