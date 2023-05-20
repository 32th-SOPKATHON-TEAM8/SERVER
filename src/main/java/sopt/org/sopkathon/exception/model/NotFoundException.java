package sopt.org.sopkathon.exception.model;

import sopt.org.sopkathon.exception.Error;

public class NotFoundException extends SoptException {
    public NotFoundException(Error error, String message) {
        super(error, message);
    }
}
