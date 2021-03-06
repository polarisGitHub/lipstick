package com.polaris.he.lipstick.entity;

import com.polaris.he.framework.annotation.Encryption;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * User: hexie
 * Date: 2019-01-05 21:33
 * Description:
 */
@Setter
@Getter
@ToString(callSuper = true)
public class LipstickListItem extends LipstickItem{

    @Encryption
    private Long id;

    private String figure;
}