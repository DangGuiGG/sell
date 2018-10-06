package com.gxk.DTO;

import com.gxk.POJO.OrderDetail;
import com.gxk.enums.OrderStatusEnum;
import com.gxk.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 数据传输对象
 */
@Data
public class OrderDTO {

    /** 订单ID */
    private String orderId;

    /** 买家名字 */
    private String buyerName;

    /** 买家联系方式 */
    private String buyerPhone;

    /** 买家地址 */
    private String buyerAddress;

    /** 买家微信OpenID */
    private String buyerOpenid;

    /** 订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态,默认为0新下单 */
    private Integer orderStatus;

    /** 支付状态,默认为0未支付 */
    private Integer payStatus;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;

    /*用户订单列*/
    List<OrderDetail> orderDetailList;
}
