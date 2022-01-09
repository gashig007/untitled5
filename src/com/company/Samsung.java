package com.company;

public class Samsung extends Phone {
    private String model;

    public Samsung(int memory, String model) {
        super(memory);
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Phone: " + "Samsung" + "\nModel: " + model);
    }
}
