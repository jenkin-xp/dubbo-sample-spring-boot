package com.jt.dubbo.consumer;

import com.jt.dubbo.consumer.service.DemoConsumer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DubboConsumerApplicationTests {

    @Autowired
    private DemoConsumer demoConsumer;

    @Test
    public void testDemo() {
        String s = demoConsumer.sayHello();
        System.out.println(s);
    }

}
