package Exceptions;

public class InvalidPlayerInputException extends RuntimeException{
    public InvalidPlayerInputException(String message) {
        super(message);
    }
}
