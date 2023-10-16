package com.jt.dubbo.consumer.service;

import com.jt.dubbo.api.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author calvin.xia
 * @create 2023/10/11 16:10
 * @Description
 */
@Service
public class DemoConsumer {

    private DemoService demoService;

    public String sayHello() {
        return demoService.sayHello("张三");
    }

}
