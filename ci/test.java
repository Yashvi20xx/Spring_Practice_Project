package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test
{

    public static void main(String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/ci/CiConfig.xml");
        Person P = (Person) context.getBean("cibean");
        System.out.println(P);
    }
}
