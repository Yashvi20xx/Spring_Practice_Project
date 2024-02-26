package com.springcore.ref;

public class A
{

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public B getObj() {
        return obj;
    }

    public void setObj(B obj) {
        this.obj = obj;
    }

    public A(int x, B obj) {
        X = x;
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "A{" +"X=" + X +", obj=" + obj +'}';
    }

    private int X;
    private B obj;
}
