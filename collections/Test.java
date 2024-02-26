package com.springcore.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test
{
    public static void main(String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/collections/CollectionConfig.xml");
        Emp emp1 = (Emp) context.getBean("emp1");
        System.out.println(emp1.getName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getAddress());
        System.out.println(emp1.getCourses());
    }
}
