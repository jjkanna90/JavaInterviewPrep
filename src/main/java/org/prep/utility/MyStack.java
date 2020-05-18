package org.prep.utility;

public class MyStack<T> {

    GListNode<T> first;
    GListNode<T> last;

    public void push(T data){
       GListNode<T> node = new GListNode<T>(data,null);
        if(first == null){
            first = node;
            last = node;
        }
        else{
            node.next = first;
            first = node;
        }
    }


    public T pop() {

        if(isEmpty()){
            return null;
        }
        GListNode<T> node = null;
        node = first;
        first = first.next;

        if(first == null){
            last = null;
        }

        return node.data;
    }

    public T peek() {
        if(isEmpty()){
            return null;
        }
        return first.data;
    }


    public boolean isEmpty(){
        return (first==null);
    }

    public void printStack(){
        GListNode<T> temp = first;
        while(temp != null){
            System.out.print(temp.data+" , ");
            temp = temp.next;
        }
        System.out.println();
    }
}
