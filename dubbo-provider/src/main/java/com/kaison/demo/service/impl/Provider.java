package com.kaison.demo.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * User: kaison
 * Date: 2018/4/19
 * Time: 15:22
 * Description:
 */
public class Provider {
    public static void main(String args[]) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();

    }
}
