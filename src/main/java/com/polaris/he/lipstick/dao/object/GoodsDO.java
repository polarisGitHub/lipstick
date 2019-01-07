package com.polaris.he.lipstick.dao.object;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * User: hexie
 * Date: 2019-01-05 22:31
 * Description:
 */
@Getter
@Setter
@ToString
public class GoodsDO extends BaseDO {

    private Long id;

    private String brandCode;

    private String goodsCode;

    private String goodsName;

    private String illustration;

    private String url;
}