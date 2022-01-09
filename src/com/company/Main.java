package com.company;

import java.util.Random;

public class Main {

    public static void main (String[] args) {
        Phone phone [] = {createObject(1), createObject(2), createObject(3)};
        for (int i = 0; i < phone.length; i++) {
            if(i < phone.length && phone[i] instanceof Printable) {
                phone[i].print();
            }
        }
    }

    public static Phone createObject(int Phone){
        Random a = new Random();
        int b = a.nextInt(10);
        Nokia nokia = new Nokia("Nokia","Good");
        Iphone iphone = new Iphone("Iphone", "Google");
        Samsung samsung = new Samsung("Samsung", "Samsung S8");
        switch (Phone) {
            case 1:
                return nokia;
            case 2:
                return iphone;
            case 3:
                return samsung;
        }
        Phone phone [] = {nokia, iphone, samsung};
        return null;
    }
}
