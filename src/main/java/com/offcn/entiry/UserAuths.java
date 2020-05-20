package com.offcn.entiry;

import lombok.Data;

import java.io.Serializable;

/**
 * user_auths
 *
 * @author
 */
@Data
public class UserAuths implements Serializable {
    /**
     * 用户权限id
     */
    private String id;
    private String userId;

    /**
     * 登录类型（手机号 邮箱 用户名）或第三方应用名称（微信 微博等）
     */
    private String identityType;

    /**
     * 标识（手机号 邮箱 用户名或第三方应用的唯一标识）
     */
    private String identifier;

    /**
     * 密码凭证（站内的保存密码，站外的不保存或保存token）
     */
    private String credential;

    /**
     * 是否为token方式登录
     */
    private Integer isTokenType;

    private static final long serialVersionUID = 1L;
}