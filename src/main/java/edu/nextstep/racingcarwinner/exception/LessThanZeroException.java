package edu.nextstep.racingcarwinner.exception;

public class LessThanZeroException extends RuntimeException {
    public LessThanZeroException() {
        super();
    }

    public LessThanZeroException(String message) {
        super(message);
    }

    public LessThanZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public LessThanZeroException(Throwable cause) {
        super(cause);
    }

    protected LessThanZeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
