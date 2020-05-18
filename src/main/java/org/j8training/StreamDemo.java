package org.j8training;

import java.util.Arrays;

public class StreamDemo {

    //Steams API helps process set of data as streams by adding filters, transformation rules, and collectors.
    // more in line iwht functional programming where you specify the operation that should be performed on each data whether its a filter criteria or a transformation rule.
    // can be used in map and reduce algorithms
    // Collections and arrays can be processed as streams using the stream method.
    // Please note while processing as streams the original array will not be impacted
    // Streams API use a lot of functional interfaces like Consumer<T>, Predicate<T> etc

    public static void main(String args[]){

        int a[] = {1,2,3,4,5};
        Arrays.stream(a).filter((e)->{return e%2==0;}).forEach((e)->System.out.println(e));

    }
}
