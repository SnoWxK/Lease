package com.snowxk.lease.common.utils;

import java.util.Random;

public class CodeUtil {
    public static String getRandomCode(Integer length) {
        return "123456";
//        由于阿里云短信认证不对个人开放，直接修改验证码为固定值
//        StringBuilder builder = new StringBuilder();
//        Random random = new Random();
//        for (int i = 0; i < length; i++) {
//            StringBuilder num = builder.append(random.nextInt(10));
//            builder.append(num);
//        }
//        return builder.toString();
    }
}
