package com.ltphat.selfstudy.designpattern.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoinFactoryTest {

    @Test
    void getCoin_getGoldCoinSuccessful_shouldReturnCoinInstance() {
        Coin coin = CoinFactory.getCoin(CoinType.GOLD);
        Assertions.assertEquals("This is a gold coin.", coin.getDescription());
    }

    @Test
    void getCoin_getCopperCoinSuccessful_shouldReturnCoinInstance() {
        Coin coin = CoinFactory.getCoin(CoinType.COPPER);
        Assertions.assertEquals("This is a copper coin.", coin.getDescription());
    }
}