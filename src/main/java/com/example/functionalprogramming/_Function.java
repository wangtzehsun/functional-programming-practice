package com.example.functionalprogramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        // Function takes 1 argument and return 1 result
        int increment1 = incrementByOne(0);
        System.out.println(increment1);
        int increment2 = incrementByOneFunction.apply(2);
        System.out.println(increment2);
        int multiply  = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        // Function takes 2 argument and return 1 result
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100 ));

    }

    static Function<Integer, Integer> incrementByOneFunction = num -> num + 1;

    static Function<Integer, Integer> multiplyBy10Function = num -> num * 10;

    static int incrementByOne(int num){
        return num + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
        (numToIncrement, numToMultiply) -> (numToIncrement + 1) * numToMultiply;

    static int incrementByOneAndMultiply(int num, int numToMultiply){
        return (num + 1) * numToMultiply;
    }

}
