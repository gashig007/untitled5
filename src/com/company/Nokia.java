package com.company;

public class Nokia extends Phone{
    private String phoneMemory;

    public Nokia(String phoneMemory) {
        this.phoneMemory = phoneMemory;
    }

    @Override
    public String print() {
        System.out.println(phoneMemory);
        return phoneMemory;
    }
}
