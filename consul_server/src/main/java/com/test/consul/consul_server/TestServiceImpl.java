package com.test.consul.consul_server;

import com.test.consul.consul_common.TestService1;
import org.apache.dubbo.config.annotation.Service;

/**
 * create by lishijun1 on 2019-08-01 21:30
 * email is lishijun1@jd.com
 */
@Service
public class TestServiceImpl implements TestService1 {
    @Override
    public String hello(String input) {
        return " haha====cccccc===="+input;
    }

//    @Override
//    public String echo(String value) {
//        return "Hello, "+ value;
//    }
//
//    @Override
//    public String echo(String value, long time) {
//        return "Hello, "+ value+" "+ new Date(time);
//    }
}
