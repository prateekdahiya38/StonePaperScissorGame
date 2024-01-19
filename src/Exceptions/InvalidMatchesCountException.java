package Exceptions;

public class InvalidMatchesCountException extends RuntimeException{
    public InvalidMatchesCountException(String message) {
        super(message);
    }
}
