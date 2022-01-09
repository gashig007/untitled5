package com.company;

public class Iphone extends Phone{
    private String annexes;

    public Iphone(int memory, String annexes) {
        super(memory);
        this.annexes = annexes;
    }

    @Override
    public void print() {
        System.out.println("Phone: " + "Iphone" + "\nAnnexes: " + annexes);
    }
}
