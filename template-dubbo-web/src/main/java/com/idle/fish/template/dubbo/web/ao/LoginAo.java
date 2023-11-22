package com.idle.fish.template.dubbo.web.ao;

import com.idle.fish.tamplate.basic.user.BasicUser;
import com.idle.fish.template.basic.login.service.LoginService;
import com.idle.fish.template.dubbo.api.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author idle fish
 * @since 2023/11/22
 */
@Service
public class LoginAo implements LoginService {

    @Resource
    private UserService userService;

    @Override
    public BasicUser loginByUsernamePassword(String username, String password) {
        return userService.detail(1L);
    }
}
