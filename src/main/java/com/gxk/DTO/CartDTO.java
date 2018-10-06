package com.gxk.DTO;

import lombok.Data;
import org.omg.PortableInterceptor.INACTIVE;

@Data
public class CartDTO {

    /**商品Id*/
    private String productId;

    /**数量*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

}
