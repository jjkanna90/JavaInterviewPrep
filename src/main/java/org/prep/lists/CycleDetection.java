package org.prep.lists;

import org.prep.utility.SListNode;

/**
 * Given a linked list detect if there is a cycle and return the first node where the cycle begins
 * */
public class CycleDetection {

    public SListNode detectCycle(SListNode inp){

        //To detect a cycle use the runner method - if the two pointers meet, it confirms the existence of a cycle.
        // if slow pointer advances by 1 node and fast pointer advances by k nodes then the point at which the meet will be k nodes behind the starting

        // Lets assume the length of non-loop part is k
        // length of loop is l
        // and slow pointer moves through 1 node at a time while the fast pointer moves 2 nodes
        // then by the time slow pointer reaches start of the loop it would have crossed k nodes
        // at that time the fast pointer would have crossed 2k nodes and will be k nodes into the loop.
        // if k<l then the fast pointer will be k%l nodes in the loop either in front of or behind the slow node ( which is at the start )
        // the slow node is l-(k%l) steps behind the fast node ( if fast node is k%l steps behind slow node in the loop )
        // for the slow node to catch up with the fast node in the loop it needs to move (l-k%l) steps because with each step the slow pointer catches up by 1 node to the fast pointer.


        // of the cycle.

        SListNode slow = inp;
        SListNode fast = inp;


        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                break;
            }
        }

        if(fast==null || fast.next==null){
            return null;
        }


        //now make slow point to head
        slow = inp;
        //move slow and fast one step at a time till they meet
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }


        return fast;
    }

}
