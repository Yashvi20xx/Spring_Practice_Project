package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean
{
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +"price=" + price +'}';
    }

    public Pepsi() {
        super();
    }

    private double price;

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("init auto initializing.");
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("destroy auto initializing.");
    }
}
