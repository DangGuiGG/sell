package com.gxk.service;

import com.gxk.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    /*根据商品类目查找符合条件的商品*/
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /*增加和更新*/
    ProductCategory save(ProductCategory productCategory);
}
