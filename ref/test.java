package com.springcore.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class test
{
    public static void main(String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/ref/RefConfig.xml");
        A temp = (A) context.getBean("aref");
        System.out.println(temp.getX());
        System.out.println(temp.getObj().getY());
    }
}
