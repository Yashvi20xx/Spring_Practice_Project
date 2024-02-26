package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp
{
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +"address=" + address +'}';
    }

    public Emp(Address address) {
        this.address = address;
    }

    public Emp()
    {
        super();
    }
    @Autowired
    private Address address;
}
