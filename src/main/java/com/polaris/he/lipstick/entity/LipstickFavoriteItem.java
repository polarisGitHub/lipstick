package com.polaris.he.lipstick.entity;

import com.polaris.he.framework.annotation.Encryption;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * User: hexie
 * Date: 2019-02-01 23:09
 * Description:
 */
@Getter
@Setter
@ToString
public class LipstickFavoriteItem{

    @Encryption
    private Long id;

    private String brandCode;

    private String brandName;

    @Encryption
    private String goodsCode;

    private String goodsName;

    @Encryption
    private String skuCode;

    private String skuName;

    private String color;

    private String color1;

    private String colorNo;

    private List<String> images;
}