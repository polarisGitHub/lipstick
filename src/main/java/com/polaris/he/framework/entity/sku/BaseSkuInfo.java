package com.polaris.he.framework.entity.sku;

import com.polaris.he.framework.annotation.Encryption;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * User: hexie
 * Date: 2019-01-27 22:16
 * Description:
 */
@Getter
@Setter
@ToString
public class BaseSkuInfo {

    @Encryption
    private String brandCode;

    transient private String type; // 具体type具体业务关心，不在接口返回

    @Encryption
    private String skuCode;
}