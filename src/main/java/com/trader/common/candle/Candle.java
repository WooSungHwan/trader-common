package com.trader.common.candle;

import com.trader.common.utils.NumberUtils;

public interface Candle {

    Double getTradePrice();

    Double getOpeningPrice();

    Double getLowPrice();

    Double getHighPrice();

    default boolean isBetween(Candle before) {
        return NumberUtils.between(before.getTradePrice(), before.getOpeningPrice(), this.getTradePrice());
    }
}
