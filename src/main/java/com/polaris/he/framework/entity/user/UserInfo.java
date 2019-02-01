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
@RequiredArgsConstructor
public class UserInfo {

    @NonNull
    private String source;

    @NonNull
    private String openId;
}