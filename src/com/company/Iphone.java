package com.company;

public class Iphone extends Phone{
    private String annexes;

    public Iphone(String name, String annexes) {
        super(name);
        this.annexes = annexes;
    }

    @Override
    public void print() {
        System.out.println("Phone: " + "Iphone" + "\nAnnexes: " + annexes);
    }
}
