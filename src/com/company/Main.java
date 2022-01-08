package com.company;

public class Main {

    public static void main (String[] args) {
        createObject("Nokia");
        createObject("Samsung");
        createObject("Iphone");
    }

    public static String createObject(String className){
        Nokia nokia = new Nokia("Good");
        Samsung samsung = new Samsung("Samsung x6");
        Iphone iphone = new Iphone("Iphone x10pro");
        switch (className){
            case "Nokia":
                return "Nokia: " + nokia.print();
            case "Samsung":
                return "Samsung: " + samsung.print();
            case "Iphone":
                return "Iphone: " + iphone.print();
        }
        return className;

    }
}
