package org.prep.lists;

import org.prep.utility.SListNode;

import javax.swing.plaf.SliderUI;
import java.util.Stack;

/**
 *
 */
public class CheckPalindrome {

    public boolean palindromeCheck(SListNode inp){

        SListNode runner = inp;
        SListNode slow = inp;

        Stack<Character> charStack = new Stack<Character>();

        //find midpoint
        while(runner != null){
            if(runner.next != null){
                runner = runner.next.next;
                charStack.push(slow.ch);
            }
            else{
                //This will happen only if the list has odd number of elements
                runner = null;
            }
            System.out.println(slow.ch);
            slow = slow.next;
        }


        //now slow pionts to mid point
        while(!charStack.isEmpty()){
            char ch = charStack.pop();
            if(slow.ch != ch){
                return false;
            }
            slow = slow.next;
        }

        return true;


    }
}
