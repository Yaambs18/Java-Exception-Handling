package com.exceptionhandling;

public class MultiCatch {
    public static void main(String[] args) {
        int num1 =10, num2=0;
        int values[] = {1,2,3};

        try{
            int result = num1/num2;

            values[10] = 20;
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: "+e);
        }
        System.out.println("After multi-catch");
    }
}
