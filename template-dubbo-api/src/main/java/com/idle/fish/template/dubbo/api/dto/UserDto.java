package com.idle.fish.template.dubbo.api.dto;

import com.idle.fish.template.dubbo.api.entity.UserEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author idle fish
 * @since 2023/11/22
 */
@Getter
@Setter
public class UserDto extends UserEntity implements Serializable {
}
