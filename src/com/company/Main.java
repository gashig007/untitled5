package com.company;

import java.util.Random;

public class Main {

    public static void main (String[] args) {
        Phone phone [] = {createObject(1), createObject(2), createObject(3), createObject(4)};
        for (int i = 0; i < phone.length; i++) {
            if(i < phone.length && phone[i] instanceof Printable) {
                phone[i].print();
            }
        }
    }

    public static Phone createObject(int Phone){
        Random a = new Random();
        int b = a.nextInt(10);
        switch (Phone) {
            case 1:
                Nokia nokia = new Nokia(b,"Good");
                return nokia;
            case 2:
                Iphone iphone = new Iphone(b, "Google");
                return iphone;
            case 3:
                Samsung samsung = new Samsung(b, "Samsung S8");
                return samsung;
        }
        Nokia nokia = new Nokia(b,"Good");Iphone iphone = new Iphone(b,"Google");
        Samsung samsung = new Samsung(b, "Samsung S8");

        Phone phone [] = {nokia, iphone, samsung};
        return null;
    }
}
