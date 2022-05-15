package com.trader.common.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.trader.common.enums.config.EnumInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderByType implements EnumInterface {

    ASC("asc", "오름차순"),
    DESC("desc", "내림차순");

    private String type;
    private String name;

    public static OrderByType find(String type) {
        return EnumInterface.find(type, values());
    }

    @JsonCreator
    public static OrderByType findToNull(String type) {
        return EnumInterface.findToNull(type, values());
    }
}
