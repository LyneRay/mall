package com.dream.mall.service;

/**
 * 接口扩展类
 */
public interface KeyPrefix {
    public int expireSeconds();
    public String getPrefix();
}
