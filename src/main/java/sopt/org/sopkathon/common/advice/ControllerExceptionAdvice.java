package sopt.org.sopkathon.common.advice;

import java.util.Objects;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import sopt.org.sopkathon.common.dto.ApiResponse;
import sopt.org.sopkathon.exception.model.SoptException;
import sopt.org.sopkathon.exception.Error;

@RestControllerAdvice
public class ControllerExceptionAdvice {

    /**
     * 400 BAD_REQUEST
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ApiResponse handleMethodArgumentNotValidException(final MethodArgumentNotValidException e) {
        FieldError fieldError = Objects.requireNonNull(e.getFieldError());
        return ApiResponse.error(Error.REQUEST_VALIDATION_EXCEPTION, String.format("%s는 %s", fieldError.getField(), fieldError.getDefaultMessage()));
    }

    /**
     * 500 Internal Server
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    protected ApiResponse<Object> handleException(final Exception e) {
        System.out.println(e.getMessage());
        return ApiResponse.error(Error.INTERNAL_SERVER_ERROR);
    }

    /**
     * Sopt custom error
     */
    @ExceptionHandler(SoptException.class)
    protected ResponseEntity<ApiResponse> handleSoptException(SoptException e) {
        return ResponseEntity.status(e.getHttpStatus())
                .body(ApiResponse.error(e.getError(), e.getMessage()));
    }
}
