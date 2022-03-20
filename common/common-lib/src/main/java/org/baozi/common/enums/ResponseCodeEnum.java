package org.baozi.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCodeEnum {
    SUCCESS(2000, null),
    PARAM_ERROR(5001, "参数错误");

    private final int code;
    private final String errorMessage;
}
