package com.polaris.he.lipstick.service.favorites;

import com.polaris.he.lipstick.entity.favorites.FavoriteItem;
import com.polaris.he.lipstick.entity.sku.BaseSkuInfo;
import com.polaris.he.lipstick.entity.user.UserInfo;

import java.util.List;

/**
 * User: hexie
 * Date: 2019-01-27 22:01
 * Description:
 */
public interface FavoritesService {

    /**
     * @param sku
     * @param user
     */
    void save(BaseSkuInfo sku, UserInfo user);

    /**
     * @param id
     * @param user
     */
    void delete(Long id, UserInfo user);

    /**
     * @param user
     */
    List<FavoriteItem> query(UserInfo user);
}