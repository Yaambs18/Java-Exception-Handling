package com.exceptionhandling;

public class TryCatchBlockExample {
    public static void main(String[] args) {
        int numerator, denominator;
        try{
            denominator = 0;
            numerator = 5;
            int result = numerator/denominator;
            System.out.println("division : "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
        System.out.println("after catch statement");
    }
}
