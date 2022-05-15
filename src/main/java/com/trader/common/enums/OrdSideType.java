package com.trader.common.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.trader.common.enums.config.EnumInterface;
import com.trader.common.enums.config.EnumInterfaceConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrdSideType implements EnumInterface {

    ASK("ask", "매도"),
    BID("bid", "매수");

    private String type;
    private String name;

    public static OrdSideType find(String type) {
        return EnumInterface.find(type, values());
    }

    @JsonCreator
    public static OrdSideType findToNull(String type) {
        return EnumInterface.findToNull(type, values());
    }

    @javax.persistence.Converter(autoApply = true)
    public static class Converter extends EnumInterfaceConverter<OrdSideType> {
        public Converter() {
            super(OrdSideType.class);
        }
    }
}
