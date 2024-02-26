package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp
{


    private String name;
    private List<String> phones;
    private Set<String> Address;
    private Map<String, String> courses;

    public Emp(String s, String s2, String s23, String s234)
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddress() {
        return Address;
    }

    public void setAddress(Set<String> address) {
        Address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Emp() {
        this.name = name;
        this.phones = phones;
        this.Address = Address;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", Address=" + Address +
                ", courses=" + courses +
                '}';
    }

}
