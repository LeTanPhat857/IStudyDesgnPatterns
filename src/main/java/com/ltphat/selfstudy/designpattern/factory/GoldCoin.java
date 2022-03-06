package com.ltphat.selfstudy.designpattern.factory;

public class GoldCoin implements Coin {
    static final String DESCRIPTION = "This is a gold coin.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
