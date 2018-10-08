package com.gxk.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * http请求返回给最外层对象
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)//不按返回Json中数值为NULL的属性值
public class ResultVO<T> {

    /**错误码 0成功1不成功*/
    private Integer code;

    /**提示信息*/
    private String msg;

    /**具体内容*/
    private T data;
}
