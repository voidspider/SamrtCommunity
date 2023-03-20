package com.example.sc_test.pojo;

import java.util.Objects;

public class TestObject {
    String s1;
    String s2;
    int i1;
    int i2;

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public int getI2() {
        return i2;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObject that = (TestObject) o;
        return getI1() == that.getI1() && getI2() == that.getI2() && Objects.equals(getS1(), that.getS1()) && Objects.equals(getS2(), that.getS2());
    }


    public TestObject(String s1, String s2, int i1, int i2) {
        this.s1 = s1;
        this.s2 = s2;
        this.i1 = i1;
        this.i2 = i2;
    }

    public TestObject() {
    }

}
