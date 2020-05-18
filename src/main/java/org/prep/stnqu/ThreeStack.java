package org.prep.stnqu;

/**
 * Create an implementation of three stacks using a single array
 *
 * I am using fixed division method
 *
 * */
public class ThreeStack {

    //total capacity
    int capacity;
    int MIN_CAPACITY = 3;
    int MAX_STACK_INDEX = 2;
    //this stores the data for a stack.
    int[] data;
    StackParam[] sp = new StackParam[3];

    //to store the head, tail and current for the 3 stacks
    private static class StackParam{
        int h;
        int t;
        //when stack is empty p will be 1 less than h;
        int p;
    }




    public ThreeStack(int capacity){
        data = new int[capacity];
        if(capacity < MIN_CAPACITY)
            this.capacity = MIN_CAPACITY;
        this.capacity = capacity;

        int remcapacity = this.capacity%3;
        int begcapacity = this.capacity/3;


        for(int i=0;i<3;i++){
            sp[i] = new StackParam();
            if(i==0){
                sp[i].h=0;
            }else{
                sp[i].h=sp[i-1].t+1;
            }

            sp[i].t=sp[i].h+(begcapacity-1);
            if(remcapacity != 0){
                sp[i].t++;
                remcapacity--;
            }

            sp[i].p=sp[i].h-1;
        }
    }

    public void printStack(int stackindex){
        if(stackindex > MAX_STACK_INDEX || stackindex < 0){
            stackindex = 0;
        }
        System.out.print("Stack "+stackindex+" = ");
        for(int ptr = sp[stackindex].h; ptr<=sp[stackindex].p; ptr++){
            System.out.print(data[ptr]+",");
        }
        System.out.println();
    }


    public void push(int stackindex, int data) throws Exception{
        stackindex = checkStackIndex(stackindex);
        //System.out.println(sp[stackindex].h+", "+sp[stackindex].p+", "+sp[stackindex].t);
        if(isFull(stackindex)){
            throw new Exception("Stack "+stackindex+" is full");
        }
        sp[stackindex].p++;
        this.data[sp[stackindex].p] = data;
    }


    public int pop(int stackindex) throws Exception{
        stackindex = checkStackIndex(stackindex);

        if(isEmpty(stackindex)){
            throw new Exception("Stack "+stackindex+" is empty");
        }
        int d = this.data[sp[stackindex].p];
        sp[stackindex].p--;
        return d;
    }


    public int peek(int stackindex) throws Exception{
        stackindex = checkStackIndex(stackindex);

        if(isEmpty(stackindex)){
            throw new Exception("Stack "+stackindex+" is empty");
        }
        return this.data[sp[stackindex].p];
    }

    public boolean isEmpty(int stackindex){
        stackindex = checkStackIndex(stackindex);

        return sp[stackindex].p < sp[stackindex].h;
    }

    public boolean isFull(int stackindex){
        stackindex = checkStackIndex(stackindex);

        return sp[stackindex].p == sp[stackindex].t;
    }


    private int checkStackIndex(int stackindex){
        if(stackindex > MAX_STACK_INDEX || stackindex < 0){
            stackindex = 0;
        }
        return stackindex;

    }













}
