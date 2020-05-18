package org.prep.lists;

import org.prep.utility.SListNode;

/**
 * Find the Kth to Last element in a linked list
 */
public class KthToLastElement {

    public int findKthToLastElement(SListNode head, int k){

        if(head == null){
            return -1;
        }
        //Use the runner method.
        SListNode curr = head;
        SListNode runner = head;

        while(curr.next!=null && runner.next!=null){
            if(k<=1){
                //start incrementing curr
                curr=curr.next;
                runner = runner.next;
            }
            else{
                k--;
                runner = runner.next;
            }
        }

        return curr.value;
    }

}
