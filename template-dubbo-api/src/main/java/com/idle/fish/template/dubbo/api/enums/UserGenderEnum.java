package com.idle.fish.template.dubbo.api.enums;

import com.idle.fish.template.basic.util.enums.IEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 用户性别
 *
 * @author idle fish
 * @since 2023/11/22
 */
@Getter
@AllArgsConstructor
public enum UserGenderEnum implements IEnum<Integer> {
    /**
     * 0=未知
     */
    UN_KNOW(0, "未知"),
    /**
     * 1=男
     */
    MALE(1, "男"),
    /**
     * 2=女
     */
    FEMALE(2, "女");

    private final int gender;
    private final String desc;

    @Override
    public Integer logicValue() {
        return gender;
    }
}
