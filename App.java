package com.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =  new ClassPathXmlApplicationContext("file:src/main/java/Config.xml");
        Student student1 = (Student) context.getBean("Student1");
        System.out.println(student1);

    }
}