package org.j8training;

public class LamdaDemo {

    //Lambda expressions - used in functional programming
    // used in conjunction with functional interfaces
    // like anonymous functions
    // they take different functionality based on context.
    // can be passed as parameters to other functions.
    // its like defining a anonymous implmenetation for a functional interface
    // They are essentially used to provide inline definition for the single function of the functional interface




    public static void main(String args[]){

        //Syntax 1 : (parameter list) -> single line expression
        // for single line "expression" without curly braces return clause is not required.
        FunctionalIntfDemo addition;
        addition = (a,b) -> (a+b);
        FunctionalIntfDemo subtraction = (a,b) -> { return a-b; };

        //Syntax 2 : (parameter list) -> {multi-line statements}
        FunctionalIntfDemo division = (a,b) -> {
            if(b==0){
                return 0;
            }
            else{
                return a/b;
            }
        };

        lambdaExerciser(1,0,addition);

    }

    public static void lambdaExerciser(int a, int b, FunctionalIntfDemo demo){
        System.out.println(demo.doOperation(a,b));
    }
}
