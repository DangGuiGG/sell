package com.gxk.POJO;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

/**
 * 类目
 * 驼峰自动映射  product_category如果不同则使用
 * @Table(name = "...")
 */
@Entity
@Data //@Getter @Setter @ToString
@DynamicUpdate//动态更新
public class ProductCategory {

    /**类目ID*/
    @Id
    @GeneratedValue
    private Integer categoryId;
    /**类目名称*/
    private String categoryName;
    /**类目编号*/
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
