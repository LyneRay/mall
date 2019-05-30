package com.dream.mall.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "redis")
public class RedisConfig {
    private String host;
    private int port;
    /**
     * 超时，单位：秒。
     */
    private String password;
    private int timeout;
    private int poolMaxTotal;
    private int poolMaxIdle;
    /**
     * 最大等待时间，单位：秒。
     */
    private int poolMaxWait;

}
