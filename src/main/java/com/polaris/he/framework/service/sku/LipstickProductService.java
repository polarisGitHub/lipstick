package com.polaris.he.framework.service.sku;

import com.polaris.he.lipstick.entity.LipstickListItem;
import com.polaris.he.framework.entity.sku.BaseSkuInfo;
import com.polaris.he.framework.entity.sku.Brand;
import com.polaris.he.framework.entity.sku.Category;

import java.util.List;

/**
 * User: hexie
 * Date: 2018-12-16 20:42
 * Description:
 */
public interface LipstickProductService {

    /**
     * @return
     */
    List<Brand> getBrands();

    /**
     * @param code
     * @return
     */
    Brand getBrand(String code);

    /**
     * @param code
     * @return
     */
    Category getCategory(String code);

    /**
     * @param brandCodes
     * @return
     */
    List<Category> getCategories(List<String> brandCodes);

    /**
     *
     * @param skuCode
     * @return
     */
    LipstickListItem getBySkuCode(BaseSkuInfo sku);
}