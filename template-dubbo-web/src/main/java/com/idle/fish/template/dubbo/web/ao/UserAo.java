package com.idle.fish.template.dubbo.web.ao;

import com.idle.fish.template.dubbo.api.dto.UserDto;
import com.idle.fish.template.dubbo.api.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author idle fish
 * @since 2023/11/22
 */
@Service
public class UserAo {
    @Resource
    private UserService userService;

    public UserDto detail(Long id) {
        return userService.detail(id);
    }
}
