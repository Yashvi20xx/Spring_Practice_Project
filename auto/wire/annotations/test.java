package com.springcore.auto.wire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(("file:src/main/java/com/springcore/auto/wire/annotations/Config.xml"));
        Emp e1 =context.getBean("e1", Emp.class);
        System.out.println(e1);
    }
}