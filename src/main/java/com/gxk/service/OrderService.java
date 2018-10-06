package com.gxk.service;

import com.gxk.DTO.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {

    /** 创建订单 */
    OrderDTO create(OrderDTO orderDTO);

    /** 查询单个订单 */
    OrderDTO findOne(String orderId);

    /** 查询订单状态 */
    Page<OrderDTO> findList(String buyerOpenId, Pageable pageable);

    /** 取消订单 */
    OrderDTO cancel(OrderDTO orderDTO);

    /** 完结订单 */
    OrderDTO finish(OrderDTO orderDTO);

    /** 支付订单 */
    OrderDTO paid(OrderDTO orderDTO);

}
