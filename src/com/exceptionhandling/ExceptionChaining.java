package com.exceptionhandling;

public class ExceptionChaining {
    static void demoMethod(){
        NullPointerException e = new NullPointerException("top layer");

        e.initCause(new ArithmeticException("cause"));

        throw e;
    }

    public static void main(String[] args) {
        try{
            demoMethod();
        }
        catch (NullPointerException e){
            System.out.println("Caught: "+e);

            System.out.println("Original cause: "+e.getCause());
        }
    }
}
