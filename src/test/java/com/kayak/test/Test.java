package com.kayak.test;

import com.kayak.ssm.bean.Flower;
import com.kayak.ssm.service.FlowerService;
import org.junit.After;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.kayak.test
 * @Description: java类作用描述
 * @Author: yangshuai
 * @CreateDate: 2022/6/13 16:51
 * @Version 1.0
 */
public class Test {
    private BeanFactory beanFactory;
    @org.junit.Before
    public void before(){
        beanFactory= new ClassPathXmlApplicationContext("classpath:spring\\applicationContext.xml");
    }
    @org.junit.Test
    public void test1(){
        FlowerService flowerService = (FlowerService) beanFactory.getBean("FlowerService");
        List<Flower> flowers = flowerService.queryAll();
        System.out.println(flowers);
    }
    @After
    public void after(){
        ((ClassPathXmlApplicationContext) beanFactory).close();
    }
}
