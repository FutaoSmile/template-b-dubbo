package com.idle.fish.template.dubbo.user.service;

import com.idle.fish.template.dubbo.api.dto.UserDto;
import com.idle.fish.template.dubbo.api.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author idle fish
 * @since 2023/11/22
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public UserDto detail(Long id) {
        return new UserDto();
    }
}
