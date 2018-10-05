package com.gxk.enums;

import lombok.Getter;

/**
 * 支付状态
 */
@Getter
public enum PayStatusEnum {

    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功")
    ;

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String msessage) {
        this.code = code;
        this.message = msessage;
    }
}
