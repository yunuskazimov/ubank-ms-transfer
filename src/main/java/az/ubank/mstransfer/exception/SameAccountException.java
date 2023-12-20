package az.ubank.mstransfer.exception;

import lombok.Getter;

@Getter
public class SameAccountException extends RuntimeException {
    private final String code;
    private final String message;

    public SameAccountException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public SameAccountException(String message) {
        super(message);
        this.code = null;
        this.message = message;
    }

    public static SameAccountException of(String errorCode, String errorMessage) {
        return new SameAccountException(errorCode, errorMessage);
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
