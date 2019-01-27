package com.polaris.he.lipstick.service.sku;

import com.polaris.he.lipstick.entity.sku.LipstickListItem;

import java.util.List;

/**
 * User: hexie
 * Date: 2019-01-05 21:51
 * Description:
 */
public interface LipstickSearchService {

    List<LipstickListItem> search(List<String> brandCodes, List<String> categories, String colorNo);
}