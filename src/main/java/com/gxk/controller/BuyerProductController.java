package com.gxk.controller;

import com.gxk.POJO.ProductCategory;
import com.gxk.POJO.ProductInfo;
import com.gxk.VO.ProductInfoVO;
import com.gxk.VO.ProductVO;
import com.gxk.VO.ResultVO;
import com.gxk.service.CategoryService;
import com.gxk.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list() {
        //1.查询所有上架产品
        List<ProductInfo> productInfoList = productService.findUpAll();
        //2.查询类目（一次性查询）
        //精简方法，Java8 lambda,获取所有类目编号
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType()).collect(Collectors.toList());
        List<ProductCategory> productCategorieList = categoryService.findByCategoryTypeIn(categoryTypeList);
        //3.数据拼装








        ResultVO resultVO = new ResultVO();
        ProductVO productVO = new ProductVO();
        ProductInfoVO productInfoVO = new ProductInfoVO();

        productVO.setProductVOList(Arrays.asList(productInfoVO));

        resultVO.setData(Arrays.asList(productVO));
        resultVO.setCode(0);
        resultVO.setMsg("成功");

        return resultVO;
    }
}
