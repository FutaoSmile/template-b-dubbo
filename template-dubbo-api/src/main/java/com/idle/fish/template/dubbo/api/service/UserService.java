package com.idle.fish.template.dubbo.api.service;

import com.idle.fish.template.dubbo.api.dto.UserDto;

/**
 * 用户
 *
 * @author idle fish
 * @since 2023/11/22
 */
public interface UserService {
    /**
     * 通过id查询用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    UserDto detail(Long id);
}
