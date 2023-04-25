package com.racerssquad.besthack2023.exceptions;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String username) {
        super(username + " has wrong password.");
    }
}
