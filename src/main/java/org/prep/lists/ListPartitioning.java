package org.prep.lists;

import org.prep.utility.ListUtility;
import org.prep.utility.SListNode;

/**
 * Code to partition a linked List around a value x such that all nodes less than x come before all nodes greater than equal to X. The partition element if present can occur
 * anywhere in the right partition, it does not need to appear between left and right partitions
 * Eg : 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 ( partition around 5 )
 * output : 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 */
public class ListPartitioning {

    public void partitionAround(SListNode head, int partition){

        //This algorithm ensures stability, i.e the order of elements in the list are not updated.
        //Create 2 different lists

        SListNode ptr = head;
        SListNode lesserHead = null;
        SListNode lesserTail = null;
        SListNode greaterHead = null;
        SListNode greaterTail = null;

        while(ptr!=null){


            if(ptr.value >= partition){
                if(greaterHead == null){
                    greaterHead = ptr;
                    greaterTail = ptr;
                }
                else{
                    greaterTail.next = ptr;
                    greaterTail = greaterTail.next;
                }
            }
            else{
                if(lesserHead == null){
                    lesserHead = ptr;
                    lesserTail = ptr;
                }
                else{
                    lesserTail.next = ptr;
                    lesserTail = lesserTail.next;
                }
            }
            ptr = ptr.next;


        }

        ListUtility.printLinkedList(greaterHead);
        ListUtility.printLinkedList(lesserHead);

        if(lesserHead != null) {
            head = lesserHead;
            lesserTail.next = greaterHead;
        }
        else{
            head = greaterHead;
        }

        if(greaterHead != null){
            greaterTail.next = null;
        }
        else{
            lesserTail.next = null;
        }
    }
}
