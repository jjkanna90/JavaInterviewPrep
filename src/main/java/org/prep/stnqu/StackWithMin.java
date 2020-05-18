package org.prep.stnqu;


import org.prep.utility.MyStack;

/**
 * This stack implementation offers a way to view the minimum element
 * Logic is to maintain another stack to store the minimum value as it gets added or popped
 * I can extend MyStack<Integer> and overwrite all the push and pop methods also provide the min implementation with another instance of MyStack<Integer> as member
 * For clarity however am rewriting the entire thing.
 */
public class StackWithMin {

    MyStack<Integer> dataStack = new MyStack<>();
    MyStack<Integer> minStack = new MyStack<>();


    public void push(Integer data){

        if(minStack.isEmpty()){
            minStack.push(data);
        }
        else if(data <= minStack.peek()) {
            minStack.push(data);
        }

        dataStack.push(data);
    }


    public Integer pop() {
        if(dataStack.isEmpty()){
            return null;
        }
        if(dataStack.peek() <= minStack.peek()){
            minStack.pop();
        }
        return dataStack.pop();
    }

    public Integer min() {
        if(minStack.isEmpty()){
            return null;
        }
        return minStack.peek();
    }

    public Integer peek() {
        return dataStack.peek();
    }


    public boolean isEmpty(){
        return dataStack.isEmpty();
    }

}
