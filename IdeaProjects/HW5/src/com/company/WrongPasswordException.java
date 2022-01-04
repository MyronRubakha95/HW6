package com.company;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(String massage) {
        super(massage);
    }
}
