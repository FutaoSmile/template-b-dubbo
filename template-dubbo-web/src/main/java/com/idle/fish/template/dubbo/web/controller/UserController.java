package com.idle.fish.template.dubbo.web.controller;

import com.idle.fish.tamplate.basic.user.enums.UserRoleEnum;
import com.idle.fish.template.basic.exception.LogicException;
import com.idle.fish.template.basic.login.annotations.LoginRequire;
import com.idle.fish.template.dubbo.api.dto.UserDto;
import com.idle.fish.template.dubbo.web.ao.UserAo;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author idle fish
 * @since 2023/11/22
 */
@LoginRequire(requireRoles = UserRoleEnum.ADMIN)
@RequestMapping("/user")
@RestController
@Validated
public class UserController {

    @Resource
    private UserAo userAo;

    @GetMapping("/detail/{id}")
    public UserDto getUserById(@PathVariable("id") Long id) {
        return userAo.detail(id);
    }


    @GetMapping("/exception")
    public void exception() {
        throw LogicException.le("奇怪的事情发生了");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationUtils.getAnnotation(UserController.class.getMethod("exception"), LoginRequire.class);
    }
}
