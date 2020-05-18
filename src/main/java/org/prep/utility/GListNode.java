package org.prep.utility;

/**
 * Generic List node
 *
 */
public class GListNode<T> {

    T data;
    public GListNode<T> next;

    public GListNode(T val, GListNode<T> next){
        data = val;
        this.next = next;
    }

}
