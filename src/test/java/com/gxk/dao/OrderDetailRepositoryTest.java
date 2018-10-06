package com.gxk.dao;

import com.gxk.POJO.OrderDetail;
import org.aspectj.weaver.ast.Or;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void save() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12345679");
        orderDetail.setOrderId("1234567");
        orderDetail.setProductId("1234");
        orderDetail.setProductName("饼干");
        orderDetail.setProductPrice(new BigDecimal(6.9));
        orderDetail.setProductQuantity(20);
        orderDetail.setProductIcon("http://xxxxx.jpg");

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrderId("123456");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}