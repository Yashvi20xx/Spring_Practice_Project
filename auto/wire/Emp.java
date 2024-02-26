package com.springcore.auto.wire;

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

    private Address address;
}
