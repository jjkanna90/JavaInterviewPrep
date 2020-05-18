package org.prep.lists;


import org.prep.utility.SListNode;

/**
* Algorithm to delete a node in the middle of the linked list, somewhere between head and last.
 * Only the node to be deleted will be provided
 * E.g a->b->c->d
 * Input : b node pointer
 * Result : a->c->d
 *
 *
* */
public class MiddleNodeDeletion {

    public void deleteMiddleNode(SListNode mid){

        //Since we are not given the previous node
        // The logic involves left shifting the value from nodes following the node to be deleted till the last
        // and removing the last node

        while(mid.next != null){
            int forwardVal = mid.next.value;
            mid.value = forwardVal;
            if(mid.next.next==null){
                mid.next = null;
            }
            else{
                mid = mid.next;
            }
        }

    }
}
