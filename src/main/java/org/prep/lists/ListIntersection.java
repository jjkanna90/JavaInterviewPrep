package org.prep.lists;

import org.prep.utility.SListNode;

/**
 * Find the intersection node for 2 Linked Lists
 */
public class ListIntersection {

    public SListNode checkIntersection(SListNode a, SListNode b){
        int aLen = findLength(a);
        int bLen = findLength(b);

        SListNode longer = a;
        SListNode shorter = b;
        if(bLen > aLen){
            longer = b;
            shorter = a;
        }

        int diff = Math.abs(aLen-bLen);

        while(diff!=0){
            diff --;
            longer = longer.next;
        }

        while(shorter!=null){
            if(longer == shorter){
                return longer;
            }
            longer = longer.next;
            shorter = shorter.next;
        }

        return null;
    }

    private int findLength(SListNode inp){
        int count = 0;
        while(inp!=null){
            count++;
            inp = inp.next;
        }
        return count;
    }
}
