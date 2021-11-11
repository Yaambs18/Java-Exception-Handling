package com.exceptionhandling;

import java.util.Random;

public class ErrorHandler {
    public static void main(String[] args) {
        int a=0, b=0, c=0;
        Random num = new Random();

        for(int i=0;i<32000;i++){
            try{
                b = num.nextInt();
                c = num.nextInt();
                a = 12345/(b/c);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Division by zero.");
                a=0;
            }
            System.out.println("a: "+a);
        }
    }
}
