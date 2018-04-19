package com.kaison.demo.consumer;

import com.kaison.demo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: kaison
 * Date: 2018/4/19
 * Time: 15:41
 * Description:
 */
public class Consumer {

    private DemoService demoService;

    public static void main(String args[]){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));

    }
}
