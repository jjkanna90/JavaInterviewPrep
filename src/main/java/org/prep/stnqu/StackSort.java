package org.prep.stnqu;

import org.prep.utility.MyStack;

/**
 * Algorithm to sort the elements in stack in min first order
 */
public class StackSort {

    MyStack<Integer> tempStack = new MyStack<Integer>();

    public StackSort() {

    }

    public void sortAscending(MyStack<Integer> inputStack) {
        //Integer min = Integer.MAX_VALUE;
        int sortCount = 0;


        while (!inputStack.isEmpty()) {
            Integer min = inputStack.peek();
            int count = 0;
            while (!inputStack.isEmpty()) {
                count++;
                Integer temp = inputStack.pop();
                //System.out.println(temp);
                //System.out.println(inputStack.isEmpty());

                if (temp < min) {
                    min = temp;
                }
                System.out.println("min = "+min);
                tempStack.push(temp);

            }

            while (count > 0) {
                Integer temp = tempStack.pop();
                if (temp != min) {
                    System.out.println("Pushing "+temp);
                    inputStack.push(temp);
                }
                count--;
            }
            tempStack.push(min);
            sortCount++;

        }

        while(!tempStack.isEmpty()){
            inputStack.push(tempStack.pop());
        }
    }

}
