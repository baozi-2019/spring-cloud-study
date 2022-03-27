package org.baozi.common.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.baozi.common.enums.ResponseCodeEnum;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "公共相应体")
public class Response<T> implements Serializable {
    private static final long serialVersionUID = 8347469064404111488L;

    @ApiModelProperty(name = "响应数据")
    private T responseData;

    @ApiModelProperty(name = "响应码")
    private int code;

    @ApiModelProperty(name = "响应错误信息")
    private String errorMessage;

    public static <T> Response<T> success(T responseData) {
        return new Response<>(responseData, ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getErrorMessage());
    }

    public static <T> Response<T> success() {
        return success(null);
    }

    public static <T> Response<T> error(T responseData, ResponseCodeEnum responseCodeEnum, String errorMessage) {
        return new Response<>(responseData, responseCodeEnum.getCode(), errorMessage);
    }

    public static <T> Response<T> error(T responseData, ResponseCodeEnum responseCodeEnum) {
        return error(responseData, responseCodeEnum, responseCodeEnum.getErrorMessage());
    }

    public static <T> Response<T> error(ResponseCodeEnum responseCodeEnum) {
        return new Response<>(null, responseCodeEnum.getCode(), responseCodeEnum.getErrorMessage());
    }

    public static <T> Response<T> error(ResponseCodeEnum responseCodeEnum, String errorMessage) {
        return new Response<>(null, responseCodeEnum.getCode(), errorMessage);
    }

    public T getResponseData() {
        return responseData;
    }

    public void setResponseData(T responseData) {
        this.responseData = responseData;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
