package org.j8training;

public interface DefaultMethodDemo {

    // methods can be marked default in an interface. Can provide a default method definition in the interface
    // This method can be overriden in the implementing class
    // Why default methods?
    // when lamda expressionsw ere introduced, many of the core classes need to be updated by adding new methods supporting lambda
    // expressions which are essenially functional interfaces.
    // In order for these updates to be compatible with previous versions of java we need default methods
    // example in Iterable interface implemented by java.util.List a new method is added called forEach which supports lambda
    // adding this method to Iterable interface will need a definition for this in List class, which will in turn break old code.
    // so by making the new method as default method in Iterable interface we can avoid updating the List class and still support lambda expr.

    default void printme() {
        System.out.println("In interface");
    }
}
