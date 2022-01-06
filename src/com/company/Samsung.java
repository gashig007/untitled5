package com.company;

public class Samsung extends Phone {
    private String model;

    public Samsung(String model) {
        this.model = model;
    }

    @Override
    public String print() {
        System.out.println(model);
        return model;
    }
}
