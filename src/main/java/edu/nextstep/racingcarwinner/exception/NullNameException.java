package edu.nextstep.racingcarwinner.exception;

public class NullNameException extends IllegalArgumentException {
    public NullNameException() {
        super();
    }

    public NullNameException(String s) {
        super(s);
    }

    public NullNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullNameException(Throwable cause) {
        super(cause);
    }
}
