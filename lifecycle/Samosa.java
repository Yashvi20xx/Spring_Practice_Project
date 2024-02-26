package com.springcore.lifecycle;

public class Samosa
{
    public double getPrice() {
        System.out.println("Getting price.");
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price.");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +"price=" + price +'}';
    }

    public Samosa() {
        super();
    }

    private double price;
    public void init()
    {
        System.out.println("In Init method.");
    }
    public void destroy()
    {
        System.out.println("In destroy method.");
    }

}
