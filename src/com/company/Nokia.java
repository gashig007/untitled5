package com.company;

public class Nokia extends Phone{
    private String phoneMemory;

    public Nokia(int memory, String phoneMemory) {
        super(memory);
        this.phoneMemory = phoneMemory;
    }

    @Override
    public void print() {
        System.out.println("Phone: " + "Nokia" + "\nPhone memory: " + phoneMemory);
    }
}
