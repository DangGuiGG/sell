package com.gxk.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gxk.POJO.ProductInfo;
import lombok.Data;

import java.util.List;

@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer ctegoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productVOList;
}
