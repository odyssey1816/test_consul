package com.test.consul.consul_client;


import com.test.consul.consul_common.TestService1;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by lishijun1 on 2019-08-02 11:55
 * email is lishijun1@jd.com
 */
@RestController
@RequestMapping("/api")
public class TestController {

    @Reference(check = false,async = false)
    TestService1 testService;

    @RequestMapping(value = "/sayhello",method = RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return testService.hello(name);
    }

}
