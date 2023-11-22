package com.idle.fish.template.dubbo.api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.idle.fish.tamplate.basic.user.BasicUser;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户
 *
 * @author idle fish
 * @since 2023/11/22
 */
@Getter
@Setter
@TableName("user")
public class UserEntity extends BasicUser {

    /**
     * 性别
     *
     * @see com.idle.fish.template.dubbo.api.enums.UserGenderEnum
     */
    private Integer gender;
}
