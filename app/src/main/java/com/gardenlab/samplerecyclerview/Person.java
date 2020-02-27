package com.gardenlab.samplerecyclerview;

public class Person {
    String name;
    String mobile;

    public Person() {
        this.name = "JW";
        this.mobile = "010-0101-0101";
    }

    public Person(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
