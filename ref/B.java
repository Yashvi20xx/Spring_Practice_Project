package com.springcore.ref;

public class B
{
    public B(String s)
    {
        super();
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public B(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "B{" + "y=" + y + '}';
    }

    private int y;

}
