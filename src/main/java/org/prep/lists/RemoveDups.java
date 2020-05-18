package org.prep.lists;

import org.prep.utility.SListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Code to remove duplicates from an unsorted list
 */
public class RemoveDups {


    public void removeDupsWithBuffer(SListNode head){

        if(head == null){
            return;
        }

        SListNode ptr = head;


        Set<Integer> tempBuffer = new HashSet<Integer>();

        tempBuffer.add(head.value);
        while(ptr.next != null){
            int val = ptr.next.value;
            if(tempBuffer.contains(val)){
                //The node next to ptr should be removed
                ptr.next = ptr.next.next;
            }
            else{
                tempBuffer.add(val);
                ptr = ptr.next;
            }

        }


        /*while(ptr!=null){

            if(tempBuffer.contains(ptr.value)){
                SListNode nextNode = ptr.next;
                //check if current node is head
                if(head==ptr){
                   head.next = null;
                   head = nextNode;
                }
                 //if current node is not head
                 else{
                    prev.next = nextNode;
                 }
                ptr.next = null;
                ptr = nextNode;
            }
            else{
                tempBuffer.add(ptr.value);
                prev = ptr;
                ptr = ptr.next;
            }
        }*/

    }


}
