package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example
{
    private String subject;

    public Example() {
        super();
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @PostConstruct
    public void start()
    {
        System.out.println("Project starting point.");
    }
    @PreDestroy
    public void end()
    {
        System.out.println("Project ending point.");
    }
}
