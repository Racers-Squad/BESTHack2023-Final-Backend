package com.racerssquad.besthack2023.exceptions;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String email) {
        super("User with " + email + " email not found.");
    }
}