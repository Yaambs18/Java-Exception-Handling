package com.exceptionhandling;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}

public class CustomException {

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("age is not valid to vote");
        } else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (InvalidAgeException exception) {
            System.out.println("Caught the exception");
            System.out.println("Exception occured: " + exception.getMessage());
        }

        System.out.println("rest of the code...");
    }
}
