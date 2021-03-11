package com.itstep.restserver.exception;

public class UserException extends RuntimeException {

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }
}
