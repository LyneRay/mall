package com.dream.mall.service.impl;

import com.dream.mall.service.KeyPrefix;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class BasePrefix implements KeyPrefix {
    private int expireSeconds;
    private String prefix;

    public BasePrefix(String prefix) {
        //0代表永不过期
        this(0,prefix);
    }

    @Override
    public int expireSeconds(){
        return expireSeconds;
    }

    @Override
    public String getPrefix() {
        String className = getClass().getSimpleName();
        return className+":"+prefix;
    }
}

