package com.jt.dubbo.provider.service;

import com.jt.dubbo.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author calvin.xia
 * @create 2023/10/11 16:07
 * @Description
 */
@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
