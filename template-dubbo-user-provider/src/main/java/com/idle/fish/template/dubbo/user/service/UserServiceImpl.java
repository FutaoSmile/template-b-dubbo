package com.idle.fish.template.dubbo.user.service;

import com.idle.fish.tamplate.basic.user.CurrentUser;
import com.idle.fish.tamplate.basic.user.enums.UserRoleEnum;
import com.idle.fish.template.dubbo.api.dto.UserDto;
import com.idle.fish.template.dubbo.api.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author idle fish
 * @since 2023/11/22
 */
@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public UserDto detail(Long id) {
        log.info("current user  :{}", CurrentUser.getUser());
        UserDto userDto = new UserDto();
        userDto.setUsername("ldk");
        userDto.setRole(UserRoleEnum.NORMAL_USER.getRole());
        userDto.setId(1L);
        return userDto;
    }
}
