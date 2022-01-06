package com.company;

public class Iphone extends Phone{
    private String annexes;

    public Iphone(String annexes) {
        this.annexes = annexes;
    }

    @Override
    public String print() {
        System.out.println(annexes);
        return annexes;
    }
}
