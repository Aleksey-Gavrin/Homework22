package pro.sky.Homework22.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (HttpStatus.BAD_REQUEST)
public class DivisionByZeroException extends IllegalArgumentException {

    public DivisionByZeroException() {
    }

    public DivisionByZeroException(String s) {
        super(s);
    }

    public DivisionByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivisionByZeroException(Throwable cause) {
        super(cause);
    }
}
