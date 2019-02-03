package com.polaris.he.framework.entity.user;

import lombok.*;

/**
 * User: hexie
 * Date: 2019-01-27 20:09
 * Description:
 */
@Setter
@Getter
@ToString
public class UserInfo {

    private String source;

    private String openId;

    private String name;

    private String avatar;
}