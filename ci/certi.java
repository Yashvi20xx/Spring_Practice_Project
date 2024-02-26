package com.springcore.ci;

public class certi
{
    String name;
    public String getCerti() {
        return certi;
    }

    public void setCerti(String certi) {
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "certi{" + "certi='" + certi + '\'' +'}';
    }

    public certi(String name)
    {
        super();
        this.name = name;
    }

    String certi;
}
