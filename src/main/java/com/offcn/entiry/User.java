package com.offcn.entiry;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

/**
 * user
 *
 * @author
 */
@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    @Id
    private String id;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户头像地址
     */
    private String avatar;


    private List<UserAuths> userAuthsList;

    private static final long serialVersionUID = 1L;

}