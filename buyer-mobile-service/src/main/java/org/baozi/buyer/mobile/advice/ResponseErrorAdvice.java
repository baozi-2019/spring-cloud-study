package org.baozi.buyer.mobile.advice;

import org.baozi.common.bean.Response;
import org.baozi.common.enums.ResponseCodeEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResponseErrorAdvice {
    @ExceptionHandler(RuntimeException.class)
    public Response<Object> handleRuntimeException(RuntimeException e) {
        return Response.error(ResponseCodeEnum.TIME_OUT);
    }
}
