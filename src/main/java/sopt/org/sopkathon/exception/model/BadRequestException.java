package sopt.org.sopkathon.exception.model;

import sopt.org.sopkathon.exception.Error;

public class BadRequestException extends SoptException {
    public BadRequestException(Error error, String message) {
        super(error, message);
    }
}