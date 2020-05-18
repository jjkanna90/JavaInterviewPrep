package org.prep.utility;

public class SListNode {

    public int value;
    public char ch;
    public SListNode next;

    public SListNode(int val, SListNode next){
        value = val;
        this.next = next;
    }

    public SListNode(char ch, SListNode next){
        this.ch = ch;
        this.next = next;
    }
}
