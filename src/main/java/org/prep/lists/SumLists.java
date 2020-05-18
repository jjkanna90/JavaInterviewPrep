package org.prep.lists;


import org.prep.utility.ListUtility;
import org.prep.utility.SListNode;

/**
 * You have 2 numbers represented by a Linked list, where each node contains a single digit. The digits are stored in reverse order such that the 1s digit is at the head
 * Write a function that adds the two numbers and returns the sum as linked list.
 *
 *
 * Input : 7->1->6 + 5->9->3
 * Output : 2->1->9
 *
 * Suppose the digits are stored in forward order. Repeat the above problem.
 *
 *
 */
public class SumLists {

    public SListNode doRevereseSum(SListNode a, SListNode b){

        SListNode c = null;
        SListNode prev = null;
        int carry = 0;
        SListNode tail = null;

        while(a!=null || b!=null){

            int value = carry;
            if(a!=null){
                value += a.value;
                a=a.next;
            }
            if(b!=null){
                value += b.value;
                b=b.next;
            }

            carry = value/10;
            tail=new SListNode(value%10,null);

            if(c==null){
                c = tail;
            }

            if(prev != null){
                prev.next = tail;
            }
            prev = tail;


        }

        if(carry!=0){
            //we need to add the carry as the last node.
            tail.next = new SListNode(carry,null);
        }
        return c;
    }



    public SListNode doForwardSum(SListNode a, SListNode b){

        //Do zero padding for shorter list
        SListNode aTemp = a;
        SListNode bTemp = b;

        while(aTemp.next!=null || bTemp.next!=null){
            if(aTemp.next == null) {
                a = new SListNode(0,a);
            }
            else{
                aTemp = aTemp.next;
            }

            if(bTemp.next == null){
               b = new SListNode(0,b);
            }else{
                bTemp = bTemp.next;
            }


        }


        SumListsPartialSum pSum = doRecursiveForwardSum(a,b);
        SListNode c = pSum.sum;

        if(pSum.carry != 0){
            SListNode newC = new SListNode(pSum.carry,c);
            c = newC;
        }

        return c;


    }

    private SumListsPartialSum doRecursiveForwardSum(SListNode a, SListNode b){



        if(a != null && b != null) {

            SumListsPartialSum pSum = doRecursiveForwardSum(a.next, b.next);
            SumListsPartialSum nSum = null;

            if(pSum != null){
                int val = a.value + b.value + pSum.carry;
                SListNode c = new SListNode(val%10,pSum.sum);
                nSum = new SumListsPartialSum(val/10,c);
            }
            else{
                 int val = a.value + b.value;
                 SListNode c = new SListNode(val%10,null);
                 nSum = new SumListsPartialSum(val/10,c);
            }
            return nSum;
        }
        else{
            return null;
        }
    }
}
