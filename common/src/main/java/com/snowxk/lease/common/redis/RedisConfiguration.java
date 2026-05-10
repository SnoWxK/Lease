package com.snowxk.lease.common.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

@Configuration
public class RedisConfiguration {

    @Bean
    public RedisTemplate<String, Object> stringObjectRedisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<String, Object> tmplate = new RedisTemplate<>();
        tmplate.setConnectionFactory(redisConnectionFactory);
        tmplate.setKeySerializer(RedisSerializer.string());
        tmplate.setValueSerializer(RedisSerializer.java());
        return tmplate;
    }
}
